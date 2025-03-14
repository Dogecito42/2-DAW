
//Las variables que almacenan la longitud de los lados del triángulo cada vez que se llama a la función de toma de datos
var lado1;
var lado2;
var lado3;


//Variable que cuenta el triángulo que se está pidiendo sus datos (Se inicializa a 1 pues se sigue orden 1-4)
var cont = 1;

//Variable que almacena el texto de todos los triángulos, para luego mostrarlo como parte de la página, y que indica el numero de triángulos analizados
var texto = "<center>";
var num = 4;

//Variables que almacena la cantidad de triángulos de cada tipo introducidos
var equi = 0;
var isos = 0;
var esca = 0;

for (var i = 0; i < num; i++) {
    tomaDatos(cont);
    clasificacion(cont);
}

comparacion();

//Para cerrar la etiqueta de centralización de texto y muestra toda la información
texto += "</center>";
document.getElementById("texto").innerHTML = texto;


//Método que pide los datos al usuario, con el criterio de reglas establecido
function tomaDatos(i) {

    /*Este bucle va a pedir la longitud de los triángulos, pasarlos a Float (por si se introducen números decimales) y verificar que sigue el formato establecido (números naturales
    mayores de 0, donde la suma de los catetos es siempre mayor que la hipotenusa. En caso de fallar, se le recordará al usuario y se volverá a hacer el bucle )*/
    do {
        alert("Se va a pedir los datos del triángulo número " + i + "\nRecuerde debe introducir números naturales mayores de 0, y que la suma de dos lados es mayor que el tercero");
        lado1 = parseFloat(prompt("Introduzca el lado 1 para el triángulo " + i));
        lado2 = parseFloat(prompt("Introduzca el lado 2 para el triángulo " + i));
        lado3 = parseFloat(prompt("Introduzca el lado 3 para el triángulo " + i));

        //Salta un aviso de error si el formato es incorrecto

        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0 || lado1 + lado2 <= lado3 || lado2 + lado3 <= lado1 || lado3 + lado1 <= lado2 || isNaN(lado1) || isNaN(lado2) || isNaN(lado3)) {
            alert("Formato de datos introducidos incorrecto. Por favor, introduzca los datos con los criterios establecidos");
        }
    } while (lado1 <= 0 || lado2 <= 0 || lado3 <= 0 || lado1 + lado2 <= lado3 || lado2 + lado3 <= lado1 || lado3 + lado1 <= lado2 || isNaN(lado1) || isNaN(lado2) || isNaN(lado3));

}

//Método para clasificar cada triángulo según los datos introducidos
function clasificacion(i) {

    if (lado1 === lado2 && lado2 === lado3) { //Si todos sus lados son iguales, es un triángulo equilátero
        texto += "El triángulo " + i + " es un triángulo equilátero, pues todos sus lados poseen la misma longitud<br>";
        equi++;
    } else if ((lado1 === lado2 && lado1 !== lado3) || (lado2 === lado3 && lado3 != lado2)) { //Si solo dos de sus lados son iguales, es un triángulo isósceles
        texto += "El triángulo " + i + " es un triángulo isósceles, pues solo dos de sus lados poseen la misma longitud<br>";
        isos++;
    } else { //si no se cumple ni la primera ni la segunda condición, es un triángulo escaleno pues ninguno de los lados posee la misma longitud
        texto += "El triángulo " + i + " es un triángulo escaleno, pues ninguno de sus lados poseen la misma longitud<br>";
        esca++;
    }

    //Permite salto de linea para leer de forma más limpia y el contador se suma para el formato de las funciones
    cont++;
    texto += "<br>";
}

//Compara que tipo de triángulo se ha introducido en menor medida, no sin antes mostrar la cantidad de cada tipo
function comparacion() {

    //Escribimos cuantos triángulos de cada tipo se han introducido

    texto += "Número de triángulos equiláteros introducidos: " + equi + "<br>";
    texto += "Número de triángulos isósceles introducidos: " + isos + "<br>";
    texto += "Número de triángulos escalenos introducidos: " + esca + "<br>";

    texto += "<br>";

    //Como no cuentan los tipos de triángulos introducido 0 veces, vamos a ponerle un valor máximo para no contarlo en las condiciones

    if (equi === 0) {
        equi = isos + esca;
    }
    if (isos === 0) {
        isos = equi + esca;
    }
    if (esca === 0) {
        esca = equi + isos;
    }

    //Compara cual es el tipo que menos veces introduce

    if (equi < isos && equi < esca) { //El menor es el equilátero
        texto += "Tipo de triángulo que menos veces se ha introducido: Equilátero";
    }
    if (isos < equi && isos < esca) { //El menor es el isósceles
        texto += "Tipo de triángulo que menos veces se ha introducido: Isósceles";
    }
    if (esca < equi && esca < isos) { //El menor es el escaleno
        texto += "Tipo de triángulo que menos veces se ha introducido: Escaleno";
    }
    if (equi === isos && equi !== esca) { //Mismo número de equiláteros e isósceles
        texto += "Se ha introducido el mismo número de triángulos Equiláteros e Isósceles";
    }
    if (isos === esca && isos !== equi) { //Mismo número de isósceles y escalenos
        texto += "Se ha introducido el mismo número de triángulos Isósceles y Escalenos";
    }
    if (esca === equi && esca != isos) { //Mismo número de equiláteros y escaleno
        texto += "Se ha introducido el mismo número de triángulos Equiláteros y Escalenos";
    }
    if (esca === equi && esca === isos) { //Todos poseen el mismo número (solo si num%3==0)
        texto += "Se ha introducido el mismo número de triángulos para cada tipo";
    }

}
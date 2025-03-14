//Variables para abrir las ventanas, los arrays de las ventana 2 y 3, y el objeto usuario para la ventana1

var ventana1, ventana2, ventana3, ventana4;
var array=[];
var array2=[];
var array3=[];
var usuario ={
    nombre: "alumno",
    contra: "bueno",
    fecha: new Date(),

    setContra: function(contra){
        this.contra=contra;
    },

    setfecha: function(fecha){
        this.fecha=fecha;
    },

    getContra: function(){
        return this.contra;
    }
}

var contraAct=usuario.getContra();

//Abre la ventana externa Ventana 1, donde se introducirá un usuario y contraseña y si estos coinciden se dejará cambiar la contraseña
function abrirVentana1(){
    
    let parametros=`width=300, height=300, left=0, top=0, resizable=no`;

    ventana1=window.open("GabrielCallejon_Ventana1.html","_blank", parametros);
}

function recibirDatos(objeto){
    usuario.setContra(objeto.contra);
    usuario.setfecha(objeto.fecha);
}

//Cierra la ventana1 manualmente
function cerrarVentana1(){
    ventana1.close();
}

//Función para abrir la ventana2, que genera un arrray del rango dado en el select1 y la cantidad del select2. Después muestra el rango de valores del menor al mayor de ese array
function abrirVentana2(){
    let top= 0;
    let left=screen.width -300;
    let parametros=`width=300, height=300, left=${left}, top=${top}, resizable=no`;
    ventana2=window.open("", "_blank", parametros);

    let longitud=document.getElementById("longitud").value;
    let cantidad=document.getElementById("cantidad").value;
    
    ventana2.document.write(`Longitud de la lista de números:  ${longitud}<br>Numero de valores aleatorios a escoger de esa lista: ${cantidad}<br><br>`);

    generarArray1(longitud, cantidad);

    let min=array[0];
    let max= array[cantidad-1];

    generarArray2(min, max);

    ventana2.document.write(`Valores de la lista: ${array.toString()}<br>Valores entre el menor y mayor: ${array2.toString()}`);

    ventana2.document.body.style.backgroundColor="lightblue";

    setTimeout("cerrarVentana2()", 20000);

}

//Función para generar el array de los valores dados en el select
function generarArray1(longitud, cantidad){

    let num;

    for (let i=0; i<cantidad; i++){
        do {
            num=Math.floor(Math.random() * (longitud-1) +1);
        }while (array.includes(num));
        array[i]=num;
    }

    array.sort((a,b)=> a-b);
}

//Función para generar el array del rango de valores mínimo y máximo del array1
function generarArray2(min, max){

    let cont=0;
    for (let i=min; i<=max; i++){
        array2[cont]=i;
        cont++;
    }

}

//Cierra la ventana2 manualmente

function cerrarVentana2(){
    ventana2.close();
}

//Función para generar el array3, que es de los valores impares ordenados del array1
function abrirVentana3(){

    if (array.length<6){
        alert("Abra primero la ventana 2 para poder usar esta ventana");
        return;
    }

    let top= screen.height - 300;
    let left=screen.width -300;
    let parametros=`width=300, height=300, left=${left}, top=${top}, resizable=no`;
    ventana3=window.open("", "_blank", parametros);

    generarArray3();

    ventana3.document.write(`Valores impares de la lista: ${array3.toString()}`);

    ventana3.document.body.style.backgroundColor="pink";

    setTimeout("cerrarVentana3()", 10000);

}

//Función para determinar los valores impares del array1
function generarArray3(){

    let cont=0;

    for (let i=0; i<array.length; i++){

        if (array[i] % 2 == 1){
            array3[cont]=array[i];
            cont++
        }
    }
    
}
//Cierra la ventana3 manualmente

function cerrarVentana3(){
    ventana3.close();
}

//Función para mostrar los datos del usuario
function abrirVentana4(){
    let top= screen.height -300;
    let left=0;
    let parametros=`width=300, height=300, left=${left}, top=${top}, resizable=no`;

    ventana4=window.open("", "_blank", parametros);

    ventana4.document.write(`Nombre de usuario: ${usuario.nombre}<br>Contraseña actual: ${usuario.contra}<br>Fecha de actualización: ${usuario.fecha}`);

    ventana4.document.body.style.backgroundColor="orange";

    setTimeout("cerrarVentana4()", 10000);
}
//Cierra la ventana4 manualmente

function cerrarVentana4(){
    ventana4.close();
}
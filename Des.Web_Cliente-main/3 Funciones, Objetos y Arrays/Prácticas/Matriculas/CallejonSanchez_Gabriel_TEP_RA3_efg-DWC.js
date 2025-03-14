

//Variables para almacenar el patrón de 4 dígitos, el próximo porcentaje de aparición de cualidad y el texto que mostrará el inner HTML. Lector del submit
const regex = /^\d{4}$/;
var poker = 0;
var par2 = 0;
var par3 = 0;
var esc3 = 0;
var esc4 = 0;
var ninguna = 0;
var texto = "";
var button = document.getElementById('btnSubmit');

document.addEventListener("DOMContentLoaded", escribir);


function validar() {
    let num = document.getElementById('numero').value.toString();
    let contador = parseInt(getCookie("contadorEspecif") || "0");
    if (num.match(regex)) {

        porcentajes();
        // Incrementar el contador y actualizar la cookie
        contador++;
        setCookie("contadorEspecif", contador, 365);

        // Mostrar el resultado del cálculo
        texto = "Su combinación es: " + calcularEspec(num) + "<br>";
        texto += "---------------------------------------------------<br>";

        texto += "Esta función se ha ejecutado " + contador + " veces.<br>";

        ventana();
    } else {
        alert("Formato incorrecto. Intenta introducir un número de 4 cifras");
    }
}

//Señala cada combinación posible
function porcentajes() {
    for (var i = 0; i <= 9999; i++) {
        let num = String(i).padStart(4, "0");
        calcular(num);
    }
}



//Muestra que cualidad tiene cada combinación
function calcular(numb) {
    let array = numb.split("").map(Number);
    if (array[0] === array[1] && array[1] === array[2] && array[2] === array[3]) {
        poker++;
    } else if (escalera4(array)) {
        esc4++;
    } else if (escalera3(array)) {
        esc3++;
    } else if (pareja2(array)) {
        par2++;
    } else if (pareja3(array)) {
        par3++;
    } else {
        ninguna++;
    }
}

//Variación de calcular(numb) para el número que se le pide al usuario

function calcularEspec(numb) {
    let array = numb.split("").map(Number);
    if (array[0] === array[1] && array[1] === array[2] && array[2] === array[3]) {
        return "Poker";
    } else if (escalera4(array)) {
        return "Escalera de 4";
    } else if (escalera3(array)) {
        return "Escalera de 3";
    } else if (pareja2(array)) {
        return "2 Parejas de 2";
    } else if (pareja3(array)) {
        return "1 Pareja de 3";
    } else {
        return "Del montón<br>No cumple ninguna característica";
    }
}

// Verifica si hay 2 parejas de 2 números
function pareja2(array) {
    let chequeo = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0];
    let parejas = 0;
    for (let i = 0; i < array.length; i++) {
        chequeo[array[i]]++;
    }
    for (let i = 0; i < chequeo.length; i++) {
        if (chequeo[i] === 2) parejas++;
    }
    return parejas === 2;
}

// Verifica si hay 1 pareja de 3 números

function pareja3(array) {
    let chequeo = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0];
    for (let i = 0; i < array.length; i++) {
        chequeo[array[i]]++;
    }
    return chequeo.includes(3);
}

// Verifica si hay una escalera de 3 dígitos
function escalera3(array) {
    array.sort((a, b) => a - b);
    return (
        (array[0] + 1 === array[1] && array[1] + 1 === array[2]) ||
        (array[1] + 1 === array[2] && array[2] + 1 === array[3]) ||
        (array[0] + 1 === array[1] && array[1] + 1 === array[3]) ||
        (array[0] + 1 === array[2] && array[2] + 1 === array[3])
    );
}

// Verifica si hay una escalera de 4 dígitos 
function escalera4(array) {
    array.sort((a, b) => a - b);
    for (let i = 0; i < array.length - 1; i++) {
        if (array[i + 1] !== array[i] + 1) {
            return false;
        }
    }
    return true;
}

// Muestra los resultados en la pantalla princial
function escribir() {
    porcentajes();

    texto += `
        <div class="container">
            <h3>Probabilidades:</h3>
            <p>Póker: ${(poker / 10000 * 100).toFixed(2)} %</p>
            <p>Escalera de 4: ${(esc4 / 10000 * 100).toFixed(2)} %</p>
            <p>Escalera de 3: ${(esc3 / 10000 * 100).toFixed(2)} %</p>
            <p>Dos parejas: ${(par2 / 10000 * 100).toFixed(2)} %</p>
            <p>Un trío: ${(par3 / 10000 * 100).toFixed(2)} %</p>
            <p>Sin combinación: ${(ninguna / 10000 * 100).toFixed(2)} %</p>
        </div>
    `;

    document.getElementById("salida").innerHTML = texto;
}

//Muestra los resultados del número del usuario en otra ventana 
function ventana() {

    let nuevaVentana = window.open("", "Resultado", "width=400,height=200");
    nuevaVentana.document.write(
        "<h3>Resultado del número:</h3><p>" + texto + "</p>");

    setTimeout(() => {
        nuevaVentana.close();
    }, 10000);
}

function setCookie(nombre, valor, dias) {
    const fecha = new Date();
    fecha.setTime(fecha.getTime() + (dias * 24 * 60 * 60 * 1000));
    const expira = "expires=" + fecha.toUTCString();
    document.cookie = `${nombre}=${valor}; ${expira}; path=/`;
}

function getCookie(nombre) {
    const txt = nombre + "=";
    const cookies = document.cookie.split(';');
    for (let i = 0; i < cookies.length; i++) {
        let valor = cookies[i].trim();
        if (valor.indexOf(txt) === 0) {
            return valor.substring(txt.length, valor.length);
        }
    }
}

let modoPintura = false; // Alterna el color que se usa para pintar
let alternado = false;  // Alterna si se puede pintar en el lienzo o no
let colorSeleccionado = ''; // Toma el valor rgb del color con el que se pinta

document.body.style.margin = "0 auto";
document.body.style.width = "60%";
window.addEventListener("load", pizarra);

function pizarra() { // Crea el lienzo para pintar
    let tabla = document.createElement("table");
    document.getElementById("zonadibujo").appendChild(tabla);
    tabla.setAttribute("class", "tablerodibujo");

    for (let i = 0; i < 30; i++) {
        let fila = document.createElement("tr");

        for (let j = 0; j < 30; j++) {
            let elem = document.createElement("td");
            elem.style.backgroundColor = "white";
            fila.appendChild(elem);
        }

        tabla.appendChild(fila);
    }

    eventListener();
}

function eventListener() { // Añade los eventos a la paleta de colores y el lienzo
    const tabla = document.getElementById("paleta");
    const tr = tabla.querySelector("tr");
    const td = tr.children;

    td[0].classList.remove('seleccionado');

    for (let i = 0; i < td.length; i++) {
        td[i].addEventListener("click", function () {
            cambiarColorPincel(this, td);
        });
    }

    const celdasPizarra = document.querySelectorAll('#zonadibujo td');
    celdasPizarra.forEach(celda => {
        celda.addEventListener("click", () => {
            alternar(celdasPizarra);
        });
    });
}

function cambiarColorPincel(celda, td) { // Cambia el color del pincel por el color seleccionado
    let colorString;

    // Quitar la clase 'seleccionado' de todas las celdas
    for (let i = 0; i < td.length; i++) {
        td[i].classList.remove('seleccionado');
    }

    // Si ya estaba seleccionado, desactivar el pincel
    if (modoPintura && celda.classList.contains('seleccionado')) {
        modoPintura = false;
        celda.classList.remove('seleccionado');
        document.getElementById('pincel').textContent = 'Estado del pincel: Inactivo';
        return;
    }

    // Activar el pincel y añadir la clase 'seleccionado' a la celda actual
    modoPintura = true;
    colorSeleccionado = window.getComputedStyle(celda).backgroundColor;
    celda.classList.add('seleccionado');

    // Determinar el color seleccionado
    switch (colorSeleccionado) {
        case "rgb(255, 255, 0)":
            colorString = "Amarillo";
            break;
        case "rgb(0, 255, 0)":
            colorString = "Verde";
            break;
        case "rgb(0, 0, 0)":
            colorString = "Negro";
            break;
        case "rgb(255, 0, 0)":
            colorString = "Rojo";
            break;
        case "rgb(0, 102, 204)":
            colorString = "Azul";
            break;
        case "rgb(255, 255, 255)":
            colorString = "Borrar";
            break;
        default:
            colorString = "Desconocido";
    }

    // Mostrar el estado del pincel
    document.getElementById('pincel').textContent = `Estado del pincel: ${colorString}`;
}

function alternar(celdasPizarra) { // Función para alternar la posibilidad de pintar
    alternado = !alternado;

    celdasPizarra.forEach(celda => {
        celda.addEventListener("mousemove", () => {
            pintarCelda(celda);
        });
    });
}

function pintarCelda(celda) { // Función para verificar que se tienen los requisitos para pintar
    if (modoPintura && alternado) {
        celda.style.backgroundColor = colorSeleccionado;
    }
}

function reset() {
    const tabla = document.getElementsByClassName("tablerodibujo")[0];
    const filas = tabla.getElementsByTagName("tr");

    Array.from(filas).forEach(fila => {
        Array.from(fila.getElementsByTagName("td")).forEach(celda => {
            celda.style.backgroundColor = "white";
        });
    });
}

function cambiarGrid() {
    const tabla = document.getElementsByClassName("tablerodibujo")[0];
    const filas = tabla.getElementsByTagName("tr");
    var celda2;

    Array.from(filas).forEach(fila => {
        Array.from(fila.getElementsByTagName("td")).forEach(celda => {
            celda.style.border= "0";
        });
    });


    downloadPDF();
    Array.from(filas).forEach(fila => {
        Array.from(fila.getElementsByTagName("td")).forEach(celda => {
            celda.style.border= "1";
        });
    });
    
}

async function downloadPDF() {
    const { jsPDF } = window.jspdf;

    const element = document.getElementsByClassName('tablerodibujo')[0];

    const canvas = await html2canvas(element);

    const imgData = canvas.toDataURL('image/png');

    const pdf = new jsPDF();

    const pdfWidth = pdf.internal.pageSize.getWidth();
    const pdfHeight = (canvas.height * pdfWidth) / canvas.width;


    
    pdf.addImage(imgData, 'PNG', 0, 0, pdfWidth, pdfHeight);
    pdf.save('foto.pdf');
}



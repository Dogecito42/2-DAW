//crea las tablas y les pone estilo; cont cuenta el número de celdas


let tabla = document.createElement("table");
tabla.setAttribute("border", "1");
tabla.style.width = "500px";
tabla.style.borderCollapse = "collapse"; 
let cont = 0;


//Crea los botones y su evento

let boton = document.createElement("button");
boton.innerHTML = "Añadir";
let boton2 = document.createElement("button");
boton2.innerHTML = "Quitar";

boton2.addEventListener("click", quitar);
boton.addEventListener("click", columna);

//Añade los elementos

document.body.appendChild(tabla);
document.body.appendChild(boton);
document.body.appendChild(boton2);



function columna() {//Función para añadir celdas a la tabla
    let fila = document.createElement("td");

    fila.style.width = "100px";
    fila.style.border = "1px solid black";

    cont++;

    fila.innerHTML = `Celda ${cont}`;

    tabla.appendChild(fila);
}

function quitar() {//Función para quitar celdas de la tabla
    let filas = document.getElementsByTagName("td");

    if (cont > 0) {
        filas[cont - 1].remove();
        cont--;
    }
}

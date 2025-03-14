//botones que se reincorporan varias veces en el programa
let form = document.getElementById("sesion");
let error = document.getElementById("error");

let tabla = document.createElement("table");
tabla.setAttribute("id", "tablaUs");

let formUs = document.createElement("form");
formUs.setAttribute("action", "javascript:void(0);");

let but = document.createElement("button");
but.setAttribute("onclick", "elemUs()");
but.innerHTML = "Añadir";

let butAn = document.createElement("button");
butAn.setAttribute("onclick", "guardado()");
butAn.innerHTML = "Guardar";

var deleteButton;
var esAdmin = false;

//Para crear los inputs de las tablas
let lab1 = document.createElement("label");
let lab2 = document.createElement("label");
let lab3 = document.createElement("label");
let lab4 = document.createElement("label");

let inp1 = document.createElement("input");
let inp2 = document.createElement("input");
let inp3 = document.createElement("select");
let inp4 = document.createElement("select");

inp1.setAttribute("name", "inp1");
inp2.setAttribute("name", "inp2");
inp3.setAttribute("name", "inp3");
inp4.setAttribute("name", "inp4");

lab1.innerHTML = "Nombre: ";
lab2.innerHTML = "Descripción: ";
lab3.innerHTML = "Importancia: ";
lab4.innerHTML = "Duración: ";

for (let i = 1; i <= 5; i++) {
    var option = document.createElement("option");
    option.value = i;
    option.text = i;
    inp3.appendChild(option);
}

for (let i = 20; i <= 120; i = i + 20) {
    var option = document.createElement("option");
    option.value = i;
    option.text = i;
    inp4.appendChild(option);
}

formUs.appendChild(lab1);
formUs.appendChild(inp1);
formUs.appendChild(lab2);
formUs.appendChild(inp2);
formUs.appendChild(lab3);
formUs.appendChild(inp3);
formUs.appendChild(lab4);
formUs.appendChild(inp4);

//Sesiones Usuario (usuario , usuario) ; Admin (admin , admin)

function sesion() {
    if (form.usuario.value == "usuario" && form.contra.value == "usuario") {
        esAdmin = false;
        sesionUsuario();
    } else if (form.usuario.value == "admin" && form.contra.value == "admin") {
        esAdmin = true;
        sesionAdmin();
    } else {
        error.innerHTML = "Sesión inválida, pruebe con usuario ; usuario";
    }
}

// Fila de encabezado para la tabla
function crearEncabezado() {
    let headerRow = tabla.insertRow(-1);
    
    let th1 = document.createElement("th");
    th1.innerHTML = "Nombre";
    headerRow.appendChild(th1);
    
    let th2 = document.createElement("th");
    th2.innerHTML = "Descripcion";
    headerRow.appendChild(th2);
    
    let th3 = document.createElement("th");
    th3.innerHTML = "Importancia";
    headerRow.appendChild(th3);
    
    let th4 = document.createElement("th");
    th4.innerHTML = "Duracion";
    headerRow.appendChild(th4);
    
    if (esAdmin) {
        let thChk = document.createElement("th");
        thChk.innerHTML = "Eliminar";
        headerRow.appendChild(thChk);
    }
}

function sesionUsuario() {
    form.remove();
    error.innerHTML = "";
    document.body.appendChild(tabla);
    crearEncabezado();
    document.body.appendChild(but);
}

function sesionAdmin() {
    form.remove();
    error.innerHTML = "";
    document.body.appendChild(tabla);
    crearEncabezado();
    
    deleteButton = document.createElement("button");
    deleteButton.innerHTML = "Eliminar seleccionados";
    deleteButton.setAttribute("onclick", "eliminarFilas()");
    
    document.body.appendChild(deleteButton);
    document.body.appendChild(but);
}

    // Recorremos las filas (excepto el encabezado) y eliminamos aquellas con el checkbox marcado
function eliminarFilas() {

    for (let i = tabla.rows.length - 1; i > 0; i--) { 
        let row = tabla.rows[i];
        if (row.cells.length > 4) { // existe la columna de checkbox
            let chk = row.cells[4].firstChild;
            if (chk && chk.checked) {
                tabla.deleteRow(i);
            }
        }
    }
}

function elemUs() {
    but.remove();
    document.body.appendChild(formUs);

    inp1.value = "";
    inp2.value = "";
    inp3.value = "1";
    inp4.value = "20";

    document.body.appendChild(butAn);
}

function guardado() {
    let nombre = formUs.inp1.value;
    let desc = formUs.inp2.value;
    let imp = formUs.inp3.value;
    let dur = formUs.inp4.value;

    // Cada guardado añade una nueva fila 
    let newRow = tabla.insertRow(-1);
    
    let cell1 = newRow.insertCell(-1);
    cell1.innerHTML = nombre;
    
    let cell2 = newRow.insertCell(-1);
    cell2.innerHTML = desc;
    
    let cell3 = newRow.insertCell(-1);
    cell3.innerHTML = imp;
    
    let cell4 = newRow.insertCell(-1);
    cell4.innerHTML = dur;
    
    if (esAdmin) {
        let cell5 = newRow.insertCell(-1);
        let checkbox = document.createElement("input");
        checkbox.type = "checkbox";
        cell5.appendChild(checkbox);
    }
    
    formUs.remove();
    butAn.remove();
    document.body.appendChild(but);
}

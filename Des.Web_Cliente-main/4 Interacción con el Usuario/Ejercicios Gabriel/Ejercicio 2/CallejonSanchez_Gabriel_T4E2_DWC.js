var tabla = document.getElementById("tabla1");
let defecto= tabla.border;

function crearNodoTabla(){ //Crea el botón por defecto y lo une al body
    let boton= document.createElement("button");
    boton.setAttribute("onclick", "normi()");
    boton.innerHTML="defecto";
    document.body.appendChild(boton);


}
function aumentar(){ //aumenta el grosor en 1

    tabla.border=parseInt(tabla.border)+1;
}

function disminuir(){ //disminuye el grosor en 1

    tabla.border=parseInt(tabla.border)-1;
}

function normi(){ //Pone el borde en su valor por defecto
    tabla.border=defecto;
}


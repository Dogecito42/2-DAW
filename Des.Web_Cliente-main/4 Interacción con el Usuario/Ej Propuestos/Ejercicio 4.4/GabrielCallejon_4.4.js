const REGEXMAIL =/^[a-zA-Z0-9]+(?:[-._][a-zA-Z0-9]+)*@[a-zA-Z0-9-]+(?:\.[a-zA-Z]{2,})$/;
const REGEXNUM = /^\d{9}$/;

let form=document.getElementById("formulario");
let div=document.getElementsByTagName("div");

div[1].style.color= "green";
function validar(){

    div[0].innerHTML="";

    if(parseInt(form.nombre.value.length)<4 || form.nombre.value== ""){

        div[0].innerHTML+="Error por la longitud de texto";
    }

    if (!form.email.value.match(REGEXMAIL)){

        div[0].innerHTML+="<br> Error en el correo";
    }

    if (!form.telefono.value.match(REGEXNUM)){
        
        div[0].innerHTML+="<br> Error en el número de teléfono";

    }

    if (div[0].innerHTML == ""){

        div[1].innerHTML = "Formulario con datos correctos";
    }
}
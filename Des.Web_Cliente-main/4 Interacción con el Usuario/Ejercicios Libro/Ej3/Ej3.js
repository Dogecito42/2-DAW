const REGEXMAIL = /^[a-zA-Z0-9]+(?:[-._][a-zA-Z0-9]+)*@[a-zA-Z0-9-]+(?:\.[a-zA-Z]{2,})$/;
var form=document.getElementById("formulario");

function enviar(){
    if (form.Nombre.value.match(REGEXNOMBRE) || form.Apellidos.value.match(REGEXNOMBRE) || form.Nombre.value == "" || form.Apellidos.value == "" || !form.Email.value.match(REGEXMAIL)){
        alert("Los campos están vacíos o no son adecuados. No te pases de rosca");
    }else{
        alert("Los campos no están vacíos :D");
    }
}
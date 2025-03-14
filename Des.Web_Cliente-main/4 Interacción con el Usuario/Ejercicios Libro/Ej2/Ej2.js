const REGEXNOMBRE= /^\s+$/;
var form=document.getElementById("formulario");

function enviar(){
    if (form.Nombre.value.match(REGEXNOMBRE) || form.Apellidos.value.match(REGEXNOMBRE) || form.Nombre.value == "" || form.Apellidos.value == ""){
        alert("Los campos están vacíos. No te pases de rosca");
    }else{
        alert("Los campos no están vacíos :D");
    }
}
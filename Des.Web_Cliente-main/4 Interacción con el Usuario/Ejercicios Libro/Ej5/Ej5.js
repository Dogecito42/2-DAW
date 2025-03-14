var str= "El sistema operativo más seguro es Android";
var salida=    document.getElementById("salida");

window.addEventListener("load", carga());

function carga(){
    salida.innerHTML= str;    
}
function cambiar(){
    var res=str.replace(/android/i, "Linux");
    salida.innerHTML= res +"<br>Funciona!";
}
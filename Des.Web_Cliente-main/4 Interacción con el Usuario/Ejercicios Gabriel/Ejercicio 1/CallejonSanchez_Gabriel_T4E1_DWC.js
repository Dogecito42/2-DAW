


var tabla= document.getElementsByTagName("table"); //Pillamos la tabla

var grosor= tabla[0].border; //Sacamos el valor del border

document.getElementsByTagName("p")[0].innerHTML="El grosor de la tabla es: "+grosor;
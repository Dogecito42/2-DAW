var str = "Aprende javaScript de 10 en Síntesis";

var salida=document.getElementById("salida");
salida.innerHTML = str;

var m = str.search(/[S|t]/i);

var salida1=document.getElementById("salida1");
salida1.innerHTML ="<p>Posición de los carácteres S o t (el primero que aparezca)</p><br>" + m;

var n = str.search(/[0-9]/i);

var salida2=document.getElementById("salida2");
salida2.innerHTML ="<p>Posición de cualquier dígito (el primero que aparezca)</p><br>" + n;

var a = str.search(/0+/i);

var salida3=document.getElementById("salida3");
salida3.innerHTML = "<p>Posición del número 0  (el primero que aparezca)</p><br>" + a;


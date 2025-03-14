<?php 

$pagCont=fopen("visitas.txt", "r+");

$contador= fgets($pagCont,8);


echo ("Esta es la visita número $contador");

$contador++;

rewind($pagCont);

fwrite($pagCont, $contador);

fclose($pagCont);
?>
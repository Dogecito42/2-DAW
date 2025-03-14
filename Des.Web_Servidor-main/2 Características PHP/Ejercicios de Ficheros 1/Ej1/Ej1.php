<?php

$fichero = fopen("lectura.php", "r");
$salida = fopen("salida.txt", "w");
$string="";


while (!feof($fichero)) {
    $string .= fgets($fichero);
}

fclose($fichero);

fwrite($salida, $string);

fclose($salida);
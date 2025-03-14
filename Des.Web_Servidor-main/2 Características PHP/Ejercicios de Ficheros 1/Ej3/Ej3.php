<?php

$directorio = opendir("directorio/");

$salida = ""; 

while (false !== ($fichero = readdir($directorio))) {

    $ruta = "directorio/" . $fichero;

    $fecha = date("d-m-Y H:i:s", filemtime($ruta));

    if (is_dir($ruta)) {
        $info = "Directorio: $fichero\nFecha: $fecha\n\n";
    } else {
        $info = "$fichero: Tamaño: " . filesize($ruta) . " bytes\nFecha: $fecha\n\n"; 
    }

    $salida .= $info;
}

closedir($directorio);

$archivoSalida = fopen("salida.txt", "w");

fwrite($archivoSalida, $salida);

fclose($archivoSalida);


?>

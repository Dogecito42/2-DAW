<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 9</title>
</head>
<body>
    <?php

    $frase="Bienvenidos al a aventura de aprender PHP en 30 horas";
    $num=1;
    $num2=strpos($frase,"aventura");
    $num3=strlen("aventura");
    if(strlen($frase)%2== 0) $num=2;
    print("Parte central de la frase: ".substr($frase, strlen($frase)/2, $num)."<br>");

    print("Posición de la palabra PHP :".strpos($frase,"PHP")."<br>");
    print("Cadena modificada: ". substr_replace($frase,"<b>misión</b>",strpos($frase,"aventura")).substr($frase, $num2+$num3));
    ?>
</body>
</html>
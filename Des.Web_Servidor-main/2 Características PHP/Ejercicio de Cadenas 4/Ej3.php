<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php 
    $cad="Esto es una cadena";
    $cad2="un poco más larga";

    $cad3=($cad." ".$cad2);

    $c1=strpos($cad3, "c");
    $c2=strrpos($cad3,"c");
    $pos=strpos($cad3, "poco");

    echo("La primera c se encuentra en la posición ".$c1.", la última en la posición ".$c2.", y la palabra poco en la posición ".$pos);
    ?>
</body>
</html>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 7</title>
</head>
<body>
    <?php 
    function cuadrado($num){
        return $num*$num;  
    }
    function cubo($num){
        return $num*$num*$num;
    }
    $num=10;
    echo ("El numero ".$num." tienen un cuadrado de ".cuadrado($num). " y un cubo de ".cubo($num));
    ?>
</body>
</html>
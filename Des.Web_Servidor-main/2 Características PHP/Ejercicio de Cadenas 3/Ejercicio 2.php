<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 2</title>
</head>
<body>
<?php 
    $correo="raulillogamer01@hotmail.com";
    $partes= explode("@",$correo);

    echo "El Correo es ".$partes[0]."<br><br> Y el Dominio ".$partes[1];
?>
</body>
</html>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php 
        $cadena= "Bienvenido a nuestro cine. Ha efectuado usted la decisión correcta";
        $nombrecliente=", Pablo Gonzalez. ";

        $partes=explode(".", $cadena );

        echo($partes[0].$nombrecliente.$partes[1]);

    ?>
</body>
</html>
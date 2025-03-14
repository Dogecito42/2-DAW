<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 6</title>
</head>
<body>
    <?php 
        $frase=" … Hola a todos … ";
        
        echo "Frase Eliminando los espacios antes y despues del texto: ".substr($frase, 4, strlen($frase)-8);

        echo "<br>Frase Eliminando los espacios antes del texto: " .substr($frase, 4, strlen($frase));

        echo "<br>Frase Eliminando los espacios despues del texto: ".substr($frase, 0, strlen($frase)-4);
    ?>
</body>
</html>
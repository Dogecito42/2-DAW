<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 5</title>
</head>
<body>
    <?php 
        $frase="Mango Azul Madero PresentE";

        echo "cadena normal: ".$frase;
        echo "<br>cadena modificada: ".strtr ($frase,     "aeiouAEIOU", "AEIOUaeiou");
    ?>
</body>
</html>
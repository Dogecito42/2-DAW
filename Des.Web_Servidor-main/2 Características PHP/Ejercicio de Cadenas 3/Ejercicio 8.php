<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 8</title>
</head>
<body>
    <?php 
    $frase="vamos al o'Brian";

    $frase=addslashes($frase);
    printf($frase);
    $frase=stripslashes($frase);
    printf($frase);
    ?>
</body>
</html>
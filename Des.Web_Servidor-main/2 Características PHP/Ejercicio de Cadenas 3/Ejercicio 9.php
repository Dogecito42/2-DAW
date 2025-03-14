<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 9</title>
</head>
<body>
    <?php 
        $frase="Francisco Javier Usero Sanchez";
        $frase=addcslashes($frase, "eiou");
        printf($frase);
        $frase=stripslashes($frase);
        printf("<br>".$frase);
    ?>
</body>
</html>
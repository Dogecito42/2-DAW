<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 1</title>
</head>
<body>
    <?php 
    
    $frase="Madero está acabado";
    $frase=trim($frase);

    $num=strrpos($frase, " ");

    echo substr($frase, $num);
    
    ?>
</body>
</html>
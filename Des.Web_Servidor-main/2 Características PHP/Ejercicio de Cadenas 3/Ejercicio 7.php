<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 7</title>
</head>
<body>
    <?php 
        $frase="madero";

        echo  "Frase con relleno a la derecha ".str_pad($frase, 20, "#");
        echo "<br>Frase con relleno a la izquierda ".str_pad($frase, 20, "#", STR_PAD_LEFT);
        echo "<br>Frase con relleno en ambos "  .str_pad($frase, 20, "#", STR_PAD_BOTH);
    ?>
</body>
</html>
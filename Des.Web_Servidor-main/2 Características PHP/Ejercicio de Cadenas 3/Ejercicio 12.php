<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 12s</title>
</head>
<body>
    <?php 
        $frase="192.88.60.9";

        if (filter_var($frase, FILTER_VALIDATE_IP)){
            echo $frase." es una IP válida";
        }else{
            echo $frase." es una Ip inválida";
        }
    ?>
</body>
</html>
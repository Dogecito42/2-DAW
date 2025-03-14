<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 3</title>
</head>
<body>
    <?php 
    function cambioSeg($numero){
        return $numero*24*3600;
    }

    echo "3 días en segundos son ".cambioSeg(3)." segundos";
    ?>
</body>
</html>
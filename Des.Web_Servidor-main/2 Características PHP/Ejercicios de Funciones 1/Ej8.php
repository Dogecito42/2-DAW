<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 8</title>
</head>
<body>
    <?php 
        function factorial($num){
            $salida=0;
            for ($i=$num; $i>=1; $i--){
                $salida=$salida+$i;
            }
            return $salida;
   
        }
        echo ("El factorial de 5 es ".factorial(5) );
    ?>
</body>
</html>
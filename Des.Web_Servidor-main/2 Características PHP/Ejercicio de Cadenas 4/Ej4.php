<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php 
        $cad="Esto es una cadena";
        $cad2="un poco más larga";
    
        $cad3=($cad." ".$cad2);

        $car1=$cad3[10];
        $car3=$cad3[2];
        $carFin=$cad3[strlen($cad3)-1];

        echo("El primer carácter es ".$car1.", el tercer es ".$car3." y el último es ".$carFin);
    ?>
</body>
</html>
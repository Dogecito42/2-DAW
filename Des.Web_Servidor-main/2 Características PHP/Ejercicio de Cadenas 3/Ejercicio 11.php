<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 11</title>
</head>
<body>
    <?php 
        $frase="Madero tienes dano cerebral";
        $array= str_split($frase);
        
        for($num=0; $num<=strlen($frase);$num++){

            echo " ".$array[$num];
        }
    ?>  

</body>
</html>
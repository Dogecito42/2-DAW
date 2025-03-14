<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php 
    
        /*EJERCICIO 4.-Dada una frase, escribir la palabra que está en la posición N*/

        $cad="Hola que tal"; //cadena que se va a buscar las palabras
        $n=2; //posición de la palabra que se va a devolver

        $palabras=explode(" ", $cad);

        echo "La palabra en la posición $n es ".$palabras[$n-1];
    ?>
</body>
</html>
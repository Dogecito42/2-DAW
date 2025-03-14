<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 4</title>
</head>
<body>
    <?php 
        $frase1="Hola 9";
        $frase2="Hola 10";
        $comp1=strcmp($frase1,$frase2);
        $comp2=strncmp($frase1,$frase2, 5);
        $comp3=strnatcmp($frase1, $frase2);
        echo "Comparación de cadena entera: <br>";
        comparar($comp1);
        echo "<br>Comparación de primeros 5 carácteres: <br>";
        comparar($comp2);
        echo "<br>Comparación natural: <br>";
        comparar($comp3);


        function comparar($comp){
            if ($comp<0){
                echo "Hola 10 es mayor a Hola 9";
            }elseif ($comp==0){
                echo "Las cadenas son iguales";
            }else{
                echo "Hola 9 es mayor a Hola 10";
            }
        }
    ?>
</body>
</html>
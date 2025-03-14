<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 2</title>
</head>
<body>
    <?php
    $frase="Juya empieza a poner numeros para calcular la media aritmetica.";

    echo ("Media aritmetica: ".media($frase));
        function media($frase){
        echo($frase."<br>");
        $num=0;
        $med=0;
        do{
            $num=$num+rand(0,10);
            $med++;
        }while($num==6); //Condicion completamente aleatoria, simula el maximo de interacción humana en un programa

        return $num/$med;
    }
    
    ?>
</body>
</html>
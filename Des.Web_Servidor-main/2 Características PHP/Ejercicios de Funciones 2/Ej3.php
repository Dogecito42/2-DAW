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
        $num=rand(0,10);
        $med=0;
        $num2=0;
        for ($i=0; $i<=$num; $i++){

            $num2=$num2+rand(0,10);
            $med++;
        } //Condicion completamente aleatoria, simula el maximo de interacción humana en un programa

        return $num2/$med;
    }
    
    ?>
</body>
</html>
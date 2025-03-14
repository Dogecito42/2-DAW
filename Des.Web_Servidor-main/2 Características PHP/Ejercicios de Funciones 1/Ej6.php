<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 6</title>
</head>
<body>
    <?php 
        function textoNegrita($texto){
            return "<b>".$texto."</b>";
        }

        $texto="Fran estudio coño";
        echo ("El texto ".$texto." en negrita es: <b>".textoNegrita($texto));
    ?>
</body>
</html>
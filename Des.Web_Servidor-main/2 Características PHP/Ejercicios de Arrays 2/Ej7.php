//Diferencias de merge y merge Recursivo

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <?php
    $array = array();
    $cont = 0;


    do {
        array_push($array, $cont);
        $cont++;
    } while ($cont != 100);

    $valor = array_splice($array, -5);

    $array = array_merge($valor, $array);

    foreach ($array as $num) {
        echo "Valor $num<br>";
    }
    ?>
</body>

</html>
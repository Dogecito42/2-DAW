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

    $conteo = array_count_values($array);

    foreach ($conteo as $cuenta => $key) {


        echo "Veces de aparición de $cuenta: $key <br>";
    }

    ?>
</body>

</html>
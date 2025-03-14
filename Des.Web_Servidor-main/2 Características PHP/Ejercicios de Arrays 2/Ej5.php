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

    if (in_array(96, $array)) {
        echo "Está el valor 96<br>";
    }
    if (in_array(98, $array)) {
        echo "Está el valor 98<br>";
    }
    if (in_array(99, $array)) {
        echo "Está el valor 99<br>";
    }
    ?>
</body>

</html>
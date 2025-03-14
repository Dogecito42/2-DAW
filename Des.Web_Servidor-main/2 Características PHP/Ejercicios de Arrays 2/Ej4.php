<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <?php
    $array = array(
        "blue",
        "red",
        "green",
        "blue",
        "blue"
    );

    do {
        $pos = array_search("blue", $array);
        if ($pos !== false) {
            echo "Valor blue encontrado en la posición: " . $pos . "<br>";

            unset($array[$pos]);
        }
    } while ($pos !== false);
    ?>
</body>

</html>
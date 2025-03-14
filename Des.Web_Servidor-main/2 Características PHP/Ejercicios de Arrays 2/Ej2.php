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

    $azul = array_keys($array, "blue");

    foreach ($azul as $posicion) {

        echo "Palabra blue en la Posicion $posicion<br>";
    }
    ?>
</body>

</html>
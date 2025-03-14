<!DOCTYPE html>
<html lang="en">


<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <?php
    $base = array("naranja", "plátano", "manzana", "frambuesa");
    $reemplazos = array(0 => "piña", 4 => "cereza");
    $reemplazos2 = array(0 => "uva");

    $replace = array_replace($base, $reemplazos, $reemplazos2);

    print_r($replace);
    echo "<br>";
    $merge = array_merge($base, $reemplazos, $reemplazos2);

    print_r($merge);
    echo "<br>";
    $mergeRec = array_merge_recursive($base, $reemplazos, $reemplazos2);

    print_r($mergeRec);
    ?>
</body>

</html>
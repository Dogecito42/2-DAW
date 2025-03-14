<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php 
        $cad="Madero se ha cagado en el Celia Verga";

        $car=str_split($cad);
        $cad=implode("-",$car);

        echo($cad);
    ?>
</body>
</html>
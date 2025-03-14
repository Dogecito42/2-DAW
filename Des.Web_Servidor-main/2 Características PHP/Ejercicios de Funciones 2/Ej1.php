<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php 
        $a=3;
        $b=7;
        cambiar($a,$b);
        function cambiar(&$a, &$b){
            $aux=$a;
            $a=$b;
            $b=$aux;
        }

        echo ($a."<br>".$b);
    ?>
</body>
</html>
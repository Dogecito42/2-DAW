<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php 
        $div=10;
        $divis=2;
        $coc=1;

        echo divRusa($div, $divis, $coc);

        function divRusa($div, $divis, $coc){

            if ($div>$divis){
                return divRusa($div-$divis, $divis, $coc+1);
            }else{
                return ("Cociente: $coc");
            }
        }
    ?>
</body>
</html>
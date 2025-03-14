<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php 
    
    $num=array(rand(0,10), rand(0,10), rand(0,10), rand(0,10), rand(0,10), rand(0,10), rand(0,10), rand(0,10), rand(0,10), rand(0,10),);
    $cont=0;
    $pos=0;

    foreach ($num as $value){
        if ($value == 2){
            $cont++;
            echo "Valor numerico 2 encontrado en la posición ".$pos."<br>";
        }
        $pos++;
        
    }
    echo "Ocurrencias del numero 2: ".$cont;
    ?>
</body>
</html>
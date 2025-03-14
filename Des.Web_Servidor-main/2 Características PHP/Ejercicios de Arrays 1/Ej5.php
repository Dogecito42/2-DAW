<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php 
    
    $pila = array("cinco" => 5, "uno"=>1, "cuatro"=>4, "dos"=>2, "tres"=>3);

    echo "Array normal: <br>";
    foreach ($pila as $key=>$value){
        echo "&emsp;Codigo: ".$key." Valor: ".$value."<br>";
    }
    asort($pila);
    echo "<br>Ordenacion asort <br>";
    foreach ($pila as $key=>$value){
        echo "&emsp;Codigo: ".$key." Valor: ".$value."<br>";
    }
    arsort($pila);
    echo "<br>Ordenacion arsort <br>";
    foreach ($pila as $key=>$value){
        echo "&emsp;Codigo: ".$key." Valor: ".$value."<br>";
    }
    ksort($pila);
    echo "<br>Ordenacion ksort <br>";
    foreach ($pila as $key=>$value){
        echo "&emsp;Codigo: ".$key." Valor: ".$value."<br>";
    }
    sort($pila);
    echo "<br>Ordenacion sort <br>";
    foreach ($pila as $key=>$value){
        echo "&emsp;Codigo: ".$key." Valor: ".$value."<br>";
    }
    rsort($pila);
    echo "<br>Ordenacion rsort <br>";
    foreach ($pila as $key=>$value){
        echo "&emsp;Codigo: ".$key." Valor: ".$value."<br>";
    }
    ?>
</body>
</html>
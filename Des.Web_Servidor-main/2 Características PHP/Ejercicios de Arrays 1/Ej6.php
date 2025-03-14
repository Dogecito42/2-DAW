<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php 
    
        $paises= array("España"=>"Madrid", "Portugal" => "Lisboa", "Francia" => "París", "Alemania" => "Berlin", "Austria" => "Viena" );

        echo "Array sin ordenar: <br>";

        foreach($paises as $key=>$value){
            echo "Pais: ".$key." Capital: ".$value."<br>";
        }

        ksort($paises);

        echo "<br>Array ordenado por paises: <br>";

        foreach($paises as $key=>$value){
            echo "Pais: ".$key." Capital: ".$value."<br>";
        }

        asort($paises);

        echo "<br>Array ordenado por capitales: <br>";

        foreach($paises as $key=>$value){
            echo "Pais: ".$key." Capital: ".$value."<br>";
        }
    ?>
</body>
</html>
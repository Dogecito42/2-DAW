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
    
    
        while (count($replace)!=10){
            array_unshift($replace, "croqueta");
        }
    
        print_r($replace);
        echo "<br>";

        while (count($merge)!=10){
            array_push($merge, "melocotones");
        }
    
        print_r($merge);
        echo "<br>";
        
        $replace2=array_slice($replace, 3-1, 7-1);
        
        print_r($replace2);
        echo "<br>";
        
        $merge2=array_splice($merge, count($merge)-8, count($merge)-1);

        print_r($merge2);
        echo "<br>";
    ?>
</body>
</html>
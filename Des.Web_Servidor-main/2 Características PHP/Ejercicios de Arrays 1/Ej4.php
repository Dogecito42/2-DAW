<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php 
    $colores=array(
        "Colores fuertes"=> array("Rojo"=>"FF0000","Verde"=>"00FF00","Azul"=>"0000FF"),
        "Colores suaves"=> array("Rosa"=>"FE9ABC","Amarillo"=>"FDF189","Malva"=>"BC8F8F")
    );
    $coloresF=$colores["Colores fuertes"];
    $coloresS=$colores["Colores suaves"];
    
    echo "<table  style='width: 50%; border: 1px solid black; border-collapse: collapse;'><tr>";
    
    foreach ($coloresF as $color=>$cod){
        echo "<th style='border: 1px solid black; padding: 15px;' bgcolor=$cod>".$color.":".$cod."<br></th>";
    }
    echo "</tr><tr>";
    foreach ($coloresS as $color=>$cod){
        echo "<th style='border: 1px solid black; padding: 15px;' bgcolor=$cod>".$color.":".$cod."</th>";
    }

    echo "</table>";
    
    if (in_array("FF88CC", $coloresF)){
        echo "Se ha encontrado el color FF88CC como color fuerte";
    }
    if (in_array("FF0000", $coloresF)){
        echo "Se ha encontrado el color FF0000 como color fuerte";
    }
    if (in_array("FF88CC", $coloresS)){
        echo "Se ha encontrado el color FF88CC como color suave";
    }
    if (in_array("FF0000", $coloresS)){
        echo "Se ha encontrado el color FF0000 como color suave";
    }
    ?>
</body>
</html>
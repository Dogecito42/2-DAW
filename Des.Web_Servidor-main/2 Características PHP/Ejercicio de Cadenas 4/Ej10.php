<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php 
        $cad="Madero es un puto nigger reventado y php me come los cojones maderiles";
        $cont=0;

        for($i=0; $i<strlen($cad); $i++){

            if ($cad[$i]=='a' || $cad[$i]=='e'|| $cad[$i]=='i'|| $cad[$i]=='o'|| $cad[$i]=='u'){
                $cont++;
            }
        }

        echo("Número de vocales: ".$cont);
    ?>    
</body>
</html>
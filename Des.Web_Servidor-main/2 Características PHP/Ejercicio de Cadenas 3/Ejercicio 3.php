<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 3</title>
</head>
<body>
    <?php 
        $frase="Skibidi dop dop dop yes yes";
        $numero=0;
        for ($num=0; $num<=strlen($frase); ++$num){ 

            if ($frase[$num]=='a' ||$frase[$num]=='e'  || $frase[$num]=='i' || $frase[$num]=='o'|| $frase[$num]=='u'){
                $verif=true;
                $numero=$numero+1;
            }
        }

        switch ($verif){
            case true:
                echo "Tiene ".$numero." vocales";
                break;
            case false:
                echo "No tiene vocales";
        }
    ?>
</body>
</html>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php 
        $array=[10, 5, 20, 19, 30]; //Salida 84


        echo (sumaArray(count($array), $array));

        function sumaArray($leng, $array){
            $num=$array[$leng-1];
            if ($leng>1){
                return $num + sumaArray($leng-1, $array);
            }else{
                return $num;
            }
        }
    ?>
</body>
</html> 
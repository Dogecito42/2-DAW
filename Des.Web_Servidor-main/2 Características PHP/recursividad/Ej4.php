<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<?php 
    $array = array(20, 2, 18, 69, 15, 42);

    print_r(ordenar($array));

    function ordenar(&$array) {
        $n = count($array);
        $verif = false;

        for ($i = 0; $i < $n - 1; $i++) {
            
            
            if ($array[$i] > $array[$i + 1]) {
                $temp = $array[$i];
                $array[$i] = $array[$i + 1];
                $array[$i + 1] = $temp;
                $verif = true;
                break; 
            }
        }

        if ($verif) {
            return ordenar($array);
        }

        return $array;
    }
?>

</body>
</html>
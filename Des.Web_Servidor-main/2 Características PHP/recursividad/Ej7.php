<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<?php 
    $cad = "polla";
    $cad = str_replace(' ', '', $cad);

    $contI = 0;
    $contF = strlen($cad) - 1;

    echo palindromo($cad, $contI, $contF);

    function palindromo($cad, $contI, $contF) {
        if ($contI >= $contF) {
            return "Es palíndromo"; 
        }

        if ($cad[$contI] != $cad[$contF]) {
            return "No es palíndromo";
        }

        return palindromo($cad, $contI + 1, $contF - 1);
    }
?>

</body>
</html>
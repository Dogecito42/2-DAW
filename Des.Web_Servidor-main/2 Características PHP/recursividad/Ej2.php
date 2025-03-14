<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php 
        $num1=1;
        $num2=2;
        $rep=5;
        $cont=1;

        print (fibonacci($num1, $num2, $rep, $cont));

        function fibonacci($num1, $num2, $rep, $cont){
            $num2=$num1+$num2;
            $num1=$num2-$num1;

            echo ("Iteracion ".$cont.":<br>Num1: ".$num1." Num2: ".$num2."<br>");
            if ($rep>1)
                return fibonacci(($num2-$num1), ($num1+$num2), $rep-1, $cont+1);
        }
    ?>
</body>
</html>
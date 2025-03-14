<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php 

        $num=5;

        echo (suma($num));
        function suma($num){

            if ($num!=0){
                return $num + suma($num-1);
            }else{
                return 0;
            }
        }
    ?>
</body>
</html>
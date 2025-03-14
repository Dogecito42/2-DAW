<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php 
        $num=4;
        print (factorial($num));
        
        function factorial($num){
            if ($num<=1){
                return 1;
            }else{
                return $num *factorial($num-1);
            }
        }
    ?>
</body>
</html>
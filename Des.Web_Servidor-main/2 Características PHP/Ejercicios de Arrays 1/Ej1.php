<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php 
        $dias= array(1=>"Lunes",2=>"Martes",3=>"Miércoles",4=>"Jueves",5=>"Viernes",6=>"Sábado",7=>"Domingo");

        foreach ($dias as $num=>$dia){
            echo ("Día ".$num.": ".$dia."<br>");
        }
    ?>
</body>
</html>
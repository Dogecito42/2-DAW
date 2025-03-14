<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php 
        $alumnos=array(0=>"Caramona",1=>"Madero",2=>"Josete",3=>"Destroyxz",4=>"Pikachu");

        $alumnos2=array_slice($alumnos, 3);
        array_splice($alumnos, 3, 2);

        foreach ($alumnos as $num=>$alumno){
            echo ("Alumno ".$num.": ".$alumno."<br>");
        }
        foreach ($alumnos2 as $num=>$alumno2){
            echo ("Alumno ".$num.": ".$alumno2."<br>");
        }
    ?>
</body>
</html>
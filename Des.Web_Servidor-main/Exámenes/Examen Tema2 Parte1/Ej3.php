<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php 

        /*EJERCICIO3.- Diseñar una página web que almacene en dos variables y escriba
		el nombre de usuario y el dominio de una dirección de e-mail contenida
		en una variable*/
        
        $cadComp="madero@gmail.com"; //Correo con su dominio

        $cadenas=explode("@",$cadComp);
        $cad1=$cadenas[0]; //usuario 
        $cad2=$cadenas[1]; //dominio

        echo "El usuario es: $cad1 <br> El dominio es: $cad2";
    ?>
</body>
</html>
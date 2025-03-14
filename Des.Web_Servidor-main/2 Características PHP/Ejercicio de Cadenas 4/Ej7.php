<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php 
        $cadena= "Bienvenido a nuestro cine. Ha efectuado usted la decisión correcta.";

        //a) Ha efectuado usted la decisión correcta
        $partes=explode(". ",$cadena."<br>");

        echo($partes[1]);

        //b) Usted la decisión correcta.
        echo(ucfirst(substr($partes[1], strpos($partes[1], "usted"))));

        //c)Ha ef
        echo(substr($partes[1],0, strpos($partes[1], "ec"))."<br>");

        //d)Haq efectuado usted la decision correcta

        echo(substr_replace(substr($partes[1],0, strpos($partes[1], "ecta")), "q ",2, 1)."<br>");

        //e) Ine. Ha ef

        echo(ucfirst(substr($partes[0], strlen($partes[0] )-3).". ".substr($partes[1], 0, 5))."<br>"); //PREGUNTAR POR EL ". "

        //f) Ine. Ha efectuado usted la decicisón corr

        echo(ucfirst(substr($partes[0], strlen($partes[0] )-3).". ".substr($partes[1],0, strpos($partes[1], "ecta"))));
    ?>
</body>
</html>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 8</title>
</head>
<body>
    <?php

    $frase="Esta cadena tiene muchas letras";
    
    print("La primera ocurrencia de ‘a’ es ".strpos($frase, "a",0)."<br>");
    print("La primera ocurrencia de ‘m’ es ".strpos($frase,"m",0)."<br>");
    print("La primera ocurrencia de ‘tiene’ es ".strpos($frase,"tiene",0)."<br>");
    print("La primera ocurrencia desde el final de ‘a’ es ".strrpos($frase, "a")."<br>");
    print("La frase desde la aparición de la palabra “cadena” hasta el final es : " .strstr($frase,"cadena")."<br>");
    print("<br>Partes de la cadena:<br><br>");
    print(substr($frase, 12,)."<br>");
    print(substr($frase, 18, 6)."<br>");
    print(substr($frase, strlen($frase)-6)."<br>");
    print(substr($frase,-26,6)."<br>");
    print(substr($frase,4,-7)."<br>");

    ?>
</body>
</html>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 2</title>
</head>
<body>
    <?php 
        function infoPais($nombre, $capital, $nhab="muchos"){

            echo "La capital de ".$nombre." es ".$capital." y tiene ".$nhab." habitantes <br>";
        }

        infoPais("MaderoLandia","Usero");
        infoPais("PintaEsta", "FrancisSanchez", 13);
        infoPais("Jorgeuwu", "UserogayLand", 10000000.69);
    ?>
</body>
</html>
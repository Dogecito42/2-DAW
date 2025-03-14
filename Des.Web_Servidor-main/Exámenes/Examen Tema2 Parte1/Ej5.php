<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php 

    	/*EJERCICIO 5.-Verificar que el contenido de una variable es un número de teléfono en el formato XXX XX XX XX, 
        ten en cuenta que el primer dígito sólo pude ser 8 o 9 si es un télefono fijo o 6 o 7 si es móvil*/  

        $tlf="654 65 65 65"; //Siguiendo el formato XXX XX XX XX, donde si es telefono fijo empeiza por 8-9 y si es móvil 6-7
        $result=0;
        $result2=0;
        $patron_movil= "/^[6-7]\d{2} \d{2} \d{2} \d{2}$/"; //Patrón de móvil 
        $patron_fijo= "/^[8-9]\d{2} \d{2} \d{2} \d{2}$/"; //Patrón de fijo

        /*Explicar el patrón: ^ indica que empieza la cadena; [6-7] || [8-9] el valor del primer carácter; \d cualquier dígito 0-9;
        {2} el número \d aceptados antes de " "; $ fin de cadena*/
        
        $result=preg_match($patron_movil, $tlf); //Devuelve 0 si no coincide, y 1 si coincide
        $result2=preg_match($patron_fijo, $tlf); //Devuelve 0 si no coincide, y 1 si coincide
        if ($result!=0){
            echo "El número de teléfono $tlf es válido como teléfono móvil<br>";
        }else{
            echo "El número de teléfono $tlf no es válido como teléfono móvil <br>";
        }
        if ($result2!=0){
            echo "El número de teléfono $tlf es válido como teléfono fijo";
        }else{
             echo "El número de teléfono $tlf no es válido como teléfono fijo <br>";
        }
    ?>
</body>
</html>
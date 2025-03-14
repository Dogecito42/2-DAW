<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    
    <?php 
    
    	/*EJERCICIO 1.-Realizar una página web en la que, dada dos cadenas,
        un modo de comparación y un número de carácteres escriba qué cadena es
        mayor o menor que la otra según el modo de comparación especificado*/ 

        $modo= 4; //Integer 1-4
        $cad1="Hola9"; //Cadena a comparar
        $cad2="Hola10"; //Cadena a comparar

        $ncaracteres=4; //Longitud para comparar n carácteres en el caso de que modo sea 4
        $result=5; //Valor para funciones que devuelven un integer


        switch ($modo){
            case 1: //Comparación de cadenas normal
                $result=strcmp($cad1, $cad2);
                break;
            case 2: //Comparación de cadenas insensitible a mayúsculas y minúsculas 
                $result=strnatcasecmp($cad1, $cad2);
                break;
            case 3: //Comparación natural
                $result=strnatcmp($cad1, $cad2);
                break;

            case 4: //Comparación de los ncaracteres carácteres
                $result=strncasecmp($cad1, $cad2, $ncaracteres);

        }

        //Devuelve un resultado según el valor de $result
        
        if ($result<0){
            echo "$cad1 es menor que $cad2";
        }
        if ($result==0){
            echo "$cad1 es igual a $cad2";
        }
        if ($result>0){
            echo "$cad1 es mayor a $cad2";
        }
        
       
    ?>
</body>
</html>
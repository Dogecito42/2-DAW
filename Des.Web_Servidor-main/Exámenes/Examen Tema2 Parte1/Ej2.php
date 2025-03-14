<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=ç, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
     
    	/*EJERCICIO 2.-Realiza una página web que tenga dos variables numéricas, una con un valor y 
        otra con un formato.La página debe escribir el número en el formato especificado*/  

        $num=12; //Variable que va a mostrarse según el formato escogido
        $formato=7; //Variable del 1-6. En caso de otro valor, devolverá un mensaje de error

        switch ($formato){
            case 1: //Formato decimal
                $formato= "El valor pasado es %d en decimal";
                printf ($formato, $num);
                break;
            case 2: //Formato hexadecimal con letras mayúsculas
                $formato= "El valor pasado es %x en hexadecimal";
                printf ($formato, $num);
                break;
            case 3: //Formato hexadecimal con letras mayúsculas
                $formato= "El valor pasado es %X en hexadecimal";
                printf ($formato, $num);
                break;

            case 4: //Formato octal
                $formato= "El valor pasado es %o en octal";
                printf ($formato, $num);
                break;

            case 5: //Formato en notación científica
                $formato= "El valor pasado es %e en notación exponencial";
                printf ($formato, $num);
                break;

            case 6: //Formato en binario
                $formato= "El valor pasado es %b en binario";
                printf ($formato, $num);
                break;
            default: //en caso de elegir cualquier opción fuera de las permitidas (1-6)
                echo "Formato incorrecto!!!!";
        }
    ?>
</body>
</html>
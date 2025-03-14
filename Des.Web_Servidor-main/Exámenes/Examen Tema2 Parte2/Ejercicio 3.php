<?php 

//El string y la posicion de la palabra a eliminar

$cadena="Los colores blancos azul sabeis sacarlo";
$posicion= 5;

echo (borrarParam($cadena, $posicion));
function borrarParam($cadena, $posicion) {

    //Convertimos a array, donde cada posición es una palabra
    $array=explode(" ",$cadena);

   
    //Si se excede $posición del número de palabras, se le hace saber al usuario
    if ($posicion <0 || $posicion > count($array)){
        return "Valor fuera del rango";
    }else{

    //Elimina la palabra elegida
    unset($array[$posicion]);

    //Se vuelve a pasar el array a cadena
    $cadena=implode(" ",$array);
    return "Cadena modificada: $cadena";
    }
}
?>
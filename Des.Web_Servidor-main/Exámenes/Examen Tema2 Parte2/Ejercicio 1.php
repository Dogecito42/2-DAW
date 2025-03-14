<?php

/*Ejercicio de diseñar un arbol de navidad*/

$altura = 10;
$array = [];

echo arbolNavidad($array, $altura);
function arbolNavidad(&$array, $altura)
{


    for ($i = $altura; $i > 0; $i--) { //Para controlar cada línea del string

        $linea = [];

        for ($j = 1; $j < $i; $j++) { //Imprime los copitos de la izquierda

            array_push($linea, '*');
        }
        for ($j = $altura - $i; $j >= 0; $j--) { //Imprime las hojas de la izquierda y el centro (distintivo con el =)

            array_push($linea, '\\');
        }
        for ($j = $altura - $i; $j > 0; $j--) { //Imprime las hojas de la derecha
            array_push($linea, '\\');
        }

        for ($j = 1; $j < $i; $j++) { //imprime los copitos de la derecha

            array_push($linea, '*');
        }

        array_push($array, $linea); //Mete la linea al array del dibujo completo
    }

    $string = ""; //Crea la variable de la salida
    $string .= "<table>"; //Lo inicia con la tabla
    foreach ($array as $columna) {

        $string .= "<tr>"; //Cada fila, se crea la columna

        foreach ($columna as $valor) {

            switch ($valor) { //Si son hojas, se imprime con fondo azul y color verde
                case '\\':
                    $string .= "<td style='background-color: #00FFFF; color: #00FF00'>$valor</td>";
                    break;
                case '*': //Si son copitos, se imprime con fondo azul y color blanco
                    $string .= "<td style='background-color: #00FFFF; color: #FFFFFF'>$valor</td>";
                    break;
            }
        }

        $string .= "</tr>"; //Termina la columna
    }

    $string .= "</table>"; //Termina la tabla

    return $string;
}

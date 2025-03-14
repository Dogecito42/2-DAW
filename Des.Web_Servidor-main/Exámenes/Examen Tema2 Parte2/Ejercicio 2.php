<?php 

    //Array a ordenar y el tipo de ordenación
    $array=array(10, 45, 15, 28, 37, 14);

    $caso= 3;

    echo ordenar($array, $caso)."<br>".ordenar($array); 
    function ordenar($array, $caso = 1){ //Por defecto, caso será 1

        $resultado="";

        switch( $caso) { 
            case 1: //Ordena valores de menor a mayor
                asort( $array);
                foreach ($array as $clave => $valor){
                    $resultado .= "Posicion: $clave , Valor: $valor<br>";
                }
                break;
            case 2: //Ordena valores de mayor a menor
                arsort($array);
                foreach ($array as $clave => $valor){
                    $resultado .= "Posicion: $clave , Valor: $valor<br>";
                }
                break;
            case 3: //Ordena llaves de menor a mayor
                ksort($array);
                foreach ($array as $clave => $valor){
                    $resultado .= "Posicion: $clave , Valor: $valor<br>";
                }
                break;
            case 4: //Ordena llaves de menor a mayor
                krsort($array);
                foreach ($array as $clave => $valor){
                    $resultado .= "Posicion: $clave , Valor: $valor<br>";
                }
                break;
            default:
                $resultado = "Parámetro incorrecto";
                
        }

        return $resultado;

    }




    


    

?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php 
        $nombre="Joan";
        $apellido1="SALELLES";
        $appellido2="maeso";

        $opcion='M'; // L, U, M, si pones otra t zurro q no he puesto default

        echo(DevuelveNombre($opcion, $nombre, $apellido1, $appellido2));

        function DevuelveNombre($opcion, $nombre, $apellido1, $apellido2){

            switch ($opcion){
                case 'L': 
                    return (strtolower($nombre)." ".strtolower($apellido1)." ".strtolower($apellido2));
                case 'U':
                    return (strtoupper($nombre)." ".strtoupper($apellido1)." ".strtoupper($apellido2));

                case 'M':
                    return (ucfirst(strtolower($nombre))." ".ucfirst(strtolower($apellido1))." ".ucfirst(strtolower($apellido2)));
            }
        }
    ?>
</body>
</html>
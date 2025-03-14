<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <h2 style="color: blue;">Ej 2- Resultados del formulario</h2>
    <p>Datos a mostrar: </p>
    <ul>
        <li>
            Texto a mostrar : <?php $cadena = $_REQUEST['cadena'];
            echo ($cadena); ?>

        </li>
        <li>
            Sexo : <?PHP $sexo = $_REQUEST['sexo'];
            echo ($sexo); ?>
        </li>
        <li>
            Extras : <?php $extras = $_REQUEST['extras'];
            foreach ($extras as $extra) {
                echo "<BR>$extra\n";
            }
            ?>
        </li>

        <li>
            Visibilidad de archivos no disponible aún
        </li>

        <li>
            Contraseña : <?PHP $contra = $_REQUEST['contra'];
            echo ($contra); ?>
        </li>
        <li>
            Color : <?PHP $color = $_REQUEST['color'];
            echo ($color); ?>
        </li>

        <li>
            Idiomas : <?php $idiomas = $_REQUEST['idiomas'];
            foreach ($idiomas as $idioma) {
                echo "<BR>$idioma\n";
            }
            ?>
        </li>
        <li>
            Comentario : <?PHP $comentario = $_REQUEST['comentario'];
            echo ($comentario); ?>
        </li>


    </ul>
    <a href="Ej2_Entrada.php">[Nueva Búsqueda]</a>
</body>

</html>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title></title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="">
</head>

<body>
    <h2 style="color: blue;">Ej 1- Resultados del formulario</h2>
    <p>Datos a mostrar: </p>
    <ul>
        <li>
            Texto de búsqueda : <?php $cadena = $_REQUEST['cadena'];
            echo ($cadena); ?>

        </li>
        <li>
            Tipo : <?PHP $tipo = $_REQUEST['tipo'];
            echo ($tipo); ?>
        </li>
        <li>
            Género : <?php $genero = $_REQUEST['genero'];
            echo ($genero); ?>
        </li>
    </ul>
    <a href="Ej1_Entrada.php">Nueva Búsqueda</a>
</body>

</html>
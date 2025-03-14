<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <?php

    $error = '<p style="color: red;">¡Debe introducir el texto de búsqueda!</p>';

    if (!isset($_POST['cadena'])) {
        $cadena = "No definido";
    } else {
        $cadena = $_REQUEST['cadena'];
    }
    if (!isset($_POST['tipo'])) {
        $tipo = "No definido";
    } else {
        $tipo = $_REQUEST['tipo'];
    }
    if (!isset($_POST['genero'])) {
        $genero = "No definido";
    } else {
        $genero = $_REQUEST['genero'];
    }
    if (!isset($_POST['cadena']) || empty($_POST['cadena'])) {
    ?>
        <h1 style="color: blue;">Formulario Simple</h1>
        <h3 style="font-style: italic;">Búsqueda de canciones</h3>

        <div id="datos">
            <form action="<?php htmlspecialchars($_SERVER['PHP_SELF']) ?>" method="post">
                <label>Texto a buscar</label>
                <input type="text" name="cadena" value="" size="20">
                <?php
                if ($_SERVER['REQUEST_METHOD'] === 'POST' && empty($_POST['cadena'])) {
                    echo $error;
                }
                ?>
                <label>Buscar en </label>
                <input type="radio" name="tipo" value="1">Títulos de la canción
                <input type="radio" name="tipo" value="2">Nombres del álbum
                <input type="radio" name="tipo" value="3" checked>Ambos campos
                <br>
                <label>Género musical </label>
                <select name="genero">
                    <option value="1" selected>Todos</option>
                    <option value="2">Acústica</option>
                    <option value="3">Banda Sonora</option>
                    <option value="4">Blues</option>
                    <option value="5">Electrónica</option>
                    <option value="6">Folk</option>
                    <option value="7">Jazz</option>
                    <option value="8">New Age</option>
                    <option value="9">Pop</option>
                    <option value="0">Rock</option>
                </select>
                <br>
                <input type="submit" name="subir" value="Subir Datos">
            </form>
        </div>
    <?php
    } else {
    ?>
        <h2 style="color: blue;">Ej 1- Resultados del formulario</h2>
        <p>Datos a mostrar: </p>

        <ul>
            <li>

                Texto de búsqueda : <?php echo $cadena ?>

            </li>
            <li>
                Tipo : <?php echo $tipo ?>
            </li>
            <li>
                Género : <?php echo $genero ?>
            </li>
        </ul>
    <?php
        echo "<a href=" . htmlspecialchars($_SERVER['PHP_SELF']) . ">Nueva Búsqueda</a>";
    }

    ?>

    <style>
        #datos {
            border: 1px solid blue;
            padding: 15px;
        }
    </style>
</body>


</html>
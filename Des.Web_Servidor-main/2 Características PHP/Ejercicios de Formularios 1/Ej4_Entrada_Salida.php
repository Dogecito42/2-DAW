<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <?php

    if (isset($_POST['titulo'])) {
        $titulo = $_POST['titulo'];
    } else {
        $titulo = null;
    }
    if (isset($_POST['texto'])) {
        $texto = $_POST['texto'];
    } else {
        $texto = null;
    }

    if (!isset($_POST['titulo'])) {
    ?>
        <h1 style="color: blue;">Subida de Ficheros</h1>
        <h2 style="font-style: italic;">Insertar nueva noticia</h2>

        <div id="datos">
            <form action="<?php echo htmlspecialchars($_SERVER['PHP_SELF'])  ?>" method="post" enctype="multipart/form-data">
                <label for="titulo">Título : *</label>
                <input type="text" name="titulo">
                <br><br>

                <label for="texto">Texto : *</label>
                <textarea cols="50" rows="4" name="texto"></textarea>
                <br><br>

                <label for="categoria">Categoria : </label>
                <select name="categoria">
                    <option value="0" selected>promociones</option>
                    <option value="1">maderío de la sal</option>
                </select>
                <br><br>

                <label for="archivo">Imagen : </label>
                <input type="file" name="archivo">
                <br><br>

                <input type="submit" name="subir" value="Subir Datos">
            </form>
        </div>
    <?php }

    if (isset($_POST['titulo']) || isset($_POST['texto'])) {
    ?>
        <h1 style="color: blue;">Subida de Ficheros. Resultados del formulario</h1>
        <h2>Resultado de la inserción de la nueva noticia</h2>
    <?php
        errores($titulo, $texto);
    }


    function errores($titulo, $texto)
    {
        if ($titulo == null || $texto == null) {
            echo "<h4>No se ha podido realizar la inserción debido a los siguientes errores</h4>
                <ul>";

            if ($titulo == null) {
                echo "<li>Se requiere el título de la noticia</li>";
            }
            if ($texto == null) {
                echo "<li>Se requiere el texto de la noticia</li>";
            }
            echo '</ul>
                <a href="' . htmlspecialchars($_SERVER['PHP_SELF']) . '">[Volver]</a>';
        } else {
            noticia($titulo, $texto);
        }
    }

    function noticia($titulo, $texto)
    {
        $categoria = $_POST['categoria'];

        $archivo_nombre = $_FILES['archivo']['name'];
        $archivo_tmp = $_FILES['archivo']['tmp_name'];
        $archivo_destino = "img/" . basename($archivo_nombre);

        if (move_uploaded_file($archivo_tmp, $archivo_destino)) {
            echo "<p>La noticia ha sido recibida correctamente</p>";
        } else {
            echo '<p style="color:red;">Hubo un error al subir el archivo. Por favor, inténtelo nuevamente.</p>';
        }

    ?>
        <ul>
            <li>Título : $titulo</li>
            <li>Texto : $texto </li>
            <li>Categoría : $categoria</li>
            <li>Fichero : <a href=<?php echo $archivo_destino ?>><?php echo $archivo_nombre ?></a></li>
        </ul>

        <a href="<?php htmlspecialchars($_SERVER['PHP_SELF']) ?>">[Insertar otra noticia]</a>
    <?php
    }
    ?>
</body>

<style>
    #datos {
        border: 1px solid blue;
        padding: 15px;
    }
</style>

</html>
<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Gestión de Noticias</title>
</head>

<body>

    <?php
    $conexion = mysqli_connect('localhost', 'dwes', 'abc123.', 'inmobiliaria');
    if (!$conexion) {
        die("Error de conexión: " . mysqli_connect_error());
    }
    //Envío de formulario
    if ($_SERVER["REQUEST_METHOD"] == "POST") {
       
        //Eliminación de las seleccionadas
        if (isset($_POST["eliminar"])) {
            if (!empty($_POST['seleccionados'])) {
                $ids = implode(",", array: array_map('intval', $_POST['seleccionados']));
                $sql = "DELETE FROM noticias WHERE id IN ($ids)";
                mysqli_query($conexion, $sql);
            }
            header("Location: " . $_SERVER['PHP_SELF']);
            exit;
        }

        //Toma de datos
        elseif (isset($_POST["titulo"])) {
            $titulo = trim($_POST["titulo"]);
            $texto = trim($_POST["texto"]);
            $categoria = trim($_POST["categoria"]);
            $rutaCarpeta = "img/";

            //Comprobar si se ha subido una imagen
            if (!empty($_FILES["imagen"]["name"])) {
                $nombreArchivo = basename($_FILES["imagen"]["name"]);
                move_uploaded_file($_FILES["imagen"]["tmp_name"], $rutaCarpeta . $nombreArchivo);
            }
            $imagenRuta = $_FILES["imagen"]["name"];

            //Insertar en la base de datos
            $sql = "INSERT INTO noticias (titulo, texto, categoria, fecha, imagen) VALUES (?, ?, ?, NOW(), ?)";
            $stmt = mysqli_prepare($conexion, $sql);
            mysqli_stmt_bind_param($stmt, "ssss", $titulo, $texto, $categoria, $imagenRuta);
            mysqli_stmt_execute($stmt);
            mysqli_stmt_close($stmt);

            header("Location: " . $_SERVER['PHP_SELF']);
            exit;
        }
    }
    ?>

    <!-- Filtros -->
    <form method="GET">
        <label>Filtrar por categoría:</label>
        <select name="categoria">
            <option value="">Todas</option>
            <option value="promociones">Promociones</option>
            <option value="costas">Costas</option>
            <option value="ofertas">Ofertas</option>
        </select>
        <input type="submit" name="filtrar" value="Filtrar">
    </form>
    <br>

    <?php
    // Sentencia de filtro
    $condic = "";
    if (isset($_GET['categoria']) && !empty($_GET['categoria'])) {
        $categoriaFiltro = mysqli_real_escape_string($conexion, $_GET['categoria']);
        $condic = "WHERE categoria = '$categoriaFiltro'";
    }

    $consulta = "SELECT * FROM noticias $condic ORDER BY fecha DESC";
    $datos = mysqli_query($conexion, $consulta);

    if ($datos) {
        
        // Formulario que agrupa la tabla de datos y el botón de eliminación
        echo "<form method='POST'>";
        echo "<table border='1'>";
        echo "<tr>
            <th>Eliminar</th>
            <th>Título</th>
            <th>Texto</th>
            <th>Categoría</th>
            <th>Fecha</th>
            <th>Imagen</th>
          </tr>";
        while ($fila = mysqli_fetch_assoc($datos)) {
            echo "<tr>";
            echo "<td><input type='checkbox' name='seleccionados[]' value='" . $fila['id'] . "'></td>";
            echo "<td>" . htmlspecialchars($fila['titulo']) . "</td>";
            echo "<td>" . htmlspecialchars($fila['texto']) . "</td>";
            echo "<td>" . htmlspecialchars($fila['categoria']) . "</td>";
            echo "<td>" . htmlspecialchars($fila['fecha']) . "</td>";
            echo "<td>";
            if (!empty($fila['imagen'])) {
                echo "<img src='img/" . htmlspecialchars($fila['imagen']) . "' width='100' alt='Imagen'>";
            } else {
                echo "Sin imagen";
            }
            echo "</td>";
            echo "</tr>";
        }
        echo "</table>";
        echo "<input type='submit' name='eliminar' value='Eliminar seleccionados' style='margin: 10px; padding: 10px; background-color: red; color: white; border: none; cursor: pointer;'>";
        echo "</form>";
    }
    ?>

    <h1>Inserción de nueva noticia</h1>

    <div style="display: flex; align-items: center;">
        <form method="POST" enctype="multipart/form-data">
            <label>Título: *</label>
            <input type="text" name="titulo" required>

            <label>Texto: *</label>
            <textarea name="texto" required></textarea>

            <label>Categoría: *</label>
            <select name="categoria" required>
                <option value="promociones">Promociones</option>
                <option value="costas">Costas</option>
                <option value="ofertas">Ofertas</option>
            </select>

            <label>Imagen: </label>
            <input type="file" name="imagen" accept="image/*">

            <input type="submit" value="Guardar Noticia">
        </form>
    </div>

</body>

</html>


<style>
    #elim {
        display: flex;
    }

    table {
        width: 100%;
        border-collapse: collapse;
        font-family: Arial, sans-serif;
    }

    th,
    td {
        border: 1px solid #999;
        padding: 8px;
        text-align: left;
    }

    th {
        background-color: #0059b3;
        color: white;
        font-weight: bold;
    }

    h1 {
        color: #0059b3;
        font-size: 20px;
        font-weight: bold;
    }

    form {
        border: 1px dotted #0059b3;
        padding: 15px;

    }

    label {
        display: block;
        font-weight: bold;
        margin-top: 10px;
    }

    input[type="text"],
    textarea,
    select {
        width: 100%;
        padding: 5px;
        border: 1px solid #999;
    }

    textarea {
        height: 80px;
        resize: both;
    }

    input[type="file"] {
        margin-top: 5px;
    }

    input[type="submit"] {
        margin-top: 10px;
        padding: 5px 10px;
        border: 1px solid #999;
        background-color: #f1f1f1;
        cursor: pointer;
    }

    input[type="submit"]:hover {
        background-color: #ddd;
    }
</style>
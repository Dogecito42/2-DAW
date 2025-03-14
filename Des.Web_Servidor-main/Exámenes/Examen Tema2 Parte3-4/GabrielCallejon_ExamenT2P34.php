<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="estilo.css">

    <title>Document</title>
</head>

<body>


    <?php
    //Inicializar variables para contener los datos del formulario
    $nombre = "";
    $apellidos = "";
    $dni = "";
    $sexo = "";
    $merito = [];
    $pais = "";
    $comentario = "";


    if ($_SERVER["REQUEST_METHOD"] == "POST") { //Si se han enviado los datos, se almacenan en variables (en caso de no incluirse, estarán vacíos)

        $nombre = isset($_POST["nombre"]) ? $_POST["nombre"] : "";
        $apellidos = isset($_POST["apellidos"]) ? $_POST["apellidos"] : "";
        $dni = isset($_POST["dni"]) ? $_POST["dni"] : "";
        $sexo = isset($_POST["sexo"]) ? $_POST["sexo"] : "";
        $merito = isset($_POST["meritos"]) ? $_POST["meritos"] : [];
        $pais = isset($_POST["pais"]) ? $_POST["pais"] : "";
        $comentario = isset($_POST["comentario"]) ? $_POST["comentario"] : "";
    }

    if ($_SERVER["REQUEST_METHOD"] != "POST"  || ($nombre == "" || $apellidos == "" || $dni == "" ||
        !is_uploaded_file($_FILES["fichero"]["tmp_name"]))) { //Solo se puede mostrar los datos si se han insertado el nombre, apellidos, dni y fichero

        if ($_SERVER["REQUEST_METHOD"] != "POST") { //En caso de no haberse enviado los datos, se contará con un contador de visitas

            if (!file_exists("datos.txt")) {
                $file = fopen("datos.txt", "w+");
                fwrite($file, "0");
                rewind($file);
            } else {
                $file = fopen("datos.txt", "r+");
            }

            $contador = file_get_contents("datos.txt");
            $contador++;
            rewind($file);

            fwrite($file, $contador);

            fclose($file);
        }


    ?> <!-- Formulario -->
        <form action="<?php $_SERVER["PHP_SELF"] ?>" method="post" enctype="multipart/form-data">
            <label>Nombre: </label>
            <input type="text" name="nombre" value="<?php echo $nombre; ?>"> <?php if ($_SERVER["REQUEST_METHOD"] == "POST"  && $nombre == "") {
                                                                                    echo "Nombre no introducido";
                                                                                } ?>
            <br><br>

            <label>Apellidos: </label>
            <input type="text" name="apellidos" value="<?php echo $apellidos; ?>"> <?php if ($_SERVER["REQUEST_METHOD"] == "POST"  && $apellidos == "") {
                                                                                        echo "Apellidos no introducido";
                                                                                    } ?>
            <br><br>

            <label>DNI: </label>
            <input type="text" name="dni" value="<?php echo $dni; ?>"> <?php if ($_SERVER["REQUEST_METHOD"] == "POST"  && $dni == "") {
                                                                            echo "DNI no introducido";
                                                                        } ?>
            <br><br>

            <label>Sexo: </label>
            <input type="radio" name="sexo" value="Hombre">Hombre
            <input type="radio" name="sexo" value="Mujer">Mujer
            <br>

            <label>Méritos: </label>
            <br>
            <input type="checkbox" name="meritos[]" value="Carnet de Conducir Tipo B">Carnet de Conducir Tipo B
            <br>
            <input type="checkbox" name="meritos[]" value="20 años o más de experiencias">20 años o más de experiencias
            <br>
            <input type="checkbox" name="meritos[]" value="Discapacidad superior al 33%">Discapacidad superior al 33%
            <br>
            <input type="checkbox" name="meritos[]" value="Pensionista">Pensionista
            <br><br>

            <label>País de residencia: </label>
            <select name="pais">
                <option value="España">España</option>
                <option value="Portugal">Portugal</option>
                <option value="Francia">Francia</option>
            </select>
            <br><br>

            <label>Comentario: </label>
            <textarea name="comentario"></textarea>
            <br><br>

            <label>Foto carnet:</label>
            <input type="file" name="fichero"> <?php if ($_SERVER["REQUEST_METHOD"] == "POST" && !is_uploaded_file($_FILES["fichero"]["tmp_name"])) {
                                                    echo "Fichero no subido";
                                                } ?>
            <br><br>

            <input type="submit">

            <?php
            if ($_SERVER["REQUEST_METHOD"] != "POST") {
            ?>
                <p>¡Eres el visitante número <?php echo $contador ?> shur!</p>

        </form>

    <?php
            }
        } else { //Si se han enviado los datos requeridos, se procesará el tipo de imagen (si coincide el tipo se mostrará) y se mostrarán los datos

            if (is_uploaded_file($_FILES["fichero"]["tmp_name"])) {

                if (!is_dir("img")) {
                    mkdir("img");
                }
                $tipoFichero = mime_content_type($_FILES["fichero"]["tmp_name"]);

                if ($tipoFichero == "image/gif" || $tipoFichero == "image/jpg" || $tipoFichero == "image/jpeg" || $tipoFichero == "image/png" || $tipoFichero == "image/webp" || $tipoFichero == "image/avif") {


                    $nImg = $_FILES["fichero"]["name"];
                    move_uploaded_file($_FILES["fichero"]["tmp_name"], "img/" . $nImg);
                }
            }


    ?>
    <div>
        <h1>Resultados del formulario</h1>

        <p>Nombre: <?php echo $nombre ?></p>
        <p>Apellidos: <?php echo $apellidos ?></p>
        <p>DNI: <?php echo $dni ?></p>
        <p>Sexo: <?php echo $sexo ?></p>
        <p>Meritos:</p>
        <ul>
            <?php
            foreach ($merito as $merit) {

                echo "<li>$merit</li>";
            }
            ?>
        </ul>
        <p>País: <?php echo $pais ?></p>
        <p>Comentario: <?php echo $comentario ?></p>
        <p>Imagen: <?php ?></p>

        <?php
            if (is_uploaded_file($_FILES["fichero"]["tmp_name"]) || ($tipoFichero == "image/gif" || $tipoFichero == "image/jpg" || $tipoFichero == "image/jpeg" || $tipoFichero == "image/png" || $tipoFichero == "image/webp" || $tipoFichero == "image/avif")) {
        ?>
            <img src=<?php echo "img/$nImg" ?>>

        <?php
            } else {
                echo "<p>Formato inválido</p>";
            }
        ?>

        <br>
        <a href="<?php $_SERVER["PHP_SELF"] ?>">Volver al Formulario</a>
    <?php
        }
    ?>
    </div>
</body>

</html>
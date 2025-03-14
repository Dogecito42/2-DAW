<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <h1>Agencia de viajes Travelmas</h1>

    <?php
    $archivo = "datos.txt";

    if ($_SERVER['REQUEST_METHOD'] === 'POST') {
        $circuito = isset($_POST['Circuito']) ? htmlspecialchars($_POST['Circuito']) : "No definido";
        $destino = isset($_POST['Destino']) ? htmlspecialchars($_POST['Destino']) : "No definido";
        $duracion = isset($_POST['Duracion']) ? htmlspecialchars($_POST['Duracion']) : "No definido";
        $dias = isset($_POST['Dias']) ? htmlspecialchars($_POST['Dias']) : "No definido";

        $salida = fopen($archivo, "a+");
        fwrite($salida, "$circuito:$destino:$duracion:$dias\n");
        fclose($salida);

        header("Location: " . $_SERVER['PHP_SELF']);
        exit;
    }

    $salida = fopen($archivo, "r");
    ?>


    <table>
        <tr>
            <th>Nombre</th>
            <th>Destino</th>
            <th>Duración</th>
            <th>Salida</th>
        </tr>




        <?php
        while (!feof($salida)) {
            $linea = fgets($salida);
            $datos = explode(":", $linea);

            if (count($datos) === 4) {
                echo "<tr>
                <td>" . trim($datos[0]) . "</td>
                <td>" . trim($datos[1]) . "</td>
                <td>" . trim($datos[2]) . "</td>
                <td>" . trim($datos[3]) . "</td>
            </tr>";
            }
        }
        fclose($salida);

        ?>

    </table>
    <br><br><br>
    <form action="<?php echo htmlspecialchars($_SERVER['PHP_SELF']) ?>" method="post">
        <table>
            <tr>
                <td>Introduzca el nombre del circuito</td>
                <td><input type="text" name="Circuito" required></td>
            </tr>
            <tr>
                <td>Introduzca el destino</td>
                <td><input type="text" name="Destino" required></td>
            </tr>
            <tr>
                <td>Introduzca la duración</td>
                <td><input type="text" name="Duracion" required></td>
            </tr>
            <tr>
                <td>Introduzca los días de salida (,)</td>
                <td><input type="text" name="Dias" required></td>
            </tr>
            <tr>
                <td>
                    <input type="submit" value="Enviar">
                </td>
            </tr>
        </table>
    </form>
</body>

<style>
    table th {
        background-color: blueviolet;
    }

    table {
        background-color: blanchedalmond;
        border: 1px solid black;
    }

    table td {
        border: 1px solid gray;
    }
</style>

</html>
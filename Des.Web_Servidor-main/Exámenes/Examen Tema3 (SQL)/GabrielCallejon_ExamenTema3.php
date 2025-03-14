<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Document</title>
</head>

<body>

<h1>Examen</h1>
   
   <?php

    include "fecha.php";
    $conexion = mysqli_connect("localhost", "instituto", "instituto", "instituto"); //conexión a la bd

    if (!$conexion) {
        die("No va la vaina");
    }

    
    $letra = [];
    $curso = [];




    //Toma de los datos diferentes de alumnos y cursos

    array_push($letra, "Todo");
    array_push($curso, "Todo");

    $consulta = "SELECT DISTINCT letra FROM alumnos ORDER BY letra ASC";

    $query = mysqli_query($conexion, $consulta);

    while ($filas = mysqli_fetch_assoc($query)) {

        array_push($letra, $filas["letra"]);
    }

    $consulta = "SELECT DISTINCT curso FROM alumnos ORDER BY letra ASC";

    $query = mysqli_query($conexion, $consulta);

    while ($filas = mysqli_fetch_assoc($query)) {

        array_push($curso, $filas["curso"]);
    }

    //Consulta en caso de haber enviado datos al formulario

    if (isset($_POST["submit"])) {


        $valorLetra = $_REQUEST["Letra"];
        $valorCurso = $_REQUEST["Curso"];

        //Consultas según el dato
        if ($valorCurso == "Todo" && $valorLetra == "Todo") { //Los dos son todo       
            $consulta = "SELECT * FROM alumnos ORDER BY Apellidos ASC";

        }

        if ($valorCurso != "Todo" && $valorLetra != "Todo"){ //Los dos son diferente
            $consulta = "SELECT * FROM alumnos WHERE Letra='$valorLetra' AND Curso='$valorCurso' ORDER BY Apellidos ASC";

        }

        if ($valorCurso == "Todo" && $valorLetra != "Todo"){ //Curso es todo Letra diferente
            $consulta = "SELECT * FROM alumnos WHERE Letra='$valorLetra' ORDER BY Apellidos ASC";
        }

        if ($valorCurso != "Todo" && $valorLetra == "Todo"){ //Letra es todo Curso diferente

            $consulta = "SELECT * FROM alumnos WHERE Curso='$valorCurso' ORDER BY Apellidos ASC";
        }

           

        //Hacemos la tabla con la consulta

        $query = mysqli_query($conexion, $consulta);

        echo "<table>";
        echo "<tr>";
        echo "<th>N_Expediente</th>";
        echo "<th>Nombre</th>";
        echo "<th>Apellidos</th>";
        echo "<th>Fecha de Nacimiento</th>";
        echo "<th>Curso</th>";
        echo "<th>Letra</th>";
        echo "</tr>";

        while ($filas = mysqli_fetch_assoc($query)) {

            $fecha= date2string($filas["Fecha_nac"]); //Formato de fecha
            
            echo "<tr>";
            echo "<td>" . $filas["N_expdte"] . "</td>";
            echo "<td>" . $filas["Nombre"] . "</td>";
            echo "<td>" . $filas["Apellidos"] . "</td>";
            echo "<td>" . $fecha . "</td>";
            echo "<td>" . $filas["Curso"] . "</td>";
            echo "<td>" . $filas["Letra"] . "</td>";
            echo "</tr>";
        }


    } else { //En caso de no haber rellenado el formulario

        $consulta = "SELECT * FROM alumnos ORDER BY Apellidos ASC";

        $query = mysqli_query($conexion, $consulta);

        echo "<table>";
        echo "<tr>";
        echo "<th>N_Expediente</th>";
        echo "<th>Nombre</th>";
        echo "<th>Apellidos</th>";
        echo "<th>Fecha de Nacimiento</th>";
        echo "<th>Curso</th>";
        echo "<th>Letra</th>";
        echo "</tr>";

        while ($filas = mysqli_fetch_assoc($query)) {

            $fecha= date2string($filas["Fecha_nac"]); //Formato de fecha

            echo "<tr>";
            echo "<td>" . $filas["N_expdte"] . "</td>";
            echo "<td>" . $filas["Nombre"] . "</td>";
            echo "<td>" . $filas["Apellidos"] . "</td>";
            echo "<td>" . $fecha . "</td>";
            echo "<td>" . $filas["Curso"] . "</td>";
            echo "<td>" . $filas["Letra"] . "</td>";
            echo "</tr>";
        }
    }



    ?>

    <!-- Formulario de recogida de filtro-->
    <form action="GabrielCallejon_ExamenTema3.php" method="POST">
        <label>Curso:</label>
        <select name="Curso">
            <?php
            foreach ($curso as $num) {
                echo '<option value=' . $num . '>' . $num . '</option>';
            }
            ?>
        </select>

        <br>

        <label>Letra:</label>
        <select name="Letra">
            <?php
            foreach ($letra as $num) {
                echo '<option value=' . $num . '>' . $num . '</option>';
            }
            ?>
        </select>
        <br>
        <input type="submit" name="submit" value="Filtrar"></input>
    </form>
</body>

</html>

<style>
    /* General */
    BODY {
        font-family: verdana, arial, sans-serif;
        font-size: 10pt;
    }

    /* Contenido */
    H1 {
        font-size: 16pt;
        font-weight: bold;
        color: #0066CC;
    }

    H2 {
        font-size: 12pt;
        font-weight: bold;
        font-style: italic;
        color: black;
    }

    H3 {
        font-size: 10pt;
        font-weight: bold;
        color: black;
    }

    /* Formulario */
    FORM.borde {
        border: 1px dotted #0066CC;
        padding: 0.5em 0.2em;
        width: 80%;
    }

    FORM P {
        clear: left;
        margin: 0.2em;
        padding: 0.1em;
    }

    FORM P LABEL {
        float: left;
        width: 25%;
        font-weight: bold;
    }

    .error {
        color: red;
    }

    /* Tablas */
    TH {
        font-size: 10pt;
        font-weight: bold;
        color: white;
        background: #0066CC;
        text-align: left;
    }

    TD {
        font-size: 10pt;
        background: #CCCCCC;
    }

    TD.derecha {
        font-size: 10pt;
        text-align: right;
        background: #FFFFFF;
    }

    TD.izquierda {
        font-size: 10pt;
        text-align: left;
        background: #FFFFFF;
    }
</style>
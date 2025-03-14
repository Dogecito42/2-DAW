<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <h1 style='color: blue;'>Formulario Simple </h1>
    <h3 style='font-style: italic;'>Búsqueda de canciones </h3>


    <div id="datos">

        <form action="Ej1_Salida.php?valor=10" method="post">
            <label>Texto a buscar</label>
            <INPUT TYPE="text" NAME="cadena" VALUE="" SIZE="20">
            <br>
            <label>Buscar en </label>
            <INPUT TYPE="radio" NAME="tipo" VALUE="1">Títulos de la canción
            <INPUT TYPE="radio" NAME="tipo" VALUE="2">Nombres del álbum
            <INPUT TYPE="radio" NAME="tipo" VALUE="3" CHECKED>Ambos campos
            <br>
            <label>Género musical </label>
            <SELECT NAME="genero">
                <OPTION VALUE="1" SELECTED>Todos</OPTION>
                <OPTION VALUE="2">Acústica</OPTION>
                <OPTION VALUE="3">Banda Sonora</OPTION>
                <OPTION VALUE="4">Blues</OPTION>
                <OPTION VALUE="5">Electrónica</OPTION>
                <OPTION VALUE="6">Folk</OPTION>
                <OPTION VALUE="7">Jazz</OPTION>
                <OPTION VALUE="8">New Age</OPTION>
                <OPTION VALUE="9">Pop</OPTION>
                <OPTION VALUE="0">Rock</OPTION>
            </SELECT>
            <br>
            <INPUT TYPE="submit" NAME="subir" VALUE="Subir Datos"></INPUT>
        </form>
    </div>




</body>

<style>
    #datos {
        border: 1px solid blue;
        padding: 15px;
    }
</style>

</html>
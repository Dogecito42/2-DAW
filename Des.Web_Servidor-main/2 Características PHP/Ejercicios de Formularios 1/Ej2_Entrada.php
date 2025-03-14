<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <div id="datos">
        <form action="Ej2_Salida.php?valor=10" method="post">
            <h2 style="color: blue;">Elementos de entrada</h2>
            <h3 style="font-style : italic">Elementos de tipo INPUT</h3>

            <h4>TEXT</h4>
            <label for="cadena">Introduzca la cadena a mostrar: </label>
            <INPUT TYPE="text" NAME="cadena" VALUE="valor por defecto" SIZE="20">
            <hr>

            <h4>RADIO</h4>
            <label for="sexo">Sexo :</label>
            <INPUT TYPE="radio" NAME="sexo" VALUE="1" CHECKED>Mujer
            <INPUT TYPE="radio" NAME="sexo" VALUE="2">Hombre
            <hr>

            <h4>CHECKBOX</h4>
            <label for="extras">Extras :</label>
            <INPUT TYPE="checkbox" NAME="extras[]" VALUE="1" CHECKED>Garaje
            <INPUT TYPE="checkbox" NAME="extras[]" VALUE="2">Piscina
            <INPUT TYPE="checkbox" NAME="extras[]" VALUE="3">Jardín
            <hr>

            <h4>FILE</h4>
            <label for="fichero">Fichero : </label>
            <INPUT TYPE="file" NAME="fichero">
            <hr>

            <h4>HIDDEN</h4>
            <INPUT TYPE='hidden' NAME='hidden'>
            <hr>

            <h4>PASSWORD</h4>
            <label for="contra">Contraseña : </label>
            <INPUT TYPE='password' NAME="contra">
            <hr>

            <h3 style="font-style : italic">Elemento SELECT</h3>
            <h4>SELECT SIMPLE</h4>
            <label for="color">Color : </label>
            <select NAME="color">
                <OPTION VALUE="1" SELECTED>Rojo</OPTION>
                <OPTION VALUE="2" SELECTED>Azul</OPTION>
            </select>
            <hr>

            <h4>SELECT MÚLTIPLE</h4>
            <label for="idiomas">Idiomas : </label>
            <select MULTIPLE SIZE="3" NAME="idiomas[]">
                <OPTION VALUE="1" SELECTED>Rojo</OPTION>
                <OPTION VALUE="2" SELECTED>Azul</OPTION>
            </select>
            <hr>

            <h3 style="font-style=italic;">Elemento TEXTAREA</h3>
            <TEXTAREA COLS="50" ROWS="4" NAME="comentario">Este libro me parece ...
            </TEXTAREA>
            <hr>

            <INPUT TYPE="submit" NAME="subir" VALUE="Subir Datos"></INPUT>
            <INPUT TYPE="reset" NAME="borrar" VALUE="Limpiar datos"></INPUT>
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
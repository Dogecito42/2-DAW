<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <div class="form">
        <form action="pagina2.php?valor=10" method="post">
        <h1>Sugerencias para nuestra página web</h1>

        <label>Introduzca su nombre: </label>
        <input type="name" name="nombre">
        <br><br>
        <label>Comentario sobre esta página web:</label>
        <textarea name="comentario"></textarea>
        <br><br>
        <input type="submit" name="subir">
        </form>
    </div>
</body>

<style>
    .form {
        border: 1px solid blue;
        padding: 15px;
    }
    .form h1{
        color: blue;
    }
</style>
</html>
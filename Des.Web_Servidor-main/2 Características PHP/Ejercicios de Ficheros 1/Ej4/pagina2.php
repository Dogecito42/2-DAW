
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>

    <p>Los datos se guardaron correctamente</p>
    <p>--------------------------------------------------------</p>
    <?php $nombre =$_REQUEST['nombre']; 
    echo $nombre ?>
    <br>
    <?php $comentario= $_REQUEST['comentario']; 
    echo $comentario?>
    <p>--------------------------------------------------------</p>
    
    <?php 
    
    $salida = fopen("salida.txt", "r+");

    $texto="";
    
    while (!feof($salida)) {
        $texto .= fgets($salida);
    }
    $texto .= "$nombre\n$comentario\n--------------------------------------------------------\n";
    fwrite($salida, $texto);


    fclose($salida);
    
    ?>
    <a href="salida.txt">Ver Fichero</a>
</body>
</html>
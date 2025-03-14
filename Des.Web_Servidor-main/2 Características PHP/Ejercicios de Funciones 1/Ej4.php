<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 4</title>
</head>
<body>
    <?php 
        function escEncab($titulo){
           echo ( htmlspecialchars( "<!DOCTYPE html><br>
            <html lang='en'>
            <head>
                <meta charset='UTF-8'>
                <meta name='viewport' content='width=device-width, initial-scale=1.0'>
                <title>".$titulo."</title>
            </head>
            <body>
                
            </body>
            </html>"));
        }
        escEncab("Fran Pesao");
    ?>
</body>
</html>
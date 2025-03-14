<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Ejercicio 7</title>
</head>
<body>
<?php
$frase="MaderoEstaCansadoJefe";

	for ($num=0; $num<=strlen($frase);$num++){
		echo $frase[$num].$frase[$num];
	}
?>
</body>
</html>
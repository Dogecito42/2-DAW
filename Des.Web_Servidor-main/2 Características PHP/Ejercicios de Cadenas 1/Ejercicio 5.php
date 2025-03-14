<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Ejercicio 5</title>
</head>
<body>
	<?php
	$frase="Madera x Madero";

	$numero=substr_count($frase,"a");
	echo "El número de apariciones de 'a' son ".$numero."<br>";
	$final=strlen($frase);
	for ($i=0; $i<=$final; $i++){
		print( "El caracter '".$frase[$i]."' aparece ".$numero=substr_count($frase,"$frase[$i]")." veces"."<br>");
	}
	
	?>
</body>	
</html>
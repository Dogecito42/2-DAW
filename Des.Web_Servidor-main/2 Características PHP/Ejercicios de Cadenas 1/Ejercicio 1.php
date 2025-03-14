<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Ejercicio 1</title>
</head>
<body>
	<?php 
	$frase1="Si yo digo skibidi";
	$frase1=strtolower($frase1);
	$frase2="Tu dices toilet";
	$frase2=strtolower($frase2);

	$numero1=strlen($frase1);
	$numero2=strlen($frase2);

	if (($frase1[$numero1-3]==$frase2[$numero2-3])&&($frase1[$numero1-2]==$frase2[$numero2-2])&&($frase1[$numero1-1]==$frase2[$numero2-1])){
			print( "Riman");
		}elseif (($frase1[$numero1-2]==$frase2[$numero2-2])&&($frase1[$numero1-1]==$frase2[$numero2-1])){

			print( "Riman poco");

		}else{

			print("No Riman");	

		}
	?>
</body>
</html>
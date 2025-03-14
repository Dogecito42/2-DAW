<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Ejercicio 4</title>
</head>
<body>
	<?php
		$frase="Madero calla ya";
		$num=strpos($frase," ");
		$frase1=substr($frase,0,$num);
		$frase2=substr($frase,$num+1);
		$num=strpos($frase2," ");
		$frase2=substr($frase2,0,$num);

		echo $frase1." ".$frase2;
		
		?> 
</body>
</html>
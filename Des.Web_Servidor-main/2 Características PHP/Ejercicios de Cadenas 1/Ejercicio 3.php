<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Ejercicio 3</title>
</head>
<body>
	<?php
		$usuario="gcalsan_1812";
		$usuario=strtolower($usuario);
		$regex="/^[a-z0-9_-]{3,20}$/";

		if (preg_match($regex, $usuario)){
			echo "Usuario válido";
		}else{
			echo "Usuario inválido";
		}
	?>
</body>
</html>
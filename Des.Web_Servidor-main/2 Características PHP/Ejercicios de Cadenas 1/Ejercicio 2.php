<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Ejercicio 2</title>
</head>
<body>
	<?php  
		$frase="madero@gmail.com";

		if (filter_var($frase, FILTER_VALIDATE_EMAIL)){
			echo "correo verificado";
			}else{
				echo "correo inválido";
			}
	?>
</body>
</html>
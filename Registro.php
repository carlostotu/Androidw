<?php
	$con = mysqli_connect("localhost",  "root" "", "ejemplo_imc ");

	$Nombre_persona=$POST["Nombre_persona"] =;
	$Documento_identidad=$POST["Documento_identidad"]; 
	$Edad=$POST["Edad"];
	$Contraseña=$POST["Contraseña"]
	$Peso=$POST["Peso"]
	$Estatura=$POST["Estatura"]
	$Imc=$POST["Imc"] 
	$statement =mysql_prepare($con, "INSERT INTO persona  ( Nombre_persona, Documento_identidad, Edad, Contraseña) VALUES (?, ?, ?, ?)");
	mysqli_stmt_bind_param($statement, "siss", $Nombre_persona, $Documento_identidad, $Edad, $Contraseña, $Peso, $Estatura, $Imc);
	mysqli_stmt_excecute($statement);

	$responde = array();
	$response["succes"] = true;

	echo json_encode($response);
?>
<?php
$con=mysqli_connect("localhost", "root", "", "ejemplo_im");

$username = $_POST["username"];
$password = $_POST["password"];

$statement = mysqli_prepare($con, "SELECT * FROM user WHERE usernsame = ? AND  password =? ");
mysqli_stmt_bind_param($statement, "ss", $username, $password);
mysqli_stmt_execute($statement);

 
mysqli_stmt_store_result($statement);
mysqli_stmt_bind_result($statement, $Nombre_persona, $Documento_identidad, $Edad, $password);

$response = array ();
$responde ["succes"] = false;

while(mysqli_stmt_fetch($statement)){
	$response["succes"] = true;
	$response["Nombre_persona"] =$Nombre_persona;
	$response["Documento_identidad"] =$Documento_identidad;
	$response["Edad"] =$Edad;
	$response["password"] =$password;
}
		echo json_encode($reponse);
?>



<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title>Página PHP que está insertando en la Base de datos bd1</title>
    </head>
    <body>
        <?php
        //La base de datos a crear será nombre varchar(30), mail varchar(50) y codigo INT(11)
        // datos de conexión
        $host="127.0.0.1";
        $user="root";
        $password="";
        $database="ide";
        $port="3306";
        //Conectar a la base de datos
        $conexion= mysqli_connect($host, $user, $password) or die ("Problemas en la conexión");
        mysqli_select_db($conexion,$database) or die ("La conexión a la base de datos falla");
        //Obtener los valores del formulario en las variables
        $nombre= filter_input(INPUT_POST, "nombre");
        $mail= filter_input(INPUT_POST, "mail");
        $curso= filter_input(INPUT_POST, "codcurso");
        //Definición de la query
        $query="insert into alumnos (nombre,mail,codcurso) values ('$nombre','$mail',$curso)";
        //Ejecución de la query
        mysqli_query($conexion,$query) or die ("La sentencia INSERT falla con error".mysql_error());
        //Cierre de la conexión
        mysqli_close($conexion);
        echo "El Alumno fue dado de alta correctamente!!!";
        ?>
    </body>
</html>

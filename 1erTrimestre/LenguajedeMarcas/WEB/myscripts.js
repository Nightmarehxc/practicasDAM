
var LaFecha=new Date();
var Mes=new Array("Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre");
var diasem=new Array('domingo','lunes','martes','miercoles','jueves','viernes','sabado');
var diasemana=LaFecha.getDay();
var FechaCompleta="";
var NumeroDeMes="";
var hora = LaFecha.getHours() 
var minuto = LaFecha.getMinutes() 
var segundo = LaFecha.getSeconds() 

NumeroDeMes=LaFecha.getMonth();
FechaCompleta=diasem[diasemana]+" "+LaFecha.getDate()+" de "+Mes[NumeroDeMes]+" de "+LaFecha.getFullYear()+" "+hora+":"+minuto+":"+segundo;
//document.write (FechaCompleta);
document.getElementById("demo").innerHTML = FechaCompleta;

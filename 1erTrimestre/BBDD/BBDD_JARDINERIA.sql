drop database if exists jardineria;
create database jardineria;
use jardineria;


CREATE TABLE GamasProductos (
  Gama varchar(50) NOT NULL,
  Imagen blob,
  PRIMARY KEY (Gama)
);

CREATE TABLE Productos (
  CodigoProducto varchar(15) NOT NULL,
  Nombre varchar(70) NOT NULL,
  Gama varchar(50) NOT NULL,
  Dimensiones varchar(25) DEFAULT NULL,
  Proveedor varchar(50) DEFAULT NULL,
  CantidadEnStock smallint(6) NOT NULL,
  PrecioVenta decimal(15,2) NOT NULL,
  PrecioProveedor decimal(15,2) DEFAULT NULL,
  PRIMARY KEY (CodigoProducto),
  KEY Productos_gamaFK (Gama),
  CONSTRAINT Productos_gamaFK FOREIGN KEY (Gama) REFERENCES GamasProductos (Gama)
);

CREATE TABLE Pedidos (
  CodigoPedido int(11) NOT NULL,
  FechaPedido date NOT NULL,
  FechaEsperada date NOT NULL,
  FechaEntrega date DEFAULT NULL,
  Estado varchar(15) NOT NULL,
  CodigoCliente int(11) NOT NULL,
  PRIMARY KEY (CodigoPedido),
  KEY Pedidos_Cliente (CodigoCliente)
);

CREATE TABLE DetallePedidos (
  CodigoPedido int(11) NOT NULL,
  CodigoProducto varchar(15) NOT NULL,
  Cantidad int(11) NOT NULL,
  PrecioUnidad decimal(15,2) NOT NULL,
  NumeroLinea smallint(6) NOT NULL,
  PRIMARY KEY (CodigoPedido,CodigoProducto),
  KEY DetallePedidos_ProductoFK (CodigoProducto),
  CONSTRAINT DetallePedidos_PedidoFK FOREIGN KEY (CodigoPedido) REFERENCES Pedidos (CodigoPedido),
  CONSTRAINT DetallePedidos_ProductoFK FOREIGN KEY (CodigoProducto) REFERENCES Productos (CodigoProducto)
);

CREATE TABLE Oficinas (
  CodigoOficina varchar(10) NOT NULL,
  Ciudad varchar(30) NOT NULL,
  Pais varchar(50) NOT NULL,
  Region varchar(50) DEFAULT NULL,
  CodigoPostal varchar(10) NOT NULL,
  Telefono varchar(20) NOT NULL,
  LineaDireccion1 varchar(50) NOT NULL,
  LineaDireccion2 varchar(50) DEFAULT NULL,
  PRIMARY KEY (CodigoOficina)
);

CREATE TABLE Empleados (
  CodigoEmpleado int(11) NOT NULL,
  Nombre varchar(50)  NOT NULL,
  Apellido1 varchar(50) NOT NULL,
  Apellido2 varchar(50) DEFAULT NULL,
  Extension varchar(10) NOT NULL,
  Email varchar(100) NOT NULL,
  CodigoOficina varchar(10) NOT NULL,
  CodigoJefe int(11) DEFAULT NULL,
  Puesto varchar(50) DEFAULT NULL,
  PRIMARY KEY (CodigoEmpleado),
  KEY Empleados_OficinasFK (CodigoOficina),
  KEY Empleados_EmpleadosFK (CodigoJefe),
  CONSTRAINT Empleados_EmpleadosFK FOREIGN KEY (CodigoJefe) REFERENCES Empleados (CodigoEmpleado),
  CONSTRAINT Empleados_OficinasFK FOREIGN KEY (CodigoOficina) REFERENCES Oficinas (CodigoOficina)
);

CREATE TABLE Clientes (
  CodigoCliente int(11) NOT NULL,
  NombreCliente varchar(50) NOT NULL,
  NombreContacto varchar(30) DEFAULT NULL,
  ApellidoContacto varchar(30) DEFAULT NULL,
  Telefono varchar(15) NOT NULL,
  Fax varchar(15) NOT NULL,
  LineaDireccion1 varchar(50) NOT NULL,
  LineaDireccion2 varchar(50) DEFAULT NULL,
  Ciudad varchar(50) NOT NULL,
  Region varchar(50) DEFAULT NULL,
  Pais varchar(50)  DEFAULT NULL,
  CodigoPostal varchar(10) DEFAULT NULL,
  CodigoEmpleadoRepVentas int(11) DEFAULT NULL,
  LimiteCredito decimal(15,2) DEFAULT NULL,
  PRIMARY KEY (CodigoCliente),
  KEY Clientes_EmpleadosFK (CodigoEmpleadoRepVentas),
  CONSTRAINT Clientes_EmpleadosFK FOREIGN KEY (CodigoEmpleadoRepVentas) REFERENCES Empleados (CodigoEmpleado)
);

 CREATE TABLE Pagos (
  CodigoCliente int(11) NOT NULL,
  FormaPago varchar(40) NOT NULL,
  IDTransaccion varchar(50) NOT NULL,
  FechaPago date NOT NULL,
  Cantidad decimal(15,2) NOT NULL,
  PRIMARY KEY (CodigoCliente,IDTransaccion),
  CONSTRAINT Pagos_clienteFK FOREIGN KEY (CodigoCliente) REFERENCES Clientes (CodigoCliente)
);

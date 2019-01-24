SET AUTOCOMMIT=1;

CREATE DATABASE IF NOT EXISTS sanitat;

USE sanitat;

CREATE TABLE IF NOT EXISTS sanitat.HOSPITAL (
 HOSPITAL_COD   TINYINT (2) PRIMARY KEY,
 NOM            VARCHAR(10) NOT NULL,
 ADRECA         VARCHAR(20),
 TELEFON        VARCHAR(8),
 QTAT_LLITS     SMALLINT(3) UNSIGNED DEFAULT 0 );

CREATE INDEX HOSPITAL_NOM ON sanitat.HOSPITAL (NOM);


INSERT INTO sanitat.HOSPITAL VALUES (13,'Provincial','O Donell 50','964-4264',0);
INSERT INTO sanitat.HOSPITAL VALUES (18,'General','Atocha s/n','595-3111',0);
INSERT INTO sanitat.HOSPITAL VALUES (22,'La Paz','Castellana 1000','923-5411',0);
INSERT INTO sanitat.HOSPITAL VALUES (45,'San Carlos','Ciudad Universitaria', '597-1500',0);


CREATE TABLE IF NOT EXISTS sanitat.SALA (
 HOSPITAL_COD  TINYINT (2),
 SALA_COD      TINYINT (2),
 NOM           VARCHAR(20) NOT NULL,
 QTAT_LLITS    SMALLINT(3) UNSIGNED DEFAULT 0,
 CONSTRAINT SALA_PK PRIMARY KEY (HOSPITAL_COD, SALA_COD),
 INDEX IDX_SALA_HOSPITAL_COD (HOSPITAL_COD),
 FOREIGN KEY (HOSPITAL_COD) REFERENCES sanitat.HOSPITAL(HOSPITAL_COD)) ;

CREATE INDEX SALA_HOSP_NOM ON sanitat.SALA (HOSPITAL_COD, NOM);


INSERT INTO sanitat.SALA VALUES (13,3,'Cures Intensives',21);
INSERT INTO sanitat.SALA VALUES (13,6,'Psiqui�tric',67);
INSERT INTO sanitat.SALA VALUES (18,3,'Cures Intensives',10);
INSERT INTO sanitat.SALA VALUES (18,4,'Cardiologia',53);
INSERT INTO sanitat.SALA VALUES (22,1,'Recuperaci�',10);
INSERT INTO sanitat.SALA VALUES (22,6,'Psiqui�tric',118);
INSERT INTO sanitat.SALA VALUES (22,2,'Maternitat',34);
INSERT INTO sanitat.SALA VALUES (45,4,'Cardiologia',55);
INSERT INTO sanitat.SALA VALUES (45,1,'Recuperaci�',13);
INSERT INTO sanitat.SALA VALUES (45,2,'Maternitat',24);



UPDATE sanitat.HOSPITAL 
SET QTAT_LLITS = (SELECT SUM(QTAT_LLITS) 
                  FROM sanitat.SALA 
                  WHERE sanitat.HOSPITAL.HOSPITAL_COD = sanitat.SALA.HOSPITAL_COD);


CREATE TABLE IF NOT EXISTS sanitat.PLANTILLA (
 HOSPITAL_COD  TINYINT (2),
 SALA_COD      TINYINT (2),
 EMPLEAT_NO    SMALLINT(4) NOT NULL,
 COGNOM        VARCHAR (15) NOT NULL,
 FUNCIO        VARCHAR (10), 
 TORN          VARCHAR (1) CHECK (TORN IN ('M','T','N')),
 SALARI        INT (10),
 CONSTRAINT PLANTILLA_PK PRIMARY KEY (HOSPITAL_COD, SALA_COD, EMPLEAT_NO),
 INDEX IDX_PLANTILLA_HOSP_SALA (HOSPITAL_COD, SALA_COD),
 FOREIGN KEY (HOSPITAL_COD, SALA_COD) REFERENCES sanitat.SALA (HOSPITAL_COD, SALA_COD)) ;  

CREATE INDEX PLANTILLA_HOSP_COGNOM ON sanitat.PLANTILLA (HOSPITAL_COD, COGNOM);
CREATE INDEX PLANTILLA_HOSP_FUNCIO ON sanitat.PLANTILLA (HOSPITAL_COD, FUNCIO);
CREATE INDEX PLANTILLA_FUNCIO_HOSP_SALA ON sanitat.PLANTILLA (FUNCIO, HOSPITAL_COD, SALA_COD);


INSERT INTO sanitat.PLANTILLA VALUES(13,6,3754,'D�az B.','Infermera','T',2262000);
INSERT INTO sanitat.PLANTILLA VALUES(13,6,3106,'Hern�ndez J.','Infermer','T',2755000); 
INSERT INTO sanitat.PLANTILLA VALUES(18,4,6357,'Karplus W.','Intern','T',3379000);
INSERT INTO sanitat.PLANTILLA VALUES(22,6,1009,'Higueras D.','Infermera','T',2005000);
INSERT INTO sanitat.PLANTILLA VALUES(22,6,8422,'Bocina G.','Infermer','M',1638000);
INSERT INTO sanitat.PLANTILLA VALUES(22,2,9901,'Adams C.','Intern','M',2210000);
INSERT INTO sanitat.PLANTILLA VALUES(22,1,6065,'Rivera G.','Infermera','N',1626000);
INSERT INTO sanitat.PLANTILLA VALUES(22,1,7379,'Carlos R.','Infermera','T',2119000);
INSERT INTO sanitat.PLANTILLA VALUES(45,4,1280,'Amig� R.','Intern','N',2210000);
INSERT INTO sanitat.PLANTILLA VALUES(45,1,8526,'Frank H.','Infermera','T',2522000);



CREATE TABLE IF NOT EXISTS sanitat.MALALT (
 INSCRIPCIO    INT (5) PRIMARY KEY,  
 COGNOM        VARCHAR (15) NOT NULL,
 ADRECA        VARCHAR (20),
 DATA_NAIX     DATE,
 SEXE          CHAR (1) NOT NULL  CHECK (SEXE = 'H' OR SEXE = 'D'),
 NSS           CHAR(9)) ;

CREATE INDEX MALALT_NAIX_COGNOM ON sanitat.MALALT (DATA_NAIX, COGNOM);
CREATE INDEX MALALT_COGNOM_NAIX ON sanitat.MALALT (COGNOM, DATA_NAIX);


INSERT INTO sanitat.MALALT VALUES(10995,'Lagu�a M.','Goya 20','1956-05-16','H',280862482);
INSERT INTO sanitat.MALALT VALUES(18004,'Serrano V.','Alcala 12','1960-05-21','D',284991452);
INSERT INTO sanitat.MALALT VALUES(14024,'Fern�ndez M.','Recoletos 50','1967-06-23','D',321790059);
INSERT INTO sanitat.MALALT VALUES(36658,'Domin S.','Mayor 71','1942-01-01','H',160657471);
INSERT INTO sanitat.MALALT VALUES(38702,'Neal R.','Orense 11','1940-06-18','D',380010217);
INSERT INTO sanitat.MALALT VALUES(39217,'Cervantes M.','Peron 38','1952-02-29','H',440294390);
INSERT INTO sanitat.MALALT VALUES(59076,'Miller G.','Lopez de Hoyos 2','1945-09-16','D',311969044);
INSERT INTO sanitat.MALALT VALUES(63827,'Ru�z P.','Esquerdo 103','1980-12-26','H',100973253);
INSERT INTO sanitat.MALALT VALUES(64823,'Fraser A.','Soto 3','1980-07-10','D',285201776);
INSERT INTO sanitat.MALALT VALUES(74835,'Ben�tez E.','Argentina 5','1957-10-05','H',154811767);


CREATE TABLE IF NOT EXISTS sanitat.INGRESSOS (
 INSCRIPCIO    INT (5) PRIMARY KEY,
 HOSPITAL_COD  TINYINT (2) NOT NULL,
 SALA_COD      TINYINT (2) NOT NULL,
 LLIT          SMALLINT(4) UNSIGNED,
 INDEX IDX_INGRESSOS_INSCRIPCIO (INSCRIPCIO),
 INDEX IDX_INGRESSOS_HOSP_SALA (HOSPITAL_COD, SALA_COD),
 FOREIGN KEY (INSCRIPCIO) REFERENCES sanitat.MALALT(INSCRIPCIO),
 FOREIGN KEY (HOSPITAL_COD, SALA_COD) REFERENCES sanitat.SALA (HOSPITAL_COD, SALA_COD));

CREATE INDEX INGRESSOS_HOSP_SALA ON sanitat.INGRESSOS (HOSPITAL_COD, SALA_COD);


INSERT INTO sanitat.INGRESSOS VALUES(10995,13,3,1);
INSERT INTO sanitat.INGRESSOS VALUES(18004,13,3,2);
INSERT INTO sanitat.INGRESSOS VALUES(14024,13,3,3);
INSERT INTO sanitat.INGRESSOS VALUES(36658,18,4,1);
INSERT INTO sanitat.INGRESSOS VALUES(38702,18,4,2);
INSERT INTO sanitat.INGRESSOS VALUES(39217,22,6,1);
INSERT INTO sanitat.INGRESSOS VALUES(59076,22,6,2);
INSERT INTO sanitat.INGRESSOS VALUES(63827,22,6,3);
INSERT INTO sanitat.INGRESSOS VALUES(64823,22,2,1);



CREATE TABLE IF NOT EXISTS sanitat.DOCTOR (
 HOSPITAL_COD  TINYINT (2),
 DOCTOR_NO     SMALLINT(3),
 COGNOM        VARCHAR(13) NOT NULL,
 ESPECIALITAT  VARCHAR(16) NOT NULL,
 CONSTRAINT DOCTOR_PK PRIMARY KEY (HOSPITAL_COD, DOCTOR_NO),
 INDEX IDX_DOCTOR_HOSP (HOSPITAL_COD),
 FOREIGN KEY (HOSPITAL_COD) REFERENCES sanitat.HOSPITAL(HOSPITAL_COD)) ;


INSERT INTO sanitat.DOCTOR VALUES(13,435,'L�pez A.','Cardiologia');
INSERT INTO sanitat.DOCTOR VALUES(18,585,'Miller G.','Ginecologia');
INSERT INTO sanitat.DOCTOR VALUES(18,982,'Cajal R.','Cardiologia');
INSERT INTO sanitat.DOCTOR VALUES(22,453,'Galo D.','Pediatria');
INSERT INTO sanitat.DOCTOR VALUES(22,398,'Best K.','Urologia');
INSERT INTO sanitat.DOCTOR VALUES(22,386,'Cabeza D.','Psiquiatria');
INSERT INTO sanitat.DOCTOR VALUES(45,607,'Nico P.','Pediatria');
INSERT INTO sanitat.DOCTOR VALUES(45,522,'Adams C.','Neurologia');


CREATE INDEX DOCTOR_ESP_HOSP ON sanitat.DOCTOR (ESPECIALITAT, HOSPITAL_COD);
CREATE INDEX DOCTOR_HOSP_ESP ON sanitat.DOCTOR (HOSPITAL_COD, ESPECIALITAT);


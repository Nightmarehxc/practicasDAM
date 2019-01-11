ALTER TABLE alumnos
drop CONSTRAINT CHK_maxAlum CHECK (MaximoAlumnos  >= 15)
;
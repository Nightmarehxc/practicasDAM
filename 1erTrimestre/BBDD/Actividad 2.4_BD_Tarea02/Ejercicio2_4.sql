ALTER TABLE cursos
ADD CONSTRAINT CHK_maxAlum CHECK (MaximoAlumnos  >= 15)
;
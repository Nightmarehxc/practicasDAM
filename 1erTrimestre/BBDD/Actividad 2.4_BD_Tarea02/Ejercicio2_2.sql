ALTER TABLE alumnos
ADD CONSTRAINT CHK_PersonAge CHECK (edad between 14 and 65)
;
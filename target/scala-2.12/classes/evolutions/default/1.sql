#VEHICULO schema

# --- !Ups

CREATE TABLE VEHICULO (
    ID Integer NOT NULL,
    PLACA varchar(6) NOT NULL,
    TIPO_VEHICULO varchar(10) NOT NULL,
    FECHA_ENTRADA DATE,
    FECHA_SALIDA DATE,
    COSTO Integer,
    PRIMARY KEY (ID)
);

# --- !Downs

DROP TABLE VEHICULO;


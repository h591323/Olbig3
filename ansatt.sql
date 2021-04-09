DROP SCHEMA IF EXISTS oblig3 CASCADE;

CREATE SCHEMA oblig3;
SET search_path TO oblig3;
    


CREATE TABLE Ansatt
(
    id SERIAL,
    brukernavn VARCHAR(30) NOT NULL UNIQUE,
    fornavn VARCHAR(30) NOT NULL,
    etternavn VARCHAR(30) NOT NULL,
    ansdato DATE NOT NULL,
    stilling VARCHAR(30) NOT NULL,
    manedslonn INTEGER NOT NULL,  
    CONSTRAINT person_pk PRIMARY KEY (id)
);

INSERT INTO
  Ansatt(brukernavn, fornavn, etternavn, ansdato, stilling, manedslonn)
VALUES
    ('pvi', 'Per', 'Viskeler', '2015-06-22', 'Potetskreller', 20000),
    ('apa', 'Atle', 'Patle', '2018-08-10', 'Potetkoker', 25000),
    ('ddu', 'Donald', 'Duck', '2020-01-01', 'Potetspiser', 30000);

    





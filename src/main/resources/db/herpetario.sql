-- Herpetarium schema + seed data. Run once in pgAdmin (Query Tool) on the dev database.

CREATE TABLE IF NOT EXISTS especies (
    id_especie                   SERIAL PRIMARY KEY,
    nombre_comun                 VARCHAR(80)  NOT NULL,
    nombre_cientifico            VARCHAR(120) NOT NULL,
    frecuencia_alimentacion_dias INTEGER      NOT NULL,
    temp_min                     NUMERIC(4,1) NOT NULL,
    temp_max                     NUMERIC(4,1) NOT NULL,
    humedad_min                  INTEGER      NOT NULL,
    humedad_max                  INTEGER      NOT NULL,
    dieta                        VARCHAR(40)  NOT NULL,
    estado                       BOOLEAN      NOT NULL DEFAULT TRUE
);

CREATE TABLE IF NOT EXISTS reptiles (
    id_reptil           SERIAL PRIMARY KEY,
    nombre              VARCHAR(60) NOT NULL,
    id_especie          INTEGER     NOT NULL REFERENCES especies (id_especie),
    sexo                VARCHAR(1),
    fecha_nacimiento    DATE,
    peso_gramos         NUMERIC(7,1),
    ultima_alimentacion DATE,
    image_url           VARCHAR(500),
    notas               VARCHAR(500),
    estado              BOOLEAN     NOT NULL DEFAULT TRUE
);

INSERT INTO especies (nombre_comun, nombre_cientifico, frecuencia_alimentacion_dias, temp_min, temp_max, humedad_min, humedad_max, dieta) VALUES
    ('Gecko leopardo',      'Eublepharis macularius', 2,  24, 32, 30, 40, 'Insectívoro'),
    ('Pitón bola',          'Python regius',          10, 24, 32, 50, 60, 'Carnívoro'),
    ('Dragón barbudo',      'Pogona vitticeps',       1,  24, 40, 30, 40, 'Omnívoro'),
    ('Gecko crestado',      'Correlophus ciliatus',   2,  22, 27, 60, 80, 'Omnívoro'),
    ('Serpiente del maíz',  'Pantherophis guttatus',  7,  24, 30, 40, 50, 'Carnívoro'),
    ('Camaleón velado',     'Chamaeleo calyptratus',  1,  24, 35, 50, 70, 'Insectívoro');

INSERT INTO reptiles (nombre, id_especie, sexo, fecha_nacimiento, peso_gramos, ultima_alimentacion, notas) VALUES
    ('Mango',    1, 'F', '2024-03-15', 55,   '2026-11-21', 'Muda reciente'),
    ('Tofu',     1, 'M', '2023-07-02', 68,   '2026-11-22', NULL),
    ('Nala',     2, 'F', '2021-05-10', 1450, '2026-11-14', 'Come ratón descongelado'),
    ('Kaa',      2, 'M', '2022-09-01', 980,  '2026-11-10', NULL),
    ('Rex',      3, 'M', '2023-02-20', 420,  '2026-11-22', 'Le gusta la calabaza'),
    ('Sol',      3, 'F', '2024-06-11', 310,  '2026-11-23', NULL),
    ('Pistache', 4, 'M', '2024-01-08', 38,   '2026-11-20', NULL),
    ('Kiwi',     4, 'F', '2025-04-17', 22,   '2026-11-22', 'Juvenil'),
    ('Canela',   5, 'F', '2022-11-30', 520,  '2026-11-16', NULL),
    ('Fuego',    5, 'M', '2023-08-05', 450,  '2026-11-19', NULL),
    ('Yoda',     6, 'M', '2024-05-25', 140,  '2026-11-23', NULL),
    ('Jade',     6, 'F', '2025-02-14', 95,   '2026-11-22', 'Revisar hidratación');

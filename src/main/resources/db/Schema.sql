CREATE TABLE LEADER
(
    ID        SERIAL PRIMARY KEY NOT NULL,
    NAME      varchar(220)       NOT NULL,
    LASTNAME  varchar(220)       NOT NULL,
    LEADERAGE INTEGER            NOT NULL
);

CREATE TABLE PLANET
(
    ID                SERIAL PRIMARY KEY NOT NULL,
    PLANETNAME        varchar(220)       NOT NULL,
    COMMANDLEADERNAME varchar(220)       NOT NULL
);
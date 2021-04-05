CREATE TABLE LEADER
(
    ID        SERIAL PRIMARY KEY NOT NULL,
    NAME      varchar(220)       NOT NULL,
    LAST_NAME  varchar(220)       NOT NULL,
    AGE INTEGER            NOT NULL
);

CREATE TABLE PLANET
(
    ID                SERIAL PRIMARY KEY NOT NULL,
    PLANET_NAME        varchar(220)       NOT NULL,
    leader_id int references leader(id)
);
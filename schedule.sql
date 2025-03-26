USE sparta;

CREATE TABLE schedules (
                           id BIGINT PRIMARY KEY ,
                           title VARCHAR(20) NOT NULL ,
                           content VARCHAR(200) ,
                           password VARCHAR(8) ,
                           created_date TIMESTAMP NOT NULL ,
                           updated_date TIMESTAMP NOT NULL
);

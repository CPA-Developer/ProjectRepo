DROP TABLE IF EXISTS APPOINTMENT;

DROP TABLE IF EXISTS WORKER;

DROP TABLE IF EXISTS RESUMETABLE;

CREATE TABLE WORKER
(
    WORKER_ID INT PRIMARY KEY AUTO_INCREMENT,
    FIRST_NAME VARCHAR(30),
    LAST_NAME VARCHAR(25),
    JOB_TITLE VARCHAR(40)
);

CREATE TABLE APPOINTMENT
(
    APPOINTMENT_ID INT PRIMARY KEY AUTO_INCREMENT,
    APPOINTMENT_DATE VARCHAR(11),
    WORKER_ID INT,
    FOREIGN KEY(WORKER_ID) REFERENCES WORKER(WORKER_ID)
);

CREATE TABLE RESUMETABLE
(
    RESUMETABLE_ID INT PRIMARY KEY AUTO_INCREMENT,
    PHONE VARCHAR(10),
    EMAILADDRESS VARCHAR(17),
    WORKER_ID INT,
    FOREIGN KEY(WORKER_ID) REFERENCES WORKER(WORKER_ID)
);


INSERT INTO PERSON (firstName,lastName) VALUES ('Joe','Doe') ;
INSERT INTO ROLE (id,name) VALUES (1,'ROLE_USER');
INSERT INTO ROLE (id,name) VALUES (2,'ROLE_ADMIN');
INSERT INTO EMPLOYEE ( userName, password) VALUES ('user','lion');
INSERT INTO EMPLOYEE ( userName, password) VALUES ('admin','tiger');
INSERT INTO Employee_Role (Employee_id , roles_id) VALUES ((SELECT id FROM EMPLOYEE WHERE userName='user'),1);
INSERT INTO Employee_Role (Employee_id , roles_id) VALUES ((SELECT id FROM EMPLOYEE WHERE userName='admin'),1);
INSERT INTO Employee_Role (Employee_id , roles_id) VALUES ((SELECT id FROM EMPLOYEE WHERE userName='admin'),2);
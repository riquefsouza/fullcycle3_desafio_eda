DELETE FROM wallet.clients;
DELETE FROM wallet.accounts;
DELETE FROM wallet.transactions;
DELETE FROM microservice.clients;
DELETE FROM microservice.accounts;
DELETE FROM microservice.transactions;


INSERT INTO wallet.clients
(id, name, email, created_at)
VALUES('0126d054-b251-11ef-a024-0242ac140003', 'Manoel', 'manoel@gmail.com', '2024-11-21');
INSERT INTO wallet.clients
(id, name, email, created_at)
VALUES('10077c97-b251-11ef-a024-0242ac140003', 'Rafael', 'rafael@gmail.com', '2024-11-26');
INSERT INTO wallet.clients
(id, name, email, created_at)
VALUES('f1cae221-b255-11ef-a024-0242ac140003', 'Gabriel', 'gabriel@gmail.com', '2024-12-04');
INSERT INTO wallet.clients
(id, name, email, created_at)
VALUES('f24f4f30-b255-11ef-a024-0242ac140003', 'Marcos', 'marcos@gmail.com', '2024-11-21');
INSERT INTO wallet.clients
(id, name, email, created_at)
VALUES('f2c87e65-b255-11ef-a024-0242ac140003', 'Ana', 'ana@gmail.com', '2024-12-03');
INSERT INTO wallet.clients
(id, name, email, created_at)
VALUES('f3407bb5-b255-11ef-a024-0242ac140003', 'Diana', 'diana@gmail.com', '2024-11-24');


INSERT INTO wallet.accounts
(id, client_id, balance, created_at)
VALUES('856f52ff-b256-11ef-a024-0242ac140003', '0126d054-b251-11ef-a024-0242ac140003', 58404, '2024-11-22');
INSERT INTO wallet.accounts
(id, client_id, balance, created_at)
VALUES('b9e9f067-b256-11ef-a024-0242ac140003', '10077c97-b251-11ef-a024-0242ac140003', 1258, '2024-11-26');
INSERT INTO wallet.accounts
(id, client_id, balance, created_at)
VALUES('c1988cdc-b256-11ef-a024-0242ac140003', 'f1cae221-b255-11ef-a024-0242ac140003', 6587, '2024-11-28');
INSERT INTO wallet.accounts
(id, client_id, balance, created_at)
VALUES('c89d3290-b256-11ef-a024-0242ac140003', 'f24f4f30-b255-11ef-a024-0242ac140003', 95871, '2024-11-28');
INSERT INTO wallet.accounts
(id, client_id, balance, created_at)
VALUES('d01b733a-b256-11ef-a024-0242ac140003', 'f2c87e65-b255-11ef-a024-0242ac140003', 597, '2024-12-04');
INSERT INTO wallet.accounts
(id, client_id, balance, created_at)
VALUES('d833c315-b256-11ef-a024-0242ac140003', 'f3407bb5-b255-11ef-a024-0242ac140003', 6934, '2024-11-25');


INSERT INTO microservice.clients
(id, name, email, created_at)
VALUES('0126d054-b251-11ef-a024-0242ac140003', 'Manoel', 'manoel@gmail.com', '2024-11-21');
INSERT INTO microservice.clients
(id, name, email, created_at)
VALUES('10077c97-b251-11ef-a024-0242ac140003', 'Rafael', 'rafael@gmail.com', '2024-11-26');
INSERT INTO microservice.clients
(id, name, email, created_at)
VALUES('f1cae221-b255-11ef-a024-0242ac140003', 'Gabriel', 'gabriel@gmail.com', '2024-12-04');
INSERT INTO microservice.clients
(id, name, email, created_at)
VALUES('f24f4f30-b255-11ef-a024-0242ac140003', 'Marcos', 'marcos@gmail.com', '2024-11-21');
INSERT INTO microservice.clients
(id, name, email, created_at)
VALUES('f2c87e65-b255-11ef-a024-0242ac140003', 'Ana', 'ana@gmail.com', '2024-12-03');
INSERT INTO microservice.clients
(id, name, email, created_at)
VALUES('f3407bb5-b255-11ef-a024-0242ac140003', 'Diana', 'diana@gmail.com', '2024-11-24');


INSERT INTO microservice.accounts
(id, client_id, balance, created_at)
VALUES('856f52ff-b256-11ef-a024-0242ac140003', '0126d054-b251-11ef-a024-0242ac140003', 58404, '2024-11-22');
INSERT INTO microservice.accounts
(id, client_id, balance, created_at)
VALUES('b9e9f067-b256-11ef-a024-0242ac140003', '10077c97-b251-11ef-a024-0242ac140003', 1258, '2024-11-26');
INSERT INTO microservice.accounts
(id, client_id, balance, created_at)
VALUES('c1988cdc-b256-11ef-a024-0242ac140003', 'f1cae221-b255-11ef-a024-0242ac140003', 6587, '2024-11-28');
INSERT INTO microservice.accounts
(id, client_id, balance, created_at)
VALUES('c89d3290-b256-11ef-a024-0242ac140003', 'f24f4f30-b255-11ef-a024-0242ac140003', 95871, '2024-11-28');
INSERT INTO microservice.accounts
(id, client_id, balance, created_at)
VALUES('d01b733a-b256-11ef-a024-0242ac140003', 'f2c87e65-b255-11ef-a024-0242ac140003', 597, '2024-12-04');
INSERT INTO microservice.accounts
(id, client_id, balance, created_at)
VALUES('d833c315-b256-11ef-a024-0242ac140003', 'f3407bb5-b255-11ef-a024-0242ac140003', 6934, '2024-11-25');



DROP DATABASE IF EXISTS documenttypeservice;
DROP USER IF EXISTS `document_type_service`@`%`;
CREATE DATABASE IF NOT EXISTS documenttypeservice CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
CREATE USER IF NOT EXISTS `documenttypeservice`@`%` IDENTIFIED WITH mysql_native_password BY 'password';
GRANT SELECT, INSERT, UPDATE, DELETE, CREATE, DROP, REFERENCES, INDEX, ALTER, EXECUTE, CREATE VIEW, SHOW VIEW,
CREATE ROUTINE, ALTER ROUTINE, EVENT, TRIGGER ON `documenttypeservice`.* TO `document_type_service`@`%`;
FLUSH PRIVILEGES;
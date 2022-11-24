# create databases
CREATE DATABASE IF NOT EXISTS `projetoweb_dev`;
CREATE DATABASE IF NOT EXISTS `projetoweb_homol`;
CREATE DATABASE IF NOT EXISTS `projetoweb_prod`;

# create users and grant rights
CREATE USER 'myuserdev'@'%' IDENTIFIED BY 'myuserdev';
GRANT ALL PRIVILEGES ON projetoweb_dev.* TO 'myuserdev'@'%';

CREATE USER 'myuserhomol'@'%' IDENTIFIED BY 'myuserhomol';
GRANT ALL PRIVILEGES ON projetoweb_homol.* TO 'myuserhomol'@'%';

GRANT ALL PRIVILEGES ON projetoweb_prod.* TO 'myuserprod'@'%';

SHOW DATABASES;
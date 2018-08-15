# Use to run mysql db docker image, optional if youre not using a local mysqldb
# docker run --name mysqldb -p 3306:3306 -e MYSQL_ALLOW_EMPTY_PASSWORD=yes -d mysql

# connect to mysql and run as root user
#Create Databases
CREATE DATABASE nsprices_dev;
CREATE DATABASE nsprices_prod;

#Create database service accounts
CREATE USER 'nsp_dev_user'@'localhost' IDENTIFIED BY 'highway1';
CREATE USER 'nsp_prod_user'@'localhost' IDENTIFIED BY 'highway1';
CREATE USER 'nsp_dev_user'@'%' IDENTIFIED BY 'highway1';
CREATE USER 'nsp_prod_user'@'%' IDENTIFIED BY 'highway1';

#Database grants
GRANT SELECT ON nsprices_dev.* to 'nsp_dev_user'@'localhost';
GRANT INSERT ON nsprices_dev.* to 'nsp_dev_user'@'localhost';
GRANT DELETE ON nsprices_dev.* to 'nsp_dev_user'@'localhost';
GRANT UPDATE ON nsprices_dev.* to 'nsp_dev_user'@'localhost';
GRANT SELECT ON nsprices_prod.* to 'nsp_prod_user'@'localhost';
GRANT INSERT ON nsprices_prod.* to 'nsp_prod_user'@'localhost';
GRANT DELETE ON nsprices_prod.* to 'nsp_prod_user'@'localhost';
GRANT UPDATE ON nsprices_prod.* to 'nsp_prod_user'@'localhost';
GRANT SELECT ON nsprices_dev.* to 'nsp_dev_user'@'%';
GRANT INSERT ON nsprices_dev.* to 'nsp_dev_user'@'%';
GRANT DELETE ON nsprices_dev.* to 'nsp_dev_user'@'%';
GRANT UPDATE ON nsprices_dev.* to 'nsp_dev_user'@'%';
GRANT SELECT ON nsprices_prod.* to 'nsp_prod_user'@'%';
GRANT INSERT ON nsprices_prod.* to 'nsp_prod_user'@'%';
GRANT DELETE ON nsprices_prod.* to 'nsp_prod_user'@'%';
GRANT UPDATE ON nsprices_prod.* to 'nsp_prod_user'@'%';

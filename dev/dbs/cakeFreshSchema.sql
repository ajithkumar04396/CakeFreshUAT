
CREATE DATABASE cakeFreshUATDev;

USE cakeFreshUATDev;
CREATE SCHEMA cake_fresh;


USE cakeFreshUATDev;
CREATE TABLE cake_fresh.data_usertype(
    usertype_id int IDENTITY(1,1) NOT NULL PRIMARY KEY,
    usertype nvarchar(150)NOT NULL UNIQUE,
    created_date DATETIME2(6),
    is_active BIT NOT NULL
)
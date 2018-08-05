 create table CUSTOMER (
       CUSTOMERID bigint not null AUTO_INCREMENT,
        DATE_OF_BIRTH date,
        FIRST_NAME varchar(255),
        LAST_NAME varchar(255),
       
        primary key (customerid)
    );

 create table ADDRESS (
       ADDRESSID bigint not null AUTO_INCREMENT,
       ADDRESS_TYPE varchar(255), 
       ADDRESS_LINE1 varchar(255),
       ADDRESS_LINE2 varchar(255),
       ADDRESS_LINE3 varchar(255),
       SUBURB varchar(255),
       POSTCODE varchar(255),
       STATE varchar(255),
       COUNTRY varchar(255),
       primary key (ADDRESSID)
    );    
    
create table CUSTOMER_ADDRESS(
	customer_customerid bigint, 
	address_addressid bigint
);
create sequence HIBERNATE_SEQUENCE;

DROP TABLE IF EXISTS ACCOUNT;  
CREATE TABLE ACCOUNT ( 
    account_number INTEGER AUTO_INCREMENT  PRIMARY KEY,  
    account_name VARCHAR(50) NOT NULL,  
    amount INTEGER NOT NULL
);

CREATE TABLE IF NOT EXISTS TRANSACTION(
	id INTEGER AUTO_INCREMENT  PRIMARY KEY,
	transaction_type varchar(20),
	user_account_number integer,
	send_account_name varchar(20),
	send_account_number integer,
	receive_account_name varchar(20),
	receive_account_number integer,
	amount integer,
	status varchar(10),
	date date
);

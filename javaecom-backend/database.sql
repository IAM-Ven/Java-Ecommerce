
CREATE TABLE StoreCategory (
	
	id IDENTITY,
	name VARCHAR(25),
	active BOOLEAN,
	
	CONSTRAINT category_id PRIMARY KEY (id) 

);

INSERT INTO StoreCategory (name, active) VALUES ('Women', true);
INSERT INTO StoreCategory (name, active) VALUES ('Men', true);
INSERT INTO StoreCategory (name, active) VALUES ('Kids', true);

CREATE TABLE User (
	id IDENTITY,
	firstname VARCHAR(25),
	lastname VARCHAR(25),
	password VARCHAR(25),
	email VARCHAR(25),
	role VARCHAR(25),
	enabled BOOLEAN,

	CONSTRAINT user_id PRIMARY KEY(id),
);


INSERT INTO User
(firstname, lastname, password, email, role, enabled) 
VALUES ('Eyoel', 'Defare', 'Eyoel21', 'eyoel@gmail.com', 'admin', true);

INSERT INTO User
(firstname, lastname, password, email, role, enabled) 
VALUES ('Steve', 'Jobs', 'Iphone', 'steve@gmail.com', 'buyer', true);

INSERT INTO User
(firstname, lastname, password, email, role, enabled) 
VALUES ('', 'Lauka', 'Muna', 'lauka@gmail.com', 'buyer', true);


CREATE TABLE StoreProduct (
	id IDENTITY,
	code VARCHAR(20),
	name VARCHAR(50),
	brand VARCHAR(50),
	info VARCHAR(255),
	price DECIMAL(10,2),
	quantity INT,
	active BOOLEAN,
	summer boolean,
	winter boolean,
	category_id INT,
	user_id INT,
	purchases INT DEFAULT 0,
	views INT DEFAULT 0,
	
	CONSTRAINT product_id PRIMARY KEY (id),
 	CONSTRAINT product_category_id FOREIGN KEY (category_id) REFERENCES StoreCategory (id),
	CONSTRAINT product_user_id FOREIGN KEY (user_id) REFERENCES User(id),	
);	


INSERT INTO StoreProduct (code, name, brand, info, price, quantity,summer,winter, active, category_id, user_id)
VALUES ('HFJDJFUIDK', 'Brown Men Pant', 'Hfud', 'Very nice and cool pants', 789, 75,false,false, true, 1, 1 );

INSERT INTO StoreProduct (code, name, brand, info, price, quantity,summer,winter, active, category_id, user_id)
VALUES ('HFYRTFUDKS', 'Red Dress', 'Jdyi', 'Pretty dress', 34, 78, false,false,true, 2, 2 );

INSERT INTO StoreProduct (code, name, brand, info, price, quantity,summer,winter, active, category_id, user_id)
VALUES ('HFIDOFNCJU', 'Summer Flip Flop', 'Uido', 'Every lasting Flip Flops made by hands. Natural 100%.', 123, 23, false,false,true, 3, 3 );

INSERT INTO StoreProduct (code, name, brand, info, price, quantity, summer,winter,active, category_id, user_id)
VALUES ('KLDFUIDOFV', 'Wooden Sunglasses', 'Podi', '100% Polarizable glasses that look nice.', 90, 9, false,false,true,1, 1 );

INSERT INTO StoreProduct (code, name, brand, info, price, quantity, summer,winter,active, category_id, user_id)
VALUES ('EYUDOISYFH', 'Smooth coton hat', 'Jfud', 'Full coton hat mad of cotons found only in space. You will like this one. Buy it now.', 21, 5, false,false,true, 2, 2 );


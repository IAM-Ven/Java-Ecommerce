
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
VALUES ('Awsn', 'Lauka', 'Muna', 'lauka@gmail.com', 'buyer', true);


CREATE TABLE StoreProduct (
	id IDENTITY,
	code VARCHAR(25),
	name VARCHAR(50),
	image VARCHAR(25),
	brand VARCHAR(50),
	info VARCHAR(500),
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
 	CONSTRAINT product_category_id FOREIGN KEY (category_id) REFERENCES StoreCategory(id),
	CONSTRAINT product_user_id FOREIGN KEY (user_id) REFERENCES User(id),	
);	

INSERT INTO StoreProduct (code, name, image, brand, info, price, quantity,summer,winter, active, category_id, user_id)
VALUES ('HFYU323JHU7', 'Yellow Cut Shirt', 'p4','Hfud', 'These lightweight microfiber towels are an affordable option for all purpose wiping, cleaning and dusting. They can be laundered and reused many times. There are various color options for color coding cleaning tasks. These lightweight low pile microfiber towels work especially well on glass.
', 789, 75,true,false, true, 1, 1 );

INSERT INTO StoreProduct (code, name, image, brand, info, price, quantity,summer,winter, active, category_id, user_id)
VALUES ('JFKIEUO876H', 'Zebra Cross Stripe Dress', 'p5', 'IOI', 'These lightweight microfiber towels are an affordable option for all purpose wiping, cleaning and dusting. They can be laundered and reused many times. There are various color options for color coding cleaning tasks. These lightweight low pile microfiber towels work especially well on glass.
', 34, 3, true,false,true, 2, 2 );

INSERT INTO StoreProduct (code, name, image, brand, info, price, quantity,summer,winter, active, category_id, user_id)
VALUES ('LKDFGHYJ901', 'Cotton Purple Dress','model1', 'Uido', 'These lightweight microfiber towels are an affordable option for all purpose wiping, cleaning and dusting. They can be laundered and reused many times. There are various color options for color coding cleaning tasks. These lightweight low pile microfiber towels work especially well on glass.
', 123, 23, true,false,true, 3, 3 );

INSERT INTO StoreProduct (code, name, image, brand, info, price, quantity, summer,winter,active, category_id, user_id)
VALUES ('RTDYUHCNUDU', 'Workers Blue Cloth', 'model2', 'Podi', 'These lightweight microfiber towels are an affordable option for all purpose wiping, cleaning and dusting. They can be laundered and reused many times. There are various color options for color coding cleaning tasks. These lightweight low pile microfiber towels work especially well on glass.
', 90, 9, true,false,true,1, 1 );

INSERT INTO StoreProduct (code, name, image, brand, info, price, quantity, summer,winter,active, category_id, user_id)
VALUES ('LKIOUIJH232', 'Casual Women Attire', 'model3','FFF', 'These lightweight microfiber towels are an affordable option for all purpose wiping, cleaning and dusting. They can be laundered and reused many times. There are various color options for color coding cleaning tasks. These lightweight low pile microfiber towels work especially well on glass.
', 21, 5, false,true,true, 2, 2 );

INSERT INTO StoreProduct (code, name, image, brand, info, price, quantity, summer,winter,active, category_id, user_id)
VALUES ('HJDFUUIDFI', 'GYM designed Catton Towel', 'model4','LMK', 'These lightweight microfiber towels are an affordable option for all purpose wiping, cleaning and dusting. They can be laundered and reused many times. There are various color options for color coding cleaning tasks. These lightweight low pile microfiber towels work especially well on glass.
', 34, 523, false,true,true, 3, 3 );

INSERT INTO StoreProduct (code, name, image, brand, info, price, quantity,summer,winter, active, category_id, user_id)
VALUES ('HJDFDRETGS2', 'Colorful Stripe Designed Dress', 'model5', 'Hfud', 'These lightweight microfiber towels are an affordable option for all purpose wiping, cleaning and dusting. They can be laundered and reused many times. There are various color options for color coding cleaning tasks. These lightweight low pile microfiber towels work especially well on glass.
', 45, 67,false,true, true, 1, 1 );

INSERT INTO StoreProduct (code, name, image, brand, info, price, quantity,summer,winter, active, category_id, user_id)
VALUES ('NHDBCKIOP87', 'Pink Cotton Shirt', 'model6', 'Jdyi', 'These lightweight microfiber towels are an affordable option for all purpose wiping, cleaning and dusting. They can be laundered and reused many times. There are various color options for color coding cleaning tasks. These lightweight low pile microfiber towels work especially well on glass.
', 433, 898, true,true,true, 2, 2 );

INSERT INTO StoreProduct (code, name, image, brand, info, price, quantity,summer,winter, active, category_id, user_id)
VALUES ('90KIOLWED12', 'Full Yellow Shirt', 'model7', 'Uido', 'These lightweight microfiber towels are an affordable option for all purpose wiping, cleaning and dusting. They can be laundered and reused many times. There are various color options for color coding cleaning tasks. These lightweight low pile microfiber towels work especially well on glass.
', 65, 90, true,true,true, 3, 3 );

INSERT INTO StoreProduct (code, name, image, brand, info, price, quantity, summer,winter,active, category_id, user_id)
VALUES ('QAZWXS12WQS', 'Purple Shirt', 'p1', 'Adidas', 'These lightweight microfiber towels are an affordable option for all purpose wiping, cleaning and dusting. They can be laundered and reused many times. There are various color options for color coding cleaning tasks. These lightweight low pile microfiber towels work especially well on glass.
', 44, 56, true,true,false,1, 1 );

INSERT INTO StoreProduct (code, name, image, brand, info, price, quantity, summer,winter,active, category_id, user_id)
VALUES ('QWEASDZXSR1', 'Professional Men Suit', 'p2', 'Nike', 'These lightweight microfiber towels are an affordable option for all purpose wiping, cleaning and dusting. They can be laundered and reused many times. There are various color options for color coding cleaning tasks. These lightweight low pile microfiber towels work especially well on glass.
', 12, 12, true,true,true, 2, 2 );

INSERT INTO StoreProduct (code, name, image, brand, info, price, quantity, summer,winter,active, category_id, user_id)
VALUES ('IOWGSDCBX61', 'Women Gym Hoodi', 'p3', 'Jfud', 'These lightweight microfiber towels are an affordable option for all purpose wiping, cleaning and dusting. They can be laundered and reused many times. There are various color options for color coding cleaning tasks. These lightweight low pile microfiber towels work especially well on glass.
', 32, 23, true,true,false, 3, 3 );

INSERT INTO StoreProduct (code, name, image, brand, info, price, quantity,summer,winter, active, category_id, user_id)
VALUES ('MKNJHVGGFCD', 'Yellow Cut Shirt', 'p4', 'Hfud', 'These lightweight microfiber towels are an affordable option for all purpose wiping, cleaning and dusting. They can be laundered and reused many times. There are various color options for color coding cleaning tasks. These lightweight low pile microfiber towels work especially well on glass.
', 43, 323,true,false, true, 1, 1 );

INSERT INTO StoreProduct (code, name, image, brand, info, price, quantity,summer,winter, active, category_id, user_id)
VALUES ('IUDHSG2332D', 'Zebra Cross Stripe Dress', 'p5', 'Jdyi', 'These lightweight microfiber towels are an affordable option for all purpose wiping, cleaning and dusting. They can be laundered and reused many times. There are various color options for color coding cleaning tasks. These lightweight low pile microfiber towels work especially well on glass.
', 65, 56, false,true,true, 2, 2 );

INSERT INTO StoreProduct (code, name, image, brand, info, price, quantity, summer,winter,active, category_id, user_id)
VALUES ('MKNJBHVGYU2', 'Colorful Stripe Designed Dress', 'model5', 'Podi', 'These lightweight microfiber towels are an affordable option for all purpose wiping, cleaning and dusting. They can be laundered and reused many times. There are various color options for color coding cleaning tasks. These lightweight low pile microfiber towels work especially well on glass.
', 87, 65, true,false,true,3, 3 );



CREATE TABLE StoreCategory (

	id IDENTITY,
	name VARCHAR(50),
	info VARCHAR(255),
	image VARCHAR(50),
	active BOOLEAN,
	
	CONSTRAINT cat_id PRIMARY KEY (id)

);
create table clinic (
  id serial,
  name VARCHAR(255),
  description text,
  address varchar(150),
  contact varchar(30),
  PRIMARY KEY (id)
);

create table person (
  id serial,
  first_name VARCHAR(50),
  last_name VARCHAR(50),
  dtype varchar(1) not null,
  PRIMARY KEY (id)
);

create table address (
  id serial,
  city varchar(25),
  postal_code varchar(10),
  street varchar(50)
  PRIMARY KEY(id)
);
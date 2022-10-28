/* Populate tabla estudiantes */

INSERT INTO regiones (id, nombre) VALUES (1, 'Sudamérica');
INSERT INTO regiones (id, nombre) VALUES (2, 'Centroamérica');
INSERT INTO regiones (id, nombre) VALUES (3, 'Norteamérica');
INSERT INTO regiones (id, nombre) VALUES (4, 'Europa');
INSERT INTO regiones (id, nombre) VALUES (5, 'Asia');
INSERT INTO regiones (id, nombre) VALUES (6, 'Africa');
INSERT INTO regiones (id, nombre) VALUES (7, 'Oceanía');
INSERT INTO regiones (id, nombre) VALUES (8, 'Antártida');

INSERT INTO estudiantes (region_id, nombre, apellido, email, create_at, identificacion) VALUES(1, 'Jhon', 'Solis', 'mio@gmail.com', '2018-01-01', '7921005');
INSERT INTO estudiantes (region_id, nombre, apellido, email, create_at, identificacion) VALUES(2, 'Mr. John', 'Doe', 'john.doe@gmail.com', '2018-01-02', '7921006');
INSERT INTO estudiantes (region_id, nombre, apellido, email, create_at, identificacion) VALUES(4, 'Linus', 'Torvalds', 'linus.torvalds@gmail.com', '2018-01-03', '7921007');
INSERT INTO estudiantes (region_id, nombre, apellido, email, create_at, identificacion) VALUES(4, 'Rasmus', 'Lerdorf', 'rasmus.lerdorf@gmail.com', '2018-01-04', '7921008');
INSERT INTO estudiantes (region_id, nombre, apellido, email, create_at, identificacion) VALUES(4, 'Erich', 'Gamma', 'erich.gamma@gmail.com', '2018-02-01', '7921009');
INSERT INTO estudiantes (region_id, nombre, apellido, email, create_at, identificacion) VALUES(3, 'Richard', 'Helm', 'richard.helm@gmail.com', '2018-02-10', '7921000');
INSERT INTO estudiantes (region_id, nombre, apellido, email, create_at, identificacion) VALUES(3, 'Ralph', 'Johnson', 'ralph.johnson@gmail.com', '2018-02-18', '7921001');
INSERT INTO estudiantes (region_id, nombre, apellido, email, create_at, identificacion) VALUES(3, 'John', 'Vlissides', 'john.vlissides@gmail.com', '2018-02-28', '7921002');
INSERT INTO estudiantes (region_id, nombre, apellido, email, create_at, identificacion) VALUES(3, 'Dr. James', 'Gosling', 'james.gosling@gmail.com', '2018-03-03', '7921003');
INSERT INTO estudiantes (region_id, nombre, apellido, email, create_at, identificacion) VALUES(5, 'Magma', 'Lee', 'magma.lee@gmail.com', '2018-03-04', '7921004');
INSERT INTO estudiantes (region_id, nombre, apellido, email, create_at, identificacion) VALUES(6, 'Tornado', 'Roe', 'tornado.roe@gmail.com', '2018-03-05', '7921010');
INSERT INTO estudiantes (region_id, nombre, apellido, email, create_at, identificacion) VALUES(7, 'Jade', 'Doe', 'jane.doe@gmail.com', '2018-03-06', '7921011');

/* Creamos algunos usuarios con sus roles */
INSERT INTO usuarios (username, password, enabled, nombre, apellido, email, identificacion) VALUES ('7921005','$2a$10$C3Uln5uqnzx/GswADURJGOIdBqYrly9731fnwKDaUdBkt/M3qvtLq',true, 'Jhon', 'Solis','mio@correo.com', '7921005');
INSERT INTO usuarios (username, password, enabled, nombre, apellido, email, identificacion) VALUES ('7921006','$2a$10$RmdEsvEfhI7Rcm9f/uZXPebZVCcPC7ZXZwV51efAvMAp1rIaRAfPK',true, 'John', 'Doe','jhon.doe@bolsadeideas.com', '7921006');

INSERT INTO roles (nombre) VALUES ('ROLE_USER');
INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (1, 1);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2, 2);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2, 1);

/* Populate tabla productos */
INSERT INTO productos (nombre, precio, create_at) VALUES('Empanadas', 1500, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Perro Caliente Americano', 9000, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Salchipapa', 8000, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Hamburguesa', 10000, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Dedito de Queso', 1800, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Gaseosa Pequeña', 2500, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Jugo de Fruta', 4000, NOW());

/* Creamos algunas facturas */
INSERT INTO facturas (descripcion, observacion, cliente_id, create_at, estado) VALUES('Pedido 1', null, 1, NOW(), 'PEDIDO');

INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(1, 1, 1);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(2, 1, 4);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(1, 1, 5);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(1, 1, 7);

INSERT INTO facturas (descripcion, observacion, cliente_id, create_at, estado) VALUES('Pedido 2', 'Sin cebolla!', 1, NOW(), 'PEDIDO');
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(3, 2, 6);

INSERT INTO facturas (descripcion, observacion, cliente_id, create_at, estado) VALUES('Pedido 3', 'Sin cebolla!', 1, NOW(), 'PEDIDO');
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(3, 3, 6);
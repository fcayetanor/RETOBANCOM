/* Populate tabla user */

INSERT INTO user (username, lastname, cellphone, password, enabled, create_at) VALUES ('frank', 'cayetano', '987987987', '$2a$10$C3Uln5uqnzx/GswADURJGOIdBqYrly9731fnwKDaUdBkt/M3qvtLq', 1, '2024-02-01');
INSERT INTO user (username, lastname, cellphone, password, enabled, create_at) VALUES ('wilmer', 'cotrina', '999111222', '$2a$10$RmdEsvEfhI7Rcm9f/uZXPebZVCcPC7ZXZwV51efAvMAp1rIaRAfPK', 1, '2024-01-01');
INSERT INTO user (username, lastname, cellphone, password, enabled, create_at) VALUES ('julio', 'rios', '987654321', '$2a$10$C3Uln5uqnzx/GswADURJGOIdBqYrly9731fnwKDaUdBkt/M3qvtLq', 1, '2024-01-01');

INSERT INTO post (id_user, text) VALUES (1, 'Texto 1');
INSERT INTO post (id_user, text) VALUES (1, 'Texto 2');
INSERT INTO post (id_user, text) VALUES (2, 'Post usuario 2');
INSERT INTO post (id_user, text) VALUES (3, 'Post usuario 3');

INSERT INTO `roles` (nombre) VALUES ('ROLE_USER');
INSERT INTO `roles` (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO `users_roles` (user_id, role_id) VALUES (1, 1);
INSERT INTO `users_roles` (user_id, role_id) VALUES (2, 2);
INSERT INTO `users_roles` (user_id, role_id) VALUES (2, 1);
INSERT INTO `users_roles` (user_id, role_id) VALUES (3, 1);
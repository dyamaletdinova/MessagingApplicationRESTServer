INSERT INTO Usercredentials (usercred_id, user, password, enabled) VALUES (1, 'guest', 'guest', 1);
INSERT INTO Usercredentials (usercred_id, user, password, enabled) VALUES (2, 'admin', 'admin', 1);
INSERT INTO Usercredentials (usercred_id, user, password, enabled) VALUES (3, 'jane', 'jane', 1);
INSERT INTO Usercredentials (usercred_id, user, password, enabled) VALUES (4, 'jake', 'jake', 1);

INSERT INTO Authority (id, authority, usercred) VALUES (1, 'ROLE_ADMIN', 2);
INSERT INTO Authority (id, authority, usercred) VALUES (2, 'ROLE_USER', 1);
INSERT INTO Authority (id, authority, usercred) VALUES (3, 'CREATE', 3);
INSERT INTO Authority (id, authority, usercred) VALUES (4, 'READ', 4);

INSERT INTO User (user_id, firstname, lastname, email, usercred_id) VALUES (1, 'Curious', 'George', 'george@test.com', 2);
INSERT INTO User (user_id, firstname, lastname, email, usercred_id) VALUES (2, 'Allen', 'Rench', 'allen@test.com', 1);
INSERT INTO User (user_id, firstname, lastname, email, usercred_id) VALUES (3, 'Jane', 'Doe', 'jane@test.com', 3);
INSERT INTO User (user_id, firstname, lastname, email, usercred_id) VALUES (4, 'Jake', 'Smith', 'jake@test.com', 4);

INSERT INTO Groups (id, group_name) VALUES (1, 'GROUP_ADMIN');
INSERT INTO Groups (id, group_name) VALUES (2, 'GROUP_USER');

# populate admin here
INSERT INTO Groups_Authority (Groups_id, authority_id) VALUES (1, 1);
INSERT INTO Groups_Authority (Groups_id, authority_id) VALUES (1, 3);
INSERT INTO Groups_Authority (Groups_id, authority_id) VALUES (1, 4);

# populate user here
INSERT INTO Groups_Authority (Groups_id, authority_id) VALUES (2, 1);
INSERT INTO Groups_Authority (Groups_id, authority_id) VALUES (2, 4);

INSERT INTO Groups_Usercredentials (Groups_id, userCredentials_USERCRED_ID) VALUES (2, 1);
INSERT INTO Groups_Usercredentials (Groups_id, userCredentials_USERCRED_ID) VALUES (1, 2);
INSERT INTO Groups_Usercredentials (Groups_id, userCredentials_USERCRED_ID) VALUES (2, 3);
INSERT INTO Groups_Usercredentials (Groups_id, userCredentials_USERCRED_ID) VALUES (2, 4);

INSERT INTO travel_agency.user VALUES(1, 'Illarion', 'Ostapenko', 'larik','password');
INSERT INTO travel_agency.user VALUES(2, 'Roman', 'Mudryk', 'romchuk','password');

INSERT INTO travel_agency.country VALUES(1,'UA', 'Ukraine');
INSERT INTO travel_agency.country VALUES(2, 'PL','Poland');

INSERT INTO travel_agency.city VALUES(1, 'Kyiv', 'Taras Shevchenko',30,1);
INSERT INTO travel_agency.city VALUES(2, 'Lviv','Gorodotska',15, 1);
INSERT INTO travel_agency.city VALUES(3, 'Ternopil','Stepan Bandera',2, 1);
INSERT INTO travel_agency.city VALUES(4, 'Lublin','Warszawska',175,2);
INSERT INTO travel_agency.city VALUES(5, 'Warszawa','Emilii Plater',49, 2);
INSERT INTO travel_agency.city VALUES(6, 'Krakow','Marii Konopnickiej',33, 2);

INSERT INTO travel_agency.hotel VALUES(1, 'Hilton', 1);
INSERT INTO travel_agency.hotel VALUES(2, 'Astoria', 2);
INSERT INTO travel_agency.hotel VALUES(3, 'Avalon Palace', 3);
INSERT INTO travel_agency.hotel VALUES(4, 'Hotel Luxor', 4);
INSERT INTO travel_agency.hotel VALUES(5, 'InterContinental', 5);
INSERT INTO travel_agency.hotel VALUES(6, 'Hilton Garden Inn Krakow', 5);

INSERT INTO travel_agency.room VALUES(1, 1, 1);
INSERT INTO travel_agency.room VALUES(2, 2, 1);
INSERT INTO travel_agency.room VALUES(3, 3, 1);
INSERT INTO travel_agency.room VALUES(4, 1, 2);
INSERT INTO travel_agency.room VALUES(5, 2, 2);
INSERT INTO travel_agency.room VALUES(6, 3, 2);
INSERT INTO travel_agency.room VALUES(7, 1, 3);
INSERT INTO travel_agency.room VALUES(8, 2, 3);
INSERT INTO travel_agency.room VALUES(9, 3, 3);
INSERT INTO travel_agency.room VALUES(10, 1, 4);
INSERT INTO travel_agency.room VALUES(11, 2, 4);
INSERT INTO travel_agency.room VALUES(12, 3, 4);
INSERT INTO travel_agency.room VALUES(13, 1, 5);
INSERT INTO travel_agency.room VALUES(14, 2, 5);
INSERT INTO travel_agency.room VALUES(15, 3, 5);
INSERT INTO travel_agency.room VALUES(17, 1, 6);
INSERT INTO travel_agency.room VALUES(18, 2, 6);
INSERT INTO travel_agency.room VALUES(19, 3, 6);

INSERT INTO travel_agency.room_book VALUES(1, '2020-10-06','2020-09-29',  1, 2);
INSERT INTO travel_agency.room_book VALUES(2, '2019-08-01', '2019-07-03', 2, 1);
INSERT INTO travel_agency.room_book VALUES(3, '2019-09-15', '2019-06-24', 3, 4);

INSERT INTO travel_agency.room_book_archive VALUES(1, '2019-03-25', '2019-01-23', 2, 1);
INSERT INTO travel_agency.room_book_archive VALUES(2, '2019-02-15', '2019-01-10', 3, 2);

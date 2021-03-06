INSERT INTO travel_agency.user VALUES(1, 'Illarion', 'Ostapenko', 'password','ROLE_USER','larik');
INSERT INTO travel_agency.user VALUES(2, 'Roman', 'Mudryk', 'password','ROLE_MANAGEMENT','romchuk');

INSERT INTO travel_agency.country VALUES(1,'UA', 'Ukraine');
INSERT INTO travel_agency.country VALUES(2, 'PL','Poland');

INSERT INTO travel_agency.city VALUES(1, 'Kyiv', 1);
INSERT INTO travel_agency.city VALUES(2, 'Lviv', 1);
INSERT INTO travel_agency.city VALUES(3, 'Ternopil', 1);
INSERT INTO travel_agency.city VALUES(4, 'Lublin',2);
INSERT INTO travel_agency.city VALUES(5, 'Warszawa', 2);
INSERT INTO travel_agency.city VALUES(6, 'Krakow', 2);

INSERT INTO travel_agency.hotel VALUES(1, 'Hilton', 1);
INSERT INTO travel_agency.hotel VALUES(2, 'Astoria', 2);
INSERT INTO travel_agency.hotel VALUES(3, 'Avalon Palace', 3);
INSERT INTO travel_agency.hotel VALUES(4, 'Hotel Luxor', 4);
INSERT INTO travel_agency.hotel VALUES(5, 'InterContinental', 5);
INSERT INTO travel_agency.hotel VALUES(6, 'Hilton Garden Inn Krakow', 6);

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
INSERT INTO travel_agency.room VALUES(16, 1, 6);
INSERT INTO travel_agency.room VALUES(17, 2, 6);
INSERT INTO travel_agency.room VALUES(18, 3, 6);

INSERT INTO travel_agency.room_book VALUES(1, '2020-10-06','2020-09-29',  1, 2);
INSERT INTO travel_agency.room_book VALUES(2, '2019-07-21', '2019-08-03', 2, 1);
INSERT INTO travel_agency.room_book VALUES(3, '2020-08-15', '2020-09-04', 7, 2);

INSERT INTO travel_agency.room_book_archive VALUES(1, '2020-02-25', '2020-03-05', 2, 1);
INSERT INTO travel_agency.room_book_archive VALUES(2, '2020-05-15', '2020-05-24', 6, 2);


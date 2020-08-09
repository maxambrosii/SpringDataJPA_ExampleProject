Create DataBase FitnessClub;
Use FitnessClub;

Create table TypeTraining
(
	CodTraining Int PRIMARY KEY AUTO_INCREMENT,
	NameTraining Varchar(40)
);

/*
ALTER TABLE TypeTraining
ADD PRIMARY KEY (CodTraining);
*/

Insert into `TypeTraining`(`CodTraining`, `NameTraining`) VALUES
(101, 'Aerobnye trenirovki'),
(102, 'Silovye trenirovki'),
(103, 'Kardio trenirovki'),
(104, 'Smeshannye trenirovki'),
(105, 'Tantsevalnye trenirovki'),
(106, 'Nizkoudarnye trenirovki');

Create table Client
(
	CodClient Int PRIMARY KEY AUTO_INCREMENT,
	FIO_Client Varchar(40),
	Pol Char(1),
	Telefon Varchar(18),
	Rost SmallInt,
	Ves SmallInt,
	Age SmallInt 
);

Insert into `Client`(`CodClient`, `FIO_Client`, `Pol`, `Telefon`, `Rost`, `Ves`, `Age`) VALUES
(1, 'Chebotarjov Akakij Kuzmich', 'M', '078000001', 170, 88, 19),
(2, 'Janpolskaja Inga Andrianovna', 'F', '078000002', 180, 97, 20),
(3, 'Pivovarov Aleksandr Gavrilovich', 'M', '078000003', 170, 79, 18),
(4, 'Kartashov Richard Mitrofanovich', 'M', '078000004', 182, 63, 17),
(5, 'Dudnik Zhanna Timurovna', 'F', '078000005', 171, 73, 21),
(6, 'Korneev Tomas Feliksovich', 'M', '078000006', 186, 77, 24),
(7, 'Schegelskij Leonid Pavlovich', 'M', '078000007', 182, 76, 18),
(8, 'Snatkin Stanimir Nazarovich', 'M', '078000008', 169, 98, 19),
(9, 'Frantsev Valerij Ivanovich', 'M', '078000009', 170, 80, 20),
(10, 'Kudashov Iosif Egorovich', 'M', '079000010', 170, 69, 19),
(11, 'Loginov Stanislav Gavrilovich', 'M', '079000011', 174, 64, 22),
(12, 'Fanin Borislav Leonidovich', 'M', '078000012', 186, 75, 23),
(13, 'Shushalev Anufrij Germanovich', 'M', '067000013', 189, 100, 24),
(14, 'Hurtina Dominika Potapovna', 'F', '078000014', 184, 88, 25),
(15, 'Jarullina Polina Adamovna', 'F', '078000015', 187, 88, 26),
(16, 'Kolomijtseva Natalja Arsentievna', 'F', '069000016', 170, 91, 25),
(17, 'Bok Dorofej Gerasimovich', 'M', '067000017', 183, 68, 19),
(18, 'Anoshkin Velizar Filippovich', 'M', '067000018', 168, 70, 19),
(19, 'Lagutov Igor Tihonovich', 'M', '079000019', 185, 65, 19),
(20, 'Simakin Nikolaj Robertovich', 'M', '079000020', 189, 74, 20);


Create table GraphTraining
( 
	CodClient Int,
	FOREIGN KEY (CodClient) REFERENCES Client(CodClient),
	CodTraining Int,
	FOREIGN KEY (CodTraining) REFERENCES TypeTraining(CodTraining),
	DataBeginTraining Date,
	TimeBeginTraining Time,
	DurationTraining SmallInt
);

Insert into `GraphTraining`(`CodClient`, `CodTraining`, `DataBeginTraining`, `TimeBeginTraining`, `DurationTraining`) VALUES
(1, 101, '2017-09-01', '20:20:00', 90),
(2, 102, '2017-09-08', '16:10:00', 60),
(3, 103, '2017-09-09', '12:50:00', 80),
(4, 102, '2017-09-19', '18:10:00', 40),
(5, 101, '2017-09-22', '18:40:00', 50),
(6, 103, '2017-09-26', '13:00:00', 50),
(7, 102, '2017-09-27', '19:30:00', 80),
(8, 103, '2017-10-03', '11:30:00', 50),
(9, 101, '2017-10-04', '16:40:00', 90),
(10, 103, '2017-10-05', '15:00:00', 40),
(11, 102, '2017-10-10', '15:10:00', 50),
(12, 102, '2017-10-11', '12:40:00', 90),
(13, 101, '2017-10-12', '13:40:00', 40),
(14, 103, '2017-10-13', '17:50:00', 80),
(15, 103, '2017-10-15', '18:50:00', 40),
(16, 102, '2017-10-16', '16:00:00', 90),
(17, 103, '2017-10-17', '14:10:00', 70),
(18, 102, '2017-10-19', '19:40:00', 80),
(19, 103, '2017-10-21', '10:20:00', 90),
(20, 102, '2017-10-27', '21:00:00', 50);
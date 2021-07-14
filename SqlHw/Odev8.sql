CREATE TABLE employee (
	id SERIAL PRIMARY KEY,
	name VARCHAR(50) NOT NULL,
	birthday DATE,
	email VARCHAR(100)
)


insert into employee (name, birthday, email) values ('Nana', '1957-05-21', 'ngasquoine0@mozilla.com');
insert into employee (name, birthday, email) values ('Will', '1983-07-08', 'wmetheringham1@google.com.au');
insert into employee (name, birthday, email) values ('Ansley', '1991-01-16', 'ajirieck2@arizona.edu');
insert into employee (name, birthday, email) values ('Ethelyn', '1973-08-09', 'ecrombie3@cbslocal.com');
insert into employee (name, birthday, email) values ('Lem', '1951-05-14', 'lseiler4@cdbaby.com');
insert into employee (name, birthday, email) values ('Sonnie', '1955-12-25', 'sgascone5@washingtonpost.com');
insert into employee (name, birthday, email) values ('Lettie', '1990-03-22', 'lgrishaev6@google.pl');
insert into employee (name, birthday, email) values ('Wake', '1972-09-12', 'wdilnot7@posterous.com');
insert into employee (name, birthday, email) values ('Marianna', '1989-08-23', 'mmccray8@wordpress.com');
insert into employee (name, birthday, email) values ('Avie', '1997-09-15', 'adutt9@dell.com');
insert into employee (name, birthday, email) values ('Ynes', '1986-02-16', 'ylockneya@exblog.jp');
insert into employee (name, birthday, email) values ('Shara', '1990-10-23', 'shadnyb@google.de');
insert into employee (name, birthday, email) values ('Jervis', '1971-08-03', 'jlecordierc@senate.gov');
insert into employee (name, birthday, email) values ('Grady', '1979-03-03', 'gbiddled@symantec.com');
insert into employee (name, birthday, email) values ('Hyatt', '1958-09-01', 'hcattralle@edublogs.org');
insert into employee (name, birthday, email) values ('Dyan', '1975-05-01', 'dmotherwellf@nymag.com');
insert into employee (name, birthday, email) values ('Sim', '1960-02-12', 'sspenclayg@chron.com');
insert into employee (name, birthday, email) values ('Neilla', '1985-08-27', 'ncasoneh@examiner.com');
insert into employee (name, birthday, email) values ('Nat', '1997-09-10', 'nsallteri@prlog.org');
insert into employee (name, birthday, email) values ('Abeu', '1979-03-18', 'afeverj@baidu.com');
insert into employee (name, birthday, email) values ('Finlay', '1976-04-25', 'fslaffordk@geocities.com');
insert into employee (name, birthday, email) values ('Ainslie', '1997-08-31', 'agrunderl@diigo.com');
insert into employee (name, birthday, email) values ('Heida', '1970-05-09', 'hblazym@usa.gov');
insert into employee (name, birthday, email) values ('Fitz', '1973-04-12', 'fmozzinin@discovery.com');
insert into employee (name, birthday, email) values ('Gabbie', '1952-10-15', 'gbirtleso@simplemachines.org');
insert into employee (name, birthday, email) values ('Rolph', '1971-01-10', 'rpayfootp@1688.com');
insert into employee (name, birthday, email) values ('Janina', '1957-03-28', 'jelstobq@oaic.gov.au');
insert into employee (name, birthday, email) values ('Dianemarie', '1980-01-23', 'dhaddingtonr@washington.edu');
insert into employee (name, birthday, email) values ('Lee', '1989-05-22', 'lspratlings@nytimes.com');
insert into employee (name, birthday, email) values ('Ashlie', '1998-12-19', 'asampsont@last.fm');
insert into employee (name, birthday, email) values ('Joan', '1998-03-12', 'jglaumu@marriott.com');
insert into employee (name, birthday, email) values ('Arther', '1977-04-03', 'aocorhanev@webs.com');
insert into employee (name, birthday, email) values ('Tyson', '1962-07-04', 'tmalekw@usda.gov');
insert into employee (name, birthday, email) values ('Milissent', '1980-06-14', 'mcorderox@phpbb.com');
insert into employee (name, birthday, email) values ('Mandi', '1961-05-28', 'mdesaveryy@dell.com');
insert into employee (name, birthday, email) values ('Penni', '1966-03-13', 'pmeachz@altervista.org');
insert into employee (name, birthday, email) values ('Tresa', '1959-06-01', 'ttomaszewicz10@timesonline.co.uk');
insert into employee (name, birthday, email) values ('Andreas', '1981-04-01', 'aadney11@icq.com');
insert into employee (name, birthday, email) values ('Genni', '1968-12-28', 'gstiles12@biglobe.ne.jp');
insert into employee (name, birthday, email) values ('Norrie', '1990-08-23', 'nskelding13@mail.ru');
insert into employee (name, birthday, email) values ('Cornela', '1987-03-29', 'cgrisbrook14@house.gov');
insert into employee (name, birthday, email) values ('Corabelle', '1980-11-16', 'cpulman15@china.com.cn');
insert into employee (name, birthday, email) values ('Jeniece', '1981-04-23', 'jstrelitzki16@google.cn');
insert into employee (name, birthday, email) values ('Arielle', '1990-09-29', 'afellenor17@independent.co.uk');
insert into employee (name, birthday, email) values ('Giraud', '1968-02-06', 'gblannin18@umich.edu');
insert into employee (name, birthday, email) values ('Gerrie', '1993-04-15', 'glebourn19@amazon.com');
insert into employee (name, birthday, email) values ('Dollie', '1987-12-31', 'djeschner1a@craigslist.org');
insert into employee (name, birthday, email) values ('Carmelia', '1976-04-11', 'crookwell1b@goo.ne.jp');
insert into employee (name, birthday, email) values ('Devlin', '1995-04-18', 'dtewkesberrie1c@netscape.com');
insert into employee (name, birthday, email) values ('Sharity', '1964-03-27', 'scardwell1d@networkadvertising.org');


UPDATE employee 
SET name = 'Ozan'
WHERE id = 4;
--
UPDATE employee 
SET birthday = '1992-01-01'
WHERE name = 'Ozan';
--
UPDATE employee 
SET email = 'ozan@soyak.com'
WHERE birthday = '1992-01-01';
--
UPDATE employee 
SET name = 'Soyak'
WHERE name = 'Lem';
--
UPDATE employee 
SET email = 'asd@asd.com'
WHERE id = 15;


DELETE FROM employee
WHERE id = 20
RETURNING *;
--
DELETE FROM employee
WHERE name = 'Jervis'
RETURNING *;
--
DELETE FROM employee
WHERE birthday = '1997-09-10'
RETURNING *;
--
DELETE FROM employee
WHERE email = 'tmalekw@usda.gov'
RETURNING *;

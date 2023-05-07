USE clinical_reports;

DROP TABLE IF EXISTS patient;

CREATE TABLE patient (
    id INT(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `name` VARCHAR(50) NOT NULL,
    email VARCHAR(250) NOT NULL,
    address VARCHAR(250) NOT NULL,
    phone VARCHAR(10) NOT NULL,
    med_insurance VARCHAR(250) NOT NULL,
    vis_insurance VARCHAR(250) NOT NULL,
    den_insurance VARCHAR(250) NOT NULL,
    dob DATE NOT NULL,
    sex VARCHAR(10) NOT NULL
);

INSERT INTO patient (`name`, email, address, phone, med_insurance, vis_insurance, den_insurance, dob, sex)
VALUES
    ('Emily Johnson', 'emilyj@gmail.com', '1234 Main St, Toronto, ON M1R 4R8, Canada', '4165551234', 'Aetna', 'VSP', 'Delta', '1989-05-23', 'Female'),
    ('Mohammed Ali', 'mali@yahoo.com', '5678 1st Ave, Vancouver, BC V6K 1C6, Canada', '6045552345', 'Cigna', 'Aetna', 'MetLife', '1997-12-07', 'Male'),
    ('Maria Rodriguez', 'mariar@hotmail.com', '9012 2nd St, Montreal, QC H3A 1K2, Canada', '5145553456', 'UnitedHealthcare', 'Davis Vision', 'Guardian', '1978-09-03', 'Female'),
    ('Javier Gomez', 'javierg@gmail.com', '3456 3rd Ave, Ottawa, ON K1S 5B3, Canada', '6135554567', 'Humana', 'EyeMed', 'Ameritas', '1984-02-14', 'Male'),
    ('Leila Kim', 'leilak@yahoo.com', '7890 4th St, Calgary, AB T2N 1N4, Canada', '4035555678', 'Blue Cross Blue Shield', 'VSP', 'Aetna', '1999-11-29', 'Female'),
    ('David Singh', 'dsingh@hotmail.com', '4321 5th Ave, Edmonton, AB T6E 5S7, Canada', '7805556789', 'Aetna', 'Davis Vision', 'Delta', '1993-07-06', 'Male'),
    ('Amelia Nguyen', 'amelian@gmail.com', '5678 6th St, Vancouver, BC V5Y 1G7, Canada', '6045557890', 'Cigna', 'VSP', 'MetLife', '1987-04-10', 'Female'),
    ('Adam Ali', 'adama@yahoo.com', '9012 7th Ave, Montreal, QC H3B 1T3, Canada', '5145558901', 'Humana', 'Aetna', 'Guardian', '1992-09-17', 'Male'),
    ('Kaitlyn Patel', 'kaitlynp@hotmail.com', '3456 8th St, Toronto, ON M4S 1Z7, Canada', '4165559012', 'UnitedHealthcare', 'EyeMed', 'Ameritas', '1981-06-19', 'Female'),
    ('Omar Khan', 'omark@gmail.com', '7890 9th Ave, Calgary, AB T2G 0S3, Canada', '4035550123', 'Blue Cross Blue Shield', 'VSP', 'Delta', '1998-01-25', 'Male'),
    ('Natasha Chen', 'natashac@yahoo.com', '1234 10th St, Vancouver, BC V6H 1J3, Canada', '6045553456', 'Aetna', 'VSP', 'Delta', '1991-08-05', 'Female'),
    ('Malik Ahmed', 'malika@gmail.com', '5678 11th St, Montreal, QC H2Y 3B6, Canada', '5145554567', 'Cigna', 'Davis Vision', 'MetLife', '1983-03-15', 'Male'),
    ('Sofia Gonzalez', 'sofiag@hotmail.com', '9012 12th St, Toronto, ON M5T 1N8, Canada', '4165555678', 'Humana', 'EyeMed', 'Aetna', '1976-12-28', 'Female'),
    ('Tariq Khan', 'tariqk@yahoo.com', '3456 13th St, Calgary, AB T2T 3R5, Canada', '4035556789', 'Blue Cross Blue Shield', 'VSP', 'Guardian', '1982-07-31', 'Male'),
    ('Mia Kim', 'miak@gmail.com', '7890 14th St, Vancouver, BC V5Z 1M2, Canada', '6045557890', 'UnitedHealthcare', 'Aetna', 'Delta', '2002-02-14', 'Female'),
    ('Jasmine Patel', 'jasminep@yahoo.com', '4321 15th St, Montreal, QC H3G 1M8, Canada', '5145558901', 'Cigna', 'EyeMed', 'MetLife', '1986-09-22', 'Female'),
    ('Carlos Rodriguez', 'carlosr@hotmail.com', '5678 16th St, Ottawa, ON K2P 0Y6, Canada', '6135550123', 'Humana', 'VSP', 'Ameritas', '1979-04-27', 'Male'),
    ('Nina Singh', 'ninasi@hotmail.com', '9012 17th St, Calgary, AB T2G 1J1, Canada', '4035551234', 'Aetna', 'Davis Vision', 'Guardian', '1995-11-08', 'Female'),
    ('Ethan Wong', 'ethanw@gmail.com', '3456 18th St, Toronto, ON M4W 2N4, Canada', '4165552345', 'Blue Cross Blue Shield', 'VSP', 'Delta', '1988-06-12', 'Male'),
    ('Isabella Nguyen', 'isabellan@hotmail.com', '7890 19th St, Edmonton, AB T5J 2E7, Canada', '7805553456', 'UnitedHealthcare', 'EyeMed', 'Aetna', '1997-01-01', 'Female'),
    ('Avery Williams', 'averyw@gmail.com', '1234 20th St, Vancouver, BC V6K 1B2, Canada', '6045554567', 'Cigna', 'EyeMed', 'Delta', '1989-02-17', 'Female'),
    ('Miguel Hernandez', 'miguelh@hotmail.com', '5678 21st St, Montreal, QC H4C 1L3, Canada', '5145555678', 'Humana', 'Davis Vision', 'Guardian', '1980-05-24', 'Male'),
    ('Aria Gupta', 'ariag@yahoo.com', '9012 22nd St, Toronto, ON M4S 2L3, Canada', '4165556789', 'Blue Cross Blue Shield', 'VSP', 'Aetna', '1993-12-02', 'Female'),
    ('Dante Lee', 'dantel@hotmail.com', '3456 23rd St, Calgary, AB T2J 0T1, Canada', '4035557890', 'Aetna', 'EyeMed', 'MetLife', '1985-11-14', 'Male'),
    ('Nadia Ali', 'nadiaa@gmail.com', '7890 24th St, Vancouver, BC V6R 1N3, Canada', '6045558901', 'Cigna', 'VSP', 'Delta', '2001-06-30', 'Female'),
    ('William Chen', 'williamc@yahoo.com', '4321 25th St, Montreal, QC H2Y 1K5, Canada', '5145550123', 'Humana', 'Davis Vision', 'Guardian', '1978-09-09', 'Male'),
    ('Samantha Patel', 'samanthap@hotmail.com', '5678 26th St, Ottawa, ON K1S 1N4, Canada', '6135551234', 'Blue Cross Blue Shield', 'EyeMed', 'Aetna', '1990-04-03', 'Female'),
    ('Khalid Rahman', 'khalidr@gmail.com', '9012 27th St, Calgary, AB T2P 2H5, Canada', '4035552345', 'Aetna', 'VSP', 'MetLife', '1987-11-19', 'Male'),
    ('Lila Nguyen', 'lilan@hotmail.com', '3456 28th St, Toronto, ON M5R 2M5, Canada', '4165553456', 'Cigna', 'Davis Vision', 'Delta', '1998-02-28', 'Female'),
    ('Oscar Rodriguez', 'oscarrodriguez@hotmail.com', '7890 29th St, Edmonton, AB T5J 1R7, Canada', '7805554567', 'Blue Cross Blue Shield', 'VSP', 'Guardian', '1984-07-07', 'Male'),
    ('Hannah Kim', 'hannahk@gmail.com', '1234 30th St, Vancouver, BC V6K 1B2, Canada', '6045552345', 'Cigna', 'VSP', 'Delta', '1995-08-12', 'Female'),
    ('Aidan Wong', 'aidanw@hotmail.com', '5678 31st St, Montreal, QC H4C 1L3, Canada', '5145553456', 'Humana', 'Davis Vision', 'Guardian', '1982-03-27', 'Male'),
    ('Lila Patel', 'lilap@yahoo.com', '9012 32nd St, Toronto, ON M4S 2L3, Canada', '4165554567', 'Blue Cross Blue Shield', 'EyeMed', 'Aetna', '1996-11-15', 'Female'),
    ('Isaac Lee', 'isaaclee@hotmail.com', '3456 33rd St, Calgary, AB T2J 0T1, Canada', '4035555678', 'Aetna', 'VSP', 'MetLife', '1984-12-09', 'Male'),
    ('Aisha Khan', 'aishak@gmail.com', '7890 34th St, Vancouver, BC V6R 1N3, Canada', '6045556789', 'Cigna', 'Davis Vision', 'Delta', '1999-07-24', 'Female'),
    ('Ethan Chen', 'ethanc@yahoo.com', '4321 35th St, Montreal, QC H2Y 1K5, Canada', '5145557890', 'Humana', 'VSP', 'Guardian', '1975-09-02', 'Male'),
    ('Chloe Rodriguez', 'chloer@hotmail.com', '5678 36th St, Ottawa, ON K1S 1N4, Canada', '6135558901', 'Blue Cross Blue Shield', 'EyeMed', 'Aetna', '1992-05-18', 'Female'),
    ('Sandeep Singh', 'sandeeps@gmail.com', '9012 37th St, Calgary, AB T2P 2H5, Canada', '4035559012', 'Aetna', 'VSP', 'MetLife', '1997-10-31', 'Male'),
    ('Samantha Wong', 'samanthaw@hotmail.com', '3456 38th St, Toronto, ON M5R 2M5, Canada', '4165550123', 'Cigna', 'Davis Vision', 'Delta', '2000-03-14', 'Female'),
    ('Maxime Tremblay', 'maximet@hotmail.com', '7890 39th St, Edmonton, AB T5J 1R7, Canada', '7805551234', 'Blue Cross Blue Shield', 'VSP', 'Guardian', '1991-08-07', 'Male');

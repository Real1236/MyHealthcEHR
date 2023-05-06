USE clinical_reports;

DROP TABLE IF EXISTS patient;

CREATE TABLE patient (
    id INT(11) NOT NULL PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    dob DATE NOT NULL,
    sex VARCHAR(10) NOT NULL
);

INSERT INTO patient (id, name, dob, sex)
VALUES
    (1, 'John Doe', '1999-01-01', 'M'),
    (2, 'Jane Doe', '2000-03-12', 'F'),
    (3, 'Arthur Chan', '2001-02-04', 'M'),
    (4, 'Wisenavi Jeyacumar', '2001-08-17', 'F'),
    (5, 'Joellyne Evaristo', '2001-06-09', 'F'),
    (6, 'Sophie Yang', '2006-07-16', 'F'),
    (7, 'Ethan Evaristo', '2002-09-24', 'M'),
    (8, 'Jacob Evaristo', '2008-11-19', 'M'),
    (9, 'Howard Yu', '2000-12-02', 'M'),
    (10, 'John Smith', '1985-07-12', 'M'),
    (11, 'Jane Doe', '1990-02-22', 'F'),
    (12, 'Michael Johnson', '1978-11-01', 'M'),
    (13, 'Emily Rodriguez', '1989-06-05', 'F'),
    (14, 'William Lee', '2001-03-16', 'M'),
    (15, 'Samantha Smith', '1974-09-23', 'F'),
    (16, 'Andrew Davis', '1995-12-30', 'M'),
    (17, 'Natalie Kim', '1986-08-08', 'F'),
    (18, 'Kevin Chen', '2002-01-10', 'M'),
    (19, 'Amanda White', '1993-04-19', 'F'),
    (20, 'David Brown', '1972-02-03', 'M'),
    (21, 'Stephanie Garcia', '1988-10-28', 'F'),
    (22, 'Erica Hernandez', '1999-07-07', 'F'),
    (23, 'Daniel Martinez', '1983-05-21', 'M'),
    (24, 'Megan Davis', '1991-11-12', 'F'),
    (25, 'Benjamin Jones', '1977-01-31', 'M'),
    (26, 'Elizabeth Taylor', '1987-09-17', 'F'),
    (27, 'Jacob Nguyen', '1996-06-14', 'M'),
    (28, 'Olivia Martin', '2000-12-25', 'F'),
    (29, 'Ryan Wilson', '1982-08-04', 'M'),
    (30, 'Victoria Anderson', '1994-03-27', 'F'),
    (31, 'Matthew Perez', '1984-05-18', 'M'),
    (32, 'Gabriela Flores', '1998-09-11', 'F'),
    (33, 'Christopher Lee', '1979-07-08',
    (34, 'Lila Hernandez', '1998-09-14', 'F'),
    (35, 'Miles Kim', '1985-05-21', 'M'),
    (36, 'Haley Watson', '1973-12-02', 'F'),
    (37, 'Riley Patel', '1996-07-18', 'M');

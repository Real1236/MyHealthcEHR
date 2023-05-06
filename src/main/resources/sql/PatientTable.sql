USE clinical_reports;

DROP TABLE IF EXISTS patient;

CREATE TABLE patient (
    id INT(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `name` VARCHAR(50) NOT NULL,
    dob DATE NOT NULL,
    sex VARCHAR(10) NOT NULL
);

INSERT INTO patient (`name`, dob, sex)
VALUES
    ('John Doe', '1999-01-01', 'M'),
    ('Jane Doe', '2000-03-12', 'F'),
    ('Arthur Chan', '2001-02-04', 'M'),
    ('Wisenavi Jeyacumar', '2001-08-17', 'F'),
    ('Joellyne Evaristo', '2001-06-09', 'F'),
    ('Sophie Yang', '2006-07-16', 'F'),
    ('Ethan Evaristo', '2002-09-24', 'M'),
    ('Jacob Evaristo', '2008-11-19', 'M'),
    ('Howard Yu', '2000-12-02', 'M'),
    ('John Smith', '1985-07-12', 'M'),
    ('Jane Doe', '1990-02-22', 'F'),
    ('Michael Johnson', '1978-11-01', 'M'),
    ('Emily Rodriguez', '1989-06-05', 'F'),
    ('William Lee', '2001-03-16', 'M'),
    ('Samantha Smith', '1974-09-23', 'F'),
    ('Andrew Davis', '1995-12-30', 'M'),
    ('Natalie Kim', '1986-08-08', 'F'),
    ('Kevin Chen', '2002-01-10', 'M'),
    ('Amanda White', '1993-04-19', 'F'),
    ('David Brown', '1972-02-03', 'M'),
    ('Stephanie Garcia', '1988-10-28', 'F'),
    ('Erica Hernandez', '1999-07-07', 'F'),
    ('Daniel Martinez', '1983-05-21', 'M'),
    ('Megan Davis', '1991-11-12', 'F'),
    ('Benjamin Jones', '1977-01-31', 'M'),
    ('Elizabeth Taylor', '1987-09-17', 'F'),
    ('Jacob Nguyen', '1996-06-14', 'M'),
    ('Olivia Martin', '2000-12-25', 'F'),
    ('Ryan Wilson', '1982-08-04', 'M'),
    ('Victoria Anderson', '1994-03-27', 'F'),
    ('Matthew Perez', '1984-05-18', 'M'),
    ('Gabriela Flores', '1998-09-11', 'F'),
    ('Christopher Lee', '1979-07-08','M'),
    ('Lila Hernandez', '1998-09-14', 'F'),
    ('Miles Kim', '1985-05-21', 'M'),
    ('Haley Watson', '1973-12-02', 'F'),
    ('Riley Patel', '1996-07-18', 'M');

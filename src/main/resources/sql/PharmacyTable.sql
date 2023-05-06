USE clinical_reports;

DROP TABLE IF EXISTS pharmacies;

CREATE TABLE pharmacies (
    id INT(11) NOT NULL AUTO_INCREMENT,
    pharmacy_name VARCHAR(50) NOT NULL,
    address VARCHAR(255) NOT NULL,
    phone_number VARCHAR(20) NOT NULL,
    pharmacist_name VARCHAR(50) NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO pharmacies (pharmacy_name, address, phone_number, pharmacist_name)
VALUES
    ('CVS Pharmacy', '123 Main St., Anytown, USA', '(555) 123-4567', 'John Smith'),
    ('Walgreens', '456 Broadway, Anytown, USA', '(555) 234-5678', 'Jane Doe'),
    ('Rite Aid Pharmacy', '789 Elm St., Anytown, USA', '(555) 345-6789', 'Mike Johnson'),
    ('Walmart Pharmacy', '987 Pine St., Anytown, USA', '(555) 456-7890', 'Sara Lee'),
    ('Target Pharmacy', '246 Oak St., Anytown, USA', '(555) 567-8901', 'David Brown');

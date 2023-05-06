USE clinical_reports;

DROP TABLE IF EXISTS drugs;

CREATE TABLE drugs (
   id INT(11) NOT NULL AUTO_INCREMENT,
   drug_name VARCHAR(50) NOT NULL,
   brand_name VARCHAR(50),
   drug_class VARCHAR(50),
   indications VARCHAR(255),
   dosage_form VARCHAR(50),
   dosage_strengths VARCHAR(255),
   route_of_administration VARCHAR(50),
   mechanism_of_action VARCHAR(255),
   PRIMARY KEY (id)
);

INSERT INTO drugs (drug_name, brand_name, drug_class, indications, dosage_form, dosage_strengths, route_of_administration, mechanism_of_action)
VALUES
    ('Ibuprofen', 'Advil', 'NSAID', 'Pain, inflammation', 'Tablet', '200 mg, 400 mg, 600 mg', 'Oral', 'Inhibits cyclooxygenase'),
    ('Lisinopril', 'Zestril', 'ACE inhibitor', 'Hypertension, heart failure', 'Tablet', '2.5 mg, 5 mg, 10 mg, 20 mg, 40 mg', 'Oral', 'Inhibits angiotensin-converting enzyme'),
    ('Metformin', 'Glucophage', 'Biguanide', 'Type 2 diabetes mellitus', 'Tablet', '500 mg, 850 mg, 1000 mg', 'Oral', 'Decreases hepatic glucose production'),
    ('Amoxicillin', 'Amoxil', 'Penicillin antibiotic', 'Bacterial infections', 'Capsule', '250 mg, 500 mg', 'Oral', 'Inhibits bacterial cell wall synthesis'),
    ('Atorvastatin', 'Lipitor', 'HMG-CoA reductase inhibitor', 'Hypercholesterolemia', 'Tablet', '10 mg, 20 mg, 40 mg, 80 mg', 'Oral', 'Inhibits HMG-CoA reductase');

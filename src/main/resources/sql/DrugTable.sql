USE clinical_reports;

DROP TABLE IF EXISTS drugs;

CREATE TABLE drugs (
   id INT(11) NOT NULL AUTO_INCREMENT,
   patient_id INT(11) NOT NULL,
   pharm_name VARCHAR(50) NOT NULL,
   drug_name VARCHAR(50) NOT NULL,
   brand_name VARCHAR(50),
   drug_class VARCHAR(50),
   indications VARCHAR(255),
   dosage_form VARCHAR(50),
   dosage_strength VARCHAR(255),
   route_of_administration VARCHAR(50),
   mechanism_of_action VARCHAR(255),
   PRIMARY KEY (id)
);

INSERT INTO drugs (patient_id, pharm_name, drug_name, brand_name, drug_class, indications, dosage_form, dosage_strength, route_of_administration, mechanism_of_action)
VALUES
    (1, 'HealthMasters Pharmacy' 'Ibuprofen', 'Advil', 'NSAID', 'Pain', 'Inflammation', 'Tablet', '200 mg', 'Oral', 'Inhibits cyclooxygenase'),
    (2, 'CarePro Pharmacy' 'Lisinopril', 'Zestril', 'ACE inhibitor', 'Hypertension', 'Heart failure', 'Tablet', '5 mg', 'Oral', 'Inhibits angiotensin-converting enzyme'),
    (3, 'Friendly Pharmacy' 'Metformin', 'Glucophage', 'Biguanide', 'Type 2 diabetes mellitus', NULL, 'Tablet', '1000 mg', 'Oral', 'Decreases hepatic glucose production'),
    (4, 'Vitality Pharmacy' 'Amoxicillin', 'Amoxil', 'Penicillin antibiotic', 'Bacterial infections', NULL, 'Capsule', '250 mg', 'Oral', 'Inhibits bacterial cell wall synthesis'),
    (5, 'QuickRX Pharmacy' 'Atorvastatin', 'Lipitor', 'HMG-CoA reductase inhibitor', 'Hypercholesterolemia', NULL, 'Tablet', '20 mg', 'Oral', 'Inhibits HMG-CoA reductase');

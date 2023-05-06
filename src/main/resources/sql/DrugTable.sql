USE clinical_reports;

DROP TABLE IF EXISTS drugs;

CREATE TABLE drugs (
   drug_id INT(11) NOT NULL AUTO_INCREMENT,
   drug_name VARCHAR(50) NOT NULL,
   brand_name VARCHAR(50),
   drug_class VARCHAR(50),
   indications VARCHAR(255),
   dosage_form VARCHAR(50),
   dosage_strengths VARCHAR(255),
   route_of_administration VARCHAR(50),
   mechanism_of_action VARCHAR(255),
   PRIMARY KEY (drug_id)
);
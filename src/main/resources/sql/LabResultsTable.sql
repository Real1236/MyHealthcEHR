USE clinical_reports;

DROP TABLE IF EXISTS lab_results;

CREATE TABLE lab_results (
     id INT PRIMARY KEY AUTO_INCREMENT,
     testType VARCHAR(50) NOT NULL,
     `date` DATE NOT NULL,
     patient_id INT(11) NOT NULL,
     wbc FLOAT NOT NULL,
     rbc FLOAT NOT NULL,
     hgb FLOAT NOT NULL,
     hct FLOAT NOT NULL,
     platelet_count FLOAT NOT NULL,
     glucose FLOAT NOT NULL,
     sodium FLOAT NOT NULL,
     potassium FLOAT NOT NULL,
     chloride FLOAT NOT NULL,
     co2 FLOAT NOT NULL,
     calcium FLOAT NOT NULL,
     total_protein FLOAT NOT NULL,
     albumin FLOAT NOT NULL,
     total_bilirubin FLOAT NOT NULL,
     alp FLOAT NOT NULL,
     alt FLOAT NOT NULL,
     ast FLOAT NOT NULL,
     tsh FLOAT NOT NULL,
     total_cholesterol FLOAT NOT NULL,
     triglycerides FLOAT NOT NULL,
     hdl FLOAT NOT NULL,
     ldl FLOAT NOT NULL,
     FOREIGN KEY (patient_id) REFERENCES patient(id)
);

INSERT INTO lab_results (patient_id, testType, `date`, wbc, rbc, hgb, hct, platelet_count, glucose, sodium, potassium, chloride, co2, calcium, total_protein, albumin, total_bilirubin, alp, alt, ast, tsh, total_cholesterol, triglycerides, hdl, ldl)
VALUES
    (1, 'White Blood', '2022-01-01', 5.0, 4.5, 14.0, 42.0, 200.0, 110.0, 140.0, 4.0, 100.0, 28.0, 9.0, 7.0, 4.0, 1.2, 100.0, 30.0, 40.0, 1.5, 200.0, 150.0, 50.0, 100.0),
    (1, 'Thyroid', '2022-02-15', 4.8, 4.0, 12.0, 36.0, 180.0, 90.0, 135.0, 3.5, 95.0, 26.0, 8.5, 6.5, 3.5, 1.0, 80.0, 25.0, 35.0, 1.0, 180.0, 130.0, 45.0, 110.0),
    (1, 'Hematology', '2022-03-28', 6.0, 5.0, 15.0, 45.0, 250.0, 120.0, 142.0, 4.5, 102.0, 30.0, 10.0, 8.0, 4.5, 1.5, 120.0, 35.0, 50.0, 2.0, 220.0, 160.0, 60.0, 130.0),
    (1, 'Urinalysis', '2022-04-12', 7.2, 4.5, 12.1, 36.5, 200.0, 110.0, 140.0, 3.5, 105.0, 28.0, 9.2, 7.5, 4.0, 0.8, 90.0, 45.0, 35.0, 3.8, 180.0, 90.0, 55.0, 100.0),
    (1, 'Genetic', '2022-05-05', 8.2, 5.0, 13.5, 40.5, 220.0, 90.0, 138.0, 3.8, 108.0, 29.0, 9.8, 8.2, 4.2, 0.9, 95.0, 55.0, 40.0, 3.2, 200.0, 100.0, 60.0, 110.0),
    (6, 'Blood Glucose', '2022-06-20', 9.1, 4.8, 14.0, 42.0, 230.0, 100.0, 142.0, 4.2, 107.0, 27.0, 9.5, 8.5, 4.5, 1.0, 100.0, 60.0, 30.0, 4.0, 190.0, 85.0, 50.0, 120.0),
    (7, 'Creatinine', '2022-07-07', 6.8, 4.5, 12.0, 37.5, 200.0, 120.0, 142.0, 4.5, 102.0, 28.0, 8.8, 6.5, 3.5, 0.8, 125.0, 32.0, 35.0, 2.5, 185.0, 90.0, 45.0, 120.0),
    (8, 'Metabolic', '2022-08-18', 5.0, 4.2, 11.5, 35.0, 150.0, 100.0, 135.0, 4.0, 100.0, 25.0, 8.5, 6.0, 3.0, 0.7, 110.0, 30.0, 30.0, 2.0, 170.0, 80.0, 40.0, 115.0),
    (9, 'Thyroid', '2022-09-30', 7.2, 5.0, 14.0, 42.0, 250.0, 130.0, 140.0, 5.0, 105.0, 30.0, 9.0, 7.0, 4.0, 1.0, 140.0, 35.0, 40.0, 2.8, 200.0, 100.0, 50.0, 130.0);

USE clinical_reports;

DROP TABLE IF EXISTS immunization_records;

CREATE TABLE immunization_records (
  immunization_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  patient_id INT NOT NULL,
  immunization_name VARCHAR(50) NOT NULL,
  immunization_date DATE NOT NULL,
  immunization_site VARCHAR(50) NOT NULL,
  immunization_dose VARCHAR(50) NOT NULL,
  immunization_provider VARCHAR(50) NOT NULL,
  next_due_date DATE,
  FOREIGN KEY (patient_id) REFERENCES patient(id)
);

INSERT INTO immunization_records (patient_id, immunization_name, immunization_date, immunization_site, immunization_dose, immunization_provider, next_due_date)
VALUES
  (1, 'DTap', '2022-01-01', 'Left arm', '0.5 mL', 'Dr. Smith', '2022-09-01'),
  (1, 'Hepatitis B', '2022-01-15', 'Right arm', '0.5 mL', 'Dr. Smith', '2022-02-15'),
  (2, 'Hib', '2022-02-01', 'Left arm', '0.5 mL', 'Dr. Johnson', '2023-02-01'),
  (2, 'PCV13', '2022-02-15', 'Right arm', '0.5 mL', 'Dr. Johnson', '2023-02-15'),
  (3, 'Influenza', '2022-03-01', 'Left arm', '0.5 mL', 'Dr. Brown', NULL),
  (4, 'MMR', '2022-04-01', 'Left arm', '0.5 mL', 'Dr. Lee', '2023-04-01'),
  (5, 'Varicella', '2022-05-01', 'Right arm', '0.5 mL', 'Dr. Patel', '2023-05-01'),
  (6, 'HPV', '2022-06-01', 'Left arm', '0.5 mL', 'Dr. Nguyen', '2023-06-01'),
  (7, 'Tdap', '2022-07-01', 'Right arm', '0.5 mL', 'Dr. Wilson', NULL),
  (8, 'Meningococcal', '2022-08-01', 'Left arm', '0.5 mL', 'Dr. Garcia', '2023-08-01'),
  (9, 'DTap', '2022-09-15', 'Right arm', '0.5 mL', 'Dr. Smith', '2023-03-15'),
  (10, 'Hepatitis A', '2022-10-01', 'Left arm', '1.0 mL', 'Dr. Johnson', '2023-04-01'),
  (10, 'Influenza', '2022-10-15', 'Right arm', '0.5 mL', 'Dr. Johnson', NULL),
  (11, 'PCV13', '2022-11-01', 'Left arm', '0.5 mL', 'Dr. Brown', '2023-11-01'),
  (12, 'Rotavirus', '2022-12-01', 'Right leg', '2.0 mL', 'Dr. Lee', '2023-02-01'),
  (13, 'MMR', '2023-01-01', 'Left arm', '0.5 mL', 'Dr. Patel', '2024-01-01'),
  (14, 'Varicella', '2023-02-01', 'Right arm', '0.5 mL', 'Dr. Nguyen', NULL),
  (15, 'HPV', '2023-03-01', 'Left arm', '0.5 mL', 'Dr. Wilson', '2024-03-01'),
  (16, 'Tdap', '2023-04-01', 'Right arm', '0.5 mL', 'Dr. Garcia', NULL),
  (17, 'Meningococcal', '2023-05-01', 'Left arm', '0.5 mL', 'Dr. Smith', '2024-05-01'),
  (18, 'Hib', '2023-06-01', 'Right thigh', '0.5 mL', 'Dr. Lee', '2024-06-01'),
  (19, 'DTap', '2023-06-15', 'Left arm', '0.5 mL', 'Dr. Patel', NULL),
  (20, 'Influenza', '2023-07-01', 'Right arm', '0.5 mL', 'Dr. Nguyen', NULL),
  (21, 'PCV13', '2023-07-15', 'Left thigh', '0.5 mL', 'Dr. Wilson', '2024-07-15'),
  (22, 'Hepatitis B', '2023-08-01', 'Right arm', '1.0 mL', 'Dr. Garcia', '2024-08-01'),
  (23, 'Rotavirus', '2023-09-01', 'Left leg', '2.0 mL', 'Dr. Smith', NULL),
  (24, 'MMR', '2023-10-01', 'Right arm', '0.5 mL', 'Dr. Johnson', '2024-10-01'),
  (25, 'Varicella', '2023-11-01', 'Left arm', '0.5 mL', 'Dr. Brown', '2024-11-01'),
  (26, 'HPV', '2023-12-01', 'Right arm', '0.5 mL', 'Dr. Lee', NULL),
  (27, 'Tdap', '2024-01-01', 'Left arm', '0.5 mL', 'Dr. Patel', '2025-01-01'),
  (28, 'Hib', '2024-02-01', 'Right thigh', '0.5 mL', 'Dr. Nguyen', '2025-02-01'),
  (29, 'DTap', '2024-02-15', 'Left arm', '0.5 mL', 'Dr. Wilson', NULL),
  (30, 'Influenza', '2024-03-01', 'Right arm', '0.5 mL', 'Dr. Garcia', NULL),
  (31, 'PCV13', '2024-03-15', 'Left thigh', '0.5 mL', 'Dr. Smith', '2025-03-15'),
  (32, 'Hepatitis B', '2024-04-01', 'Right arm', '1.0 mL', 'Dr. Johnson', '2025-04-01'),
  (33, 'Rotavirus', '2024-05-01', 'Left leg', '2.0 mL', 'Dr. Brown', NULL),
  (34, 'MMR', '2024-06-01', 'Right arm', '0.5 mL', 'Dr. Lee', '2025-06-01'),
  (35, 'Varicella', '2024-07-01', 'Left arm', '0.5 mL', 'Dr. Patel', '2025-07-01'),
  (36, 'HPV', '2024-08-01', 'Right arm', '0.5 mL', 'Dr. Nguyen', NULL),
  (37, 'Tdap', '2024-09-01', 'Left arm', '0.5 mL', 'Dr. Wilson', '2025-09-01');


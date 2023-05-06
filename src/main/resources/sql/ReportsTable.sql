DROP SCHEMA IF EXISTS clinical_reports;

CREATE SCHEMA IF NOT EXISTS clinical_reports;

USE clinical_reports;

DROP TABLE IF EXISTS reports;

CREATE TABLE reports (
  patient_id INT NOT NULL AUTO_INCREMENT,
  report_date DATE NOT NULL,
  report_type VARCHAR(50) NOT NULL,
  report_text TEXT NOT NULL,
  physician_id INT NOT NULL,
  diagnosis VARCHAR(255),
  medications TEXT,
  procedures TEXT,
  test_results TEXT,
  allergies TEXT,
  vital_signs TEXT,
  referral_info TEXT,
  PRIMARY KEY (patient_id)
);

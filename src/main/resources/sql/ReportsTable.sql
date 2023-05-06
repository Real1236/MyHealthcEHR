DROP SCHEMA IF EXISTS clinical_reports;

CREATE SCHEMA IF NOT EXISTS clinical_reports;

USE clinical_reports;

DROP TABLE IF EXISTS reports;

CREATE TABLE reports (
  patient_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
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
  referral_info TEXT
);

INSERT INTO reports (report_date, report_type, report_text, physician_id, diagnosis, medications, procedures, test_results, allergies, vital_signs, referral_info)
VALUES (
  "2023-05-05",
  "Consultation Note",
  "Patient presented with complaints of chest pain and shortness of breath. On examination, patient had elevated heart rate and blood pressure. EKG revealed ST-segment elevation, and the patient was diagnosed with acute myocardial infarction. Patient was admitted to the hospital and started on aspirin and heparin. Cardiac catheterization was performed, and the patient underwent successful percutaneous coronary intervention with stent placement. Patient's symptoms improved, and the patient was discharged with instructions for follow-up care with their primary care physician.",
  123,
  "Acute myocardial infarction",
  "Aspirin, Heparin",
  "Percutaneous coronary intervention with stent placement",
  "Elevated cardiac enzymes and ST-segment elevation on EKG consistent with acute myocardial infarction",
  "No known allergies",
  "Vital signs: BP 150/90; HR 110; Temp 98.6",
  "Refer to Cardiology for further evaluation and treatment."
), (
  "2023-05-05",
  "Progress Note",
  "Patient reported feeling better today. Vital signs stable. No acute concerns.",
  456,
  "",
  "",
  "",
  "",
  "",
  "Vital signs: BP 120/80; HR 70; Temp 98.5",
  ""
), (
  "2023-05-04",
  "Surgical Note",
  "Patient underwent laparoscopic cholecystectomy for symptomatic gallstones. Surgery was uncomplicated. Patient was discharged home the same day with instructions for postoperative care.",
  789,
  "Cholelithiasis",
  "Acetaminophen, Ibuprofen",
  "Laparoscopic cholecystectomy",
  "",
  "No known allergies",
  "Vital signs: BP 130/80; HR 80; Temp 98.2",
  "Follow up with Surgeon in 2 weeks."
), (
  "2023-05-03",
  "Radiology Report",
  "CT scan of the abdomen and pelvis showed no evidence of malignancy or significant abnormalities.",
  123,
  "",
  "",
  "",
  "Negative for malignancy or significant abnormalities",
  "",
  "",
  "Follow up with referring physician."
), (
  "2023-05-02",
  "Consultation Note",
  "Patient presented with complaints of headache and dizziness. CT scan of the head was negative for acute intracranial pathology. No further workup is necessary at this time.",
  456,
  "",
  "",
  "",
  "Negative CT scan of the head",
  "",
  "Vital signs: BP 120/80; HR 70; Temp 98.5",
  "No further referral needed."
), (
  "2023-05-01",
  "Discharge Summary",
  "Patient was admitted for community-acquired pneumonia and treated with intravenous antibiotics. Patient responded well to treatment and was discharged home with instructions for completing a course of oral antibiotics. Patient was instructed to follow up with their primary care physician in 1 week.",
  123,
  "Community-acquired pneumonia",
  "Ceftriaxone, Azithromycin",
  "",
  "",
  "",
  "Vital signs: BP 130/80; HR 80; Temp 98.2",
  "Follow up with Primary Care Physician in 1 week."
), (
  "2023-05-10",
  "Progress Note",
  "Patient reported persistent cough and shortness of breath. Chest X-ray showed infiltrates suggestive of pneumonia. Started on antibiotics and re-evaluation in 48 hours.",
  789,
  "Pneumonia",
  "Amoxicillin",
  "",
  "Chest X-ray showed infiltrates",
  "No known allergies",
  "Vital signs: BP 120/80; HR 70; Temp 98.5",
  "Re-evaluation in 48 hours."
), (
  "2023-05-09",
  "Surgical Note",
  "Patient underwent appendectomy for acute appendicitis. Surgery was uneventful. Patient was discharged home on postoperative day 1 with instructions for postoperative care.",
  456,
  "Acute appendicitis",
  "Acetaminophen, Oxycodone",
  "Appendectomy",
  "",
  "No known allergies",
  "Vital signs: BP 130/80; HR 80; Temp 98.2",
  "Follow up with Surgeon in 2 weeks."
), (
  "2023-05-08",
  "Radiology Report",
  "MRI of the brain showed no acute intracranial pathology.",
  123,
  "",
  "",
  "",
  "Negative for acute intracranial pathology",
  "",
  "",
  "Follow up with referring physician."
), (
  "2023-05-07",
  "Consultation Note",
  "Patient presented with complaints of abdominal pain and diarrhea. Stool cultures were negative for infectious etiologies. Presumed viral gastroenteritis. Rehydration and symptomatic treatment advised.",
  789,
  "Viral gastroenteritis",
  "",
  "",
  "",
  "Stool cultures negative for infectious etiologies",
  "",
  "No further referral needed."
), (
  "2023-05-06",
  "Discharge Summary",
  "Patient was admitted with acute exacerbation of chronic obstructive pulmonary disease (COPD) and treated with bronchodilators and steroids. Patient responded well to treatment and was discharged home with instructions for continuing inhalers and follow up with their primary care physician.",
  123,
  "Acute exacerbation of COPD",
  "Albuterol, Budesonide",
  "",
  "",
  "",
  "Vital signs: BP 130/80; HR 80; Temp 98.2",
  "Follow up with Primary Care Physician in 1 week."
), (
  "2023-05-15",
  "Radiology Report",
  "CT scan of the abdomen and pelvis showed a 5cm right ovarian cyst. Follow up imaging in 6 months recommended.",
  123,
  "Right ovarian cyst",
  "",
  "",
  "CT scan of the abdomen and pelvis showed a 5cm right ovarian cyst",
  "",
  "",
  "Follow up imaging in 6 months."
), (
  "2023-05-14",
  "Progress Note",
  "Patient reported persistent headache and visual changes. MRI of the brain showed a pituitary adenoma. Referral to Endocrinology for further management.",
  789,
  "Pituitary adenoma",
  "",
  "",
  "MRI of the brain showed a pituitary adenoma",
  "No known allergies",
  "Vital signs: BP 120/80; HR 70; Temp 98.5",
  "Referral to Endocrinology for further management."
), (
  "2023-05-13",
  "Surgical Note",
  "Patient underwent laparoscopic cholecystectomy for symptomatic cholelithiasis. Surgery was uneventful. Patient was discharged home on postoperative day 1 with instructions for postoperative care.",
  456,
  "Symptomatic cholelithiasis",
  "Acetaminophen, Oxycodone",
  "Laparoscopic cholecystectomy",
  "",
  "No known allergies",
  "Vital signs: BP 130/80; HR 80; Temp 98.2",
  "Follow up with Surgeon in 2 weeks."
), (
  "2023-05-12",
  "Radiology Report",
  "X-ray of the right wrist showed a distal radius fracture. Placed in a cast for immobilization.",
  123,
  "Distal radius fracture",
  "",
  "",
  "X-ray of the right wrist showed a distal radius fracture",
  "",
  "",
  "Follow up with Orthopedics in 4 weeks."
), (
  "2023-05-11",
  "Consultation Note",
  "Patient presented with complaints of fatigue and dizziness. Laboratory tests showed iron deficiency anemia. Prescribed iron supplements and dietary modification advised.",
  789,
  "Iron deficiency anemia",
  "Iron supplements",
  "",
  "Laboratory tests showed iron deficiency anemia",
  "",
  "",
  "Follow up with Primary Care Physician in 4 weeks."
), (
  "2023-05-20",
  "Radiology Report",
  "CT scan of the chest showed a 2cm pulmonary nodule. Further imaging recommended to evaluate for malignancy.",
  123,
  "Pulmonary nodule",
  "",
  "",
  "CT scan of the chest showed a 2cm pulmonary nodule",
  "",
  "",
  "Further imaging recommended to evaluate for malignancy."
), (
  "2023-05-19",
  "Progress Note",
  "Patient reported worsening shortness of breath and chest pain. EKG showed ST segment elevation in leads V1-V6. Emergent cardiac catheterization performed with placement of stent in left anterior descending artery. Stable overnight and will continue monitoring.",
  789,
  "Acute myocardial infarction",
  "Aspirin, Clopidogrel, Heparin",
  "Cardiac catheterization with stent placement in LAD artery",
  "EKG showed ST segment elevation in leads V1-V6",
  "No known allergies",
  "Vital signs: BP 130/80; HR 90; Temp 98.9",
  "Continue monitoring and titrate medications."
), (
  "2023-05-18",
  "Surgical Note",
  "Patient underwent total knee replacement for severe osteoarthritis. Surgery was successful and patient is recovering well.",
  456,
  "Severe osteoarthritis",
  "Oxycodone, Acetaminophen",
  "Total knee replacement",
  "",
  "No known allergies",
  "Vital signs: BP 140/90; HR 80; Temp 98.3",
  "Physical therapy and follow up with Orthopedics in 2 weeks."
), (
  "2023-05-17",
  "Radiology Report",
  "MRI of the lumbar spine showed a disc herniation at L4-L5. Referral to Pain Management for further management.",
  123,
  "Disc herniation at L4-L5",
  "",
  "",
  "MRI of the lumbar spine showed a disc herniation at L4-L5",
  "",
  "",
  "Referral to Pain Management for further management."
), (
  "2023-05-16",
  "Consultation Note",
  "Patient presented with symptoms of depression and anxiety. Started on a selective serotonin reuptake inhibitor and referred to Psychiatry for further management.",
  789,
  "Depression and anxiety",
  "Sertraline",
  "",
  "",
  "",
  "",
  "Referral to Psychiatry for further management."
);


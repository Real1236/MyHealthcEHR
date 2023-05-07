import React from 'react';
import Popup from 'reactjs-popup';
import 'reactjs-popup/dist/index.css';

export default () => (
  <Popup trigger={<button> Report Type: Consultation Note
    </button>} position="right center">
    <div>Patient presented with complaints of chest pain and shortness of breath. On examination, patient had elevated heart rate and blood pressure. EKG revealed ST-segment elevation, and the patient was diagnosed with acute myocardial infarction. Patient was admitted to the hospital and started on aspirin and heparin. Cardiac catheterization was performed, and the patient underwent successful percutaneous coronary intervention with stent placement. Patient's symptoms improved, and the patient was discharged with instructions for follow-up care with their primary care physician.</div>
  </Popup>
);
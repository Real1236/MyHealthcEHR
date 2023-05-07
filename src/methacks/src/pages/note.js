import React from 'react'

const Note = () => {
  return (
    <div className="ml-80">
    <div className="font-4xl font-bold mb-10">Report Type: Consultation Note</div>

    <div className="font-bold texr-3xl mb-5">Time: 2023-05-05T04:00:00.000+00:00</div>
        <div className="pr-24 mb-10">Patient presented with complaints of chest pain and shortness of breath. On examination, patient had elevated heart rate and blood pressure. EKG revealed ST-segment elevation, and the patient was diagnosed with acute myocardial infarction. Patient was admitted to the hospital and started on aspirin and heparin. <b/> Cardiac catheterization was performed, and the patient underwent successful percutaneous coronary intervention with stent placement. Patient's symptoms improved, and the patient was discharged with instructions for follow-up care with their primary care physician.</div>
        <div className=''> Test Results: Elevated cardiac enzymes and ST-segment elevation on EKG consistent with acute myocardial infarction</div>
    </div>
  )
}

export default Note

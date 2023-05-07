import React, { useState, useEffect } from 'react';
import axios from 'axios';

const Note = () => {
  const [data, setData] = useState([]);

  useEffect(() => {
    axios.get('http://localhost:8080/reports/r/1')
      .then(response => {
        setData(response.data);
      })
      .catch(error => {
        console.log(error);
      });
  }, []);

  return (
    <div className="ml-80 p-6 bg-gray-200 rounded-xl pr-12 mr-12 mt-8">
      <div className="text-2xl font-bold mb-10">Consultation Note</div>
      <div className="p-5 space-y-6">
        <div className="bg-gray-100 rounded-xl p-6 shadow-md hover:shadow-lg">
          <div className="font-bold text-3xl mb-5">Date: {data.reportDate}</div>
          <div className="font-bold mb-5">Report: </div>
          <div className="pr-10 mb-10">{data.reportText}</div>
          <div className="font-bold mb-5">Summary: </div>
          <div className="pr-10 mb-10">{data.reportSummary}</div>
          <div className="font-bold mb-5">Test Results:</div>
          <div className="mb-10">{data.testResults}</div>
          <div className="font-bold mb-5">Prescribed medication:</div>
          <div className="mb-10">{data.medications}</div>
        </div>

      </div>
      {/* <div className="font-bold text-3xl mb-5">Time: 2023-05-05T04:00:00.000+00:00</div>
      <div className="pr-10 mb-10">
        Patient presented with complaints of chest pain and shortness of breath. On examination, patient had elevated heart rate and blood pressure. EKG revealed ST-segment elevation, and the patient was diagnosed with acute myocardial infarction. Patient was admitted to the hospital and started on aspirin and heparin.
        <br /><br />
        Cardiac catheterization was performed, and the patient underwent successful percutaneous coronary intervention with stent placement. Patient's symptoms improved, and the patient was discharged with instructions for follow-up care with their primary care physician.
      </div>
      <div className="font-bold mb-5">Test Results:</div>
      <div className="mb-10">Elevated cardiac enzymes and ST-segment elevation on EKG consistent with acute myocardial infarction</div>
      <div className="font-bold mb-5">Prescribed medication:</div>
      <div className="mb-10">Aspirin, Heparin</div>
      <div className="mt-10">Checked: Dr. John Osopu</div> */}
      <a href="/imaging-reports">
        <button className="mt-8 px-4 py-2 bg-black text-white rounded-lg hover:bg-gray-700 focus:outline-none focus:ring-2 focus:ring-gray-600 focus:ring-opacity-50">
          Return
        </button>
      </a>
    </div>
  );
};

export default Note;
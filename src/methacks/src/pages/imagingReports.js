import React, { useState, useEffect } from 'react';
import axios from 'axios';
import Popup from '../components/popup'



const ImagingReports = (authenticated) => {
  const [data, setData] = useState([]);
  
  useEffect(() => {
    axios.get('http://localhost:8080/reports/1')
      .then(response => {
        setData(response.data);
      })
      .catch(error => {
        console.log(error);
      });
  }, []);

  return (
    <div className="ml-72">
      <h1>Clinical Reports</h1>
      <div className="p-5 ">

      <div className="bg-[#c4c4c4] p-4 rounded-xl"> {data.map((d, idx) => (
        <>
        <h2 className="text-xl font-bold mb-4 mt-9">Report Type: {d.reportType}</h2>
        <h3>{d.reportDate}</h3>
        <p className="mt-3">{d.reportSummary}..</p>
        <a href="/note"><button className="font-bold mt-4 margin auto text-white p-2 bg-[#000000] rounded-xl">Read More</button></a>
        </>
        
      ))} </div>
      </div>

    </div>
    
  );
};
  

export default ImagingReports;

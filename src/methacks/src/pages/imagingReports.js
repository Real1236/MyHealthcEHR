import React, { useState, useEffect } from 'react';
import axios from 'axios';

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
      <div> {data.map((d, idx) => (
        <><h2>Report Type: {d.reportType}</h2><h3>{d.reportDate}</h3><p>{d.reportSummary}</p></>
      ))} </div>
    </div>
  );
};
  

export default ImagingReports;

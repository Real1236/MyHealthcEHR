import React, { useState, useEffect } from 'react';
import axios from 'axios';

const LabTest = (authenticated) => {
  const [data, setData] = useState([]);
  
  useEffect(() => {
    axios.get('http://localhost:8080/labResults/1')
      .then(response => {
        setData(response.data);
      })
      .catch(error => {
        console.log(error);
      });
  }, []);

  return (
    <div className="ml-72">
      <h1>Lab Test Results</h1>
      <div> {data.map((d, idx) => (
        <><h2>Test Type: {d.testType}</h2><h3>{d.date}</h3></>
      ))} </div>
    </div>
  );
}
  

export default LabTest

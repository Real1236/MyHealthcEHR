import React, { useState, useEffect } from 'react';
import axios from 'axios';

const SearchLand = (authenticated) => {
  const requestBody = {
    "query": "hello"
  };
  const [data, setData] = useState([]);

  useEffect(() => {
    axios.post('http://localhost:8080/cohere/rerank/1', requestBody)
      .then(response => {
        console.log(response)
        setData(response.data);
      })
      .catch(error => {
        console.log(error);
      });
  }, []);

  return (
    <><div className='ml-80 mt-6'>
    </div><b>{authenticated ? '' : 'not'}</b><div>
        {data.map((item) => (
          <div key={item.id}>
            <p>ID: {item.id}</p>
            <p>Patient ID: {item.patientId}</p>
            {item.testType && <p>Test Type: {item.testType}</p>}
            {item.date && <p>Date: {item.date}</p>}
            {item.reportDate && <p>Report Date: {item.reportDate}</p>}
            {item.reportType && <p>Report Type: {item.reportType}</p>}
            {item.whiteBloodCount && <p>White Blood Count: {item.whiteBloodCount}</p>}
            {item.immunizationName && <p>Immunization Name: {item.immunizationName}</p>}
            {item.immunizationDate && <p>Immunization Date: {item.immunizationDate}</p>}
            {item.pharmName && <p>Pharmacy Name: {item.pharmName}</p>}
            {item.drugName && <p>Drug Name: {item.drugName}</p>}
          </div>
        ))}
      </div></>
  )
}
export default SearchLand

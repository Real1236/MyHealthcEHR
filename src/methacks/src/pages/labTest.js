import React, { useState, useEffect } from 'react';
import axios from 'axios';

const LabTest = (authenticated) => {
  const [data, setData] = useState([]);

  useEffect(() => {
    axios
      .get('http://localhost:8080/labResults/1')
      .then((response) => {
        setData(response.data);
      })
      .catch((error) => {
        console.log(error);
      });
  }, []);

  return (
    <div className="ml-72 p-6 bg-white rounded-lg shadow-lg">
      <h1 className="text-3xl font-bold mb-24">Lab Test Results</h1>
      {data.map((d, idx) => (
        <div
          className="border-b border-gray-200 pb-6 hover:bg-gray-100 transition-colors duration-300"
          key={idx}
        >
          <h2 className="text-xl font-bold mb-2">Test Type: {d.testType}</h2>
          <h3 className="text-gray-600">{d.date}</h3>
        </div>
      ))}
    </div>
  );
};

export default LabTest;
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
      <div className="p-5 space-y-6">

        {data.map((d, idx) => (
          <div key={idx} className="bg-gray-100 rounded-xl p-6 shadow-md hover:shadow-lg">
            <h2 className="text-2xl font-bold">{d.reportType}</h2>
            <h3 className="text-gray-500">{d.reportDate}</h3>
            <p className="mt-4">{d.reportSummary}</p>
            <a href="/note" className="inline-block mt-4 text-white bg-black px-4 py-2 rounded-xl font-bold hover:bg-gray-800">Read More</a>
          </div>
        ))}

      </div>
    </div>
  );
};

export default ImagingReports;
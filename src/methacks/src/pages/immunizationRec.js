import React, { useState, useEffect } from 'react';
import axios from 'axios';

const ImmunizationRec = (authenticated) => {
  const [data, setData] = useState([]);

  useEffect(() => {
    axios
      .get('http://localhost:8080/immRecords/1')
      .then((response) => {
        console.log(response);
        setData(response.data);
      })
      .catch((error) => {
        console.log(error);
      });
  }, []);

  return (
    <div className="ml-72">
      <h1 className="text-3xl font-bold mb-6">Drug and Pharmacy Service Information</h1>
      <table className="table-auto w-full border-collapse">
        <thead>
          <tr className="border-b border-gray-200 bg-gray-100 text-left">
            <th className="px-4 py-2 font-medium">Immunization Name</th>
            <th className="px-4 py-2 font-medium">Immunization Date</th>
            <th className="px-4 py-2 font-medium">Immunization Site</th>
            <th className="px-4 py-2 font-medium">Immunization Dose</th>
            <th className="px-4 py-2 font-medium">Immunization Provider</th>
            <th className="px-4 py-2 font-medium">Next Due Date</th>
          </tr>
        </thead>
        <tbody>
          {data.map((d, idx) => (
            <tr key={idx} className="border-b border-gray-200 hover:bg-gray-100 transition-colors duration-300">
              <td className="px-4 py-2">{d.immunizationName}</td>
              <td className="px-4 py-2">{d.immunizationDate}</td>
              <td className="px-4 py-2">{d.immunizationSite}</td>
              <td className="px-4 py-2">{d.immunizationDose}</td>
              <td className="px-4 py-2">{d.immunizationProvider}</td>
              <td className="px-4 py-2">{d.nextDueDate}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default ImmunizationRec;
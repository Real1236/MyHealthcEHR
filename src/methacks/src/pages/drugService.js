import React, { useState, useEffect } from 'react';
import axios from 'axios';

const DrugService = ({ authenticated }) => {
  const [data, setData] = useState([]);

  useEffect(() => {
    axios.get('http://localhost:8080/drugs/1')
      .then(response => {
        console.log(response);
        setData(response.data);
      })
      .catch(error => {
        console.log(error);
      });
  }, []);

  return (
    <div className="ml-72">
      <h1 className="text-2xl font-bold mb-4">Drug and Pharmacy Service Information</h1>
      <div className="bg-white shadow-md rounded my-6 pr-24">
        <table className="w-full table-auto pr-24">
          <thead>
            <tr className="bg-gray-200 text-gray-600 uppercase text-sm leading-normal pr-24">
              <th className="py-3 px-6 text-left">Pharmaceutical Name</th>
              <th className="py-3 px-6 text-left">Drug Name</th>
              <th className="py-3 px-6 text-left">Brand Name</th>
              <th className="py-3 px-6 text-left">Drug Class</th>
              <th className="py-3 px-6 text-left">Indications</th>
              <th className="py-3 px-6 text-left">Dosage Form</th>
              <th className="py-3 px-6 text-left">Dosage Strength</th>
              <th className="py-3 px-6 text-left">Route of Administration</th>
              <th className="py-3 px-6 text-left">Mechanism of Action</th>
            </tr>
          </thead>
          <tbody className="text-gray-600 text-sm font-light">
            {data.map((d, idx) => (
              <tr className="border-b border-gray-200 hover:bg-gray-100">
                <td className="py-3 px-6 text-left whitespace-nowrap">{d.pharmName}</td>
                <td className="py-3 px-6 text-left whitespace-nowrap">{d.drugName}</td>
                <td className="py-3 px-6 text-left whitespace-nowrap">{d.brandName}</td>
                <td className="py-3 px-6 text-left whitespace-nowrap">{d.drugClass}</td>
                <td className="py-3 px-6 text-left whitespace-nowrap">{d.indications}</td>
                <td className="py-3 px-6 text-left whitespace-nowrap">{d.dosageForm}</td>
                <td className="py-3 px-6 text-left whitespace-nowrap">{d.dosageStrengths}</td>
                <td className="py-3 px-6 text-left whitespace-nowrap">{d.routeOfAdministration}</td>
                <td className="py-3 px-6 text-left whitespace-nowrap">{d.mechanismOfAction}</td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    </div>
  );
};

export default DrugService;
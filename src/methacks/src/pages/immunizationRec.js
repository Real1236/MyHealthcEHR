import React, { useState, useEffect } from 'react';
import axios from 'axios';

const ImmunizationRec = (authenticated) => {
  const [data, setData] = useState([]);

  useEffect(() => {
    axios.get('http://localhost:8080/immRecords/1')
      .then(response => {
        console.log(response)
        setData(response.data);
      })
      .catch(error => {
        console.log(error);
      });
  }, []);

  return (
    <div className="ml-72">
      <h1>Drug and Pharmacy Service Information</h1>
      <table>
        <thead>
          <tr>
            <th>Immunization Name</th>
            <th>Immunization Date</th>
            <th>Immunization Site</th>
            <th>Immunization Dose</th>
            <th>Immunization Provider</th>
            <th>Next Due Date</th>
          </tr>
        </thead>
        <tbody>
          {data.map((d, idx) => (
            <tr>
              <td>{d.immunizationName}</td>
              <td>{d.immunizationDate}</td>
              <td>{d.immunizationSite}</td>
              <td>{d.immunizationDose}</td>
              <td>{d.immunizationProvider}</td>
              <td>{d.nextDueDate}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}
  
export default ImmunizationRec

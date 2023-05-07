import React, { useState, useEffect } from 'react';
import axios from 'axios';

const DrugService = ({ authenticated }) => {
    const [data, setData] = useState([]);
  
    // useEffect(() => {
    //   if (authenticated) {
    //     axios.get('http://localhost:8080/patients/1')
    //       .then(response => {
    //         console.log("WOrking")
    //         setData(response.data);
    //       })
    //       .catch(error => {
    //         console.log("WHere am i")
    //         console.log(error);
    //       });
    //   }
    // }, [authenticated]);

    useEffect(() => {
      axios.get('http://localhost:8080/drugs/1')
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
              <th>Pharmaceutical Name</th>
              <th>Drug Name</th>
              <th>Brand Name</th>
              <th>Drug Class</th>
              <th>Indications</th>
              <th>Dosage Form</th>
              <th>Dosage Strength</th>
              <th>Route of Administration</th>
              <th>Mechanism of Action</th>
            </tr>
          </thead>
          <tbody>
            {data.map((d, idx) => (
              <tr>
                <td>{d.pharmName}</td>
                <td>{d.drugName}</td>
                <td>{d.brandName}</td>
                <td>{d.drugClass}</td>
                <td>{d.indications}</td>
                <td>{d.dosageForm}</td>
                <td>{d.dosageStrengths}</td>
                <td>{d.routeOfAdministration}</td>
                <td>{d.mechanismOfAction}</td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    );
  };
  
  export default DrugService;
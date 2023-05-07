import React, { useState, useEffect } from 'react';
import axios from 'axios';

const DrugService = ({ authenticated }) => {
    const [data, setData] = useState([]);
  
    useEffect(() => {
        axios.get('http://localhost:8080/patients/1')
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
        <h1>Drug Service Information</h1>
        {authenticated && (
          <ul>
            {data.reports[0].reportDate}
          </ul>
        )}
        {!authenticated && <p>Please log in to see the drug service information.</p>}
      </div>
    );
  };
  
  export default DrugService;
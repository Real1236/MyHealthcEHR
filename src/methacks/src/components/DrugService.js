import React, { useState, useEffect } from 'react';
import axios from 'axios';

const DrugService = ({ authenticated }) => {
  const [data, setData] = useState([]);

  useEffect(() => {
    if (authenticated) {
      axios.get('http://localhost:8080/patients/1')
        .then(response => {
          setData(response.data);
        })
        .catch(error => {
          console.log(error);
        });
    }
  }, [authenticated]);

  return (
    <div>
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
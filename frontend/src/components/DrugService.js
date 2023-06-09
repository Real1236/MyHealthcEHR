import React, { useState, useEffect } from 'react';
import axios from 'axios';

const DrugService = ({ authenticated }) => {
  const [data, setData] = useState([]);

  // useEffect(() => {
  //   if (authenticated) {
  //     axios.get('http://localhost:8080/patients/1')
  //       .then(response => {
  //         setData(response.data);
  //       })
  //       .catch(error => {
  //         console.log(error);
  //       });
  //   }
  // }, [authenticated]);

  useEffect(() => {
    console.log("Before the api call");
    axios.get('http://localhost:8080/patients/1')
        .then(response => {
          console.log("Response retrieved")
          setData(response.data);
        })
        .catch(error => {
          console.log("error");
          console.log(error);
        });
  }, [])

  return (
    <div>
      <h1>Drug Service Information</h1>
      <p>Hello</p>
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
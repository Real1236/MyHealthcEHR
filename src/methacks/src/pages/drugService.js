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
        axios.get('http://localhost:8080/patients/1')
          .then(response => {
            console.log("WOrking")
            setData(response.data);
            console.log(response.data)
            console.log(authenticated)
          })
          .catch(error => {
            console.log("WHere am i")
            console.log(error);
          });
    }, [])

    
  
    return (
      <div className="ml-72">
        <h1>Drug Service Information</h1>
        {authenticated && (
          <h1 className='ml-96'>
            {data.reports[0].reportDate}
          </h1>
        )}
        {!authenticated && <p>Please log in to see the drug service information.</p>}
      </div>
    );
  };
  
  export default DrugService;
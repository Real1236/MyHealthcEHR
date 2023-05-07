import React, { useState, useEffect } from 'react';
import axios from 'axios';

const SearchLand = (authenticated) => {
  const requestBody = {
    "query": "hello"
  };
  const [data, setData] = useState([]);

  useEffect(() => {
    axios.post('http://localhost:8080/cohere/rerank/1', requestBody, {
      headers: {
        "Access-Control-Allow-Origin": "*",
        "Access-Control-Allow-Methods": "DELETE, POST, GET, OPTIONS",
        "Access-Control-Allow-Headers": "Content-Type, Authorization, X-Requested-With"
      }
    })
      .then(response => {
        console.log(response)
        setData(response.data);
      })
      .catch(error => {
        console.log(error);
      });
  }, []);

  return (
    <div className='ml-80 mt-6'>
    <b>{authenticated ? '':'not'}</b>
    <h1 ></h1>
    </div>
  )
}
export default SearchLand

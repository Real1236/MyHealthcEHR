import React, { useState, useEffect } from 'react';
import axios from 'axios';
import HealthCard from '../images/HealthCard.png'


const Dashboard = (authenticated) => {
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
    <div>
    <div className="ml-80 mt-12 p-8 rounded-xl shadow-xl mx-auto mr-16" >
    <b>{authenticated ? '':'not'}</b>
    <p className='text-5xl'>Account Details</p>
      <div className='flex'>
        <img className="w-48 rounded-3xl mt-12" src={HealthCard}/>
        <div className=" ml-12 mt-16">
        
        <h1 className="text-2xl font-bold"> Name:</h1> 
        <p className='text-md'> Vaishnavi Jeyacumar</p>
        <h1 className="text-2xl  mt-6 font-bold"> Account:</h1> 
        <p className='text-md'> Vaishnavijeyacumar123@gmail.com</p>
        <h1 className="text-xl  mt-6 font-bold text-[#2195BD]"> MedHealthID: 76D3OI</h1> 
        </div>
      </div>
      
    </div>

    <div className="ml-80 mt-12 p-8 rounded-xl shadow mx-auto bg-[#BCE5E9]">
      <div>
      <h3 className='text-3xl'>General Information</h3>
        <p>Name: {data.name}</p>
        <p>Sex: {data.sex}</p>
        <p>Phone: {data.phone}</p>
        <p>DOB: {data.date}</p>
        <p>Address: {data.address}</p>
      </div>

      <div>
      <h3 className='text-3xl'>Insurance</h3>
        <p>Medical: {data.medInsurance}</p>
        <p>Vision: {data.visInsurance}</p>
        <p>Dental: {data.denInsurance}</p>
      </div>
    
    </div>

    </div>
  )
}

export default Dashboard

import React from 'react'
import HealthCard from '../images/HealthCard.png'

const Dashboard = (authenticated) => {

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
    <p className='text-3xl'>General Information</p>

    </div>

    </div>
  )
}

export default Dashboard

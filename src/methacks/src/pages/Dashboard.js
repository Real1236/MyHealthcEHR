import React from 'react'
import HealthCard from '../images/HealthCard.png'

const Dashboard = (authenticated) => {

  return (
    <div className="ml-80 mt-12 ">
    <b>{authenticated ? '':'not'}</b>
    <p className='text-5xl'>Account Details</p>
      <img className="w-48 rounded-3xl mt-12" src={HealthCard}/>
    </div>
  )
}

export default Dashboard

import React from 'react'
import Immunizationtable from '../images/Immunizationtable.png'

const ImmunizationRec = (authenticated) => {

    return (
      <div className="ml-80">
      <b>{authenticated ? '':'not'}</b>
      <img className="h-96 mt-16" src={Immunizationtable}/>
        
      </div>
    )
  }
  
export default ImmunizationRec

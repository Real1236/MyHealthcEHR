import React, {useState} from 'react'
import Switch from 'react-switch'


const Toggle = () => {
    const [checked, setChecked] = useState(false);
    const handleChange = nextChecked => {
      setChecked(nextChecked);
    };
  
    return (
      <div className="ml-96">
        <div className='ml-96'>
          <Switch
            onChange={handleChange}
            checked={checked}
            className="ml-80 mt-5"
          />

        </div>
      </div>
    );
  };

export default Toggle

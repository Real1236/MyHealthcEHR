import React, { useState } from 'react';

function InputBox({placeholder}) {
  const [inputValue, setInputValue] = useState('');

  const handleInputChange = (event) => {
    setInputValue(event.target.value);
  };

  return (
    <div>
      <input
        className="rounded-md w-80 mt-8 ml-64 border-2 bg-[#DBFCFF] p-1 border-[#a9e3e8]"
        id="inputBox"
        type="text"
        placeholder={placeholder}
        value={inputValue}
        onChange={handleInputChange}
      />
    </div>
  );
}

export default InputBox;
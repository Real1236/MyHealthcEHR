import React, { useState } from 'react';

function InputBox() {
  const [inputValue, setInputValue] = useState('');

  const handleInputChange = (event) => {
    setInputValue(event.target.value);
  };

  return (
    <div>
      <input
        className="rounded-md w-64 mt-12 ml-80 border-2 bg-blue-100 p-1 border-black"
        id="inputBox"
        type="text"
        value={inputValue}
        onChange={handleInputChange}
      />
    </div>
  );
}

export default InputBox;
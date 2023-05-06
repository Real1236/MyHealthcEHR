import React, { useState } from 'react';

function SearchbarComponent({placeholder}) {
  const [inputValue, setInputValue] = useState('');

  const handleInputChange = (event) => {
    setInputValue(event.target.value);
  };

  return (
    <div>
      <input
        className="rounded-2xl w-80 mt-8  border-2 bg-[#DBFCFF] p-1 border-[#a9e3e8]"
        type="text"
        placeholder={placeholder}
        value={inputValue}
        onChange={handleInputChange}
      />
    </div>
  );
}

export default SearchbarComponent;
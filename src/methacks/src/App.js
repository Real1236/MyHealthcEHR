import Navbar from "./components/Navbar";
import Login from "./components/Login"
import { BrowserRouter, Routes, Route } from 'react-router-dom';

function App() {
  return (
    <div className="App">
      <header className="App-header">
      <BrowserRouter>
        <Login/>
        <Navbar/>
      </BrowserRouter>
      </header>
    </div>
  );
}

export default App;

import { BrowserRouter, Routes, Route } from 'react-router-dom';
import { useState } from 'react';
import Navbar from "./components/Navbar";
import Login from "./components/Login"
import Dashboard from "./pages/Dashboard"
import Main from "./pages/Main"

function App() {
  const [authenticated, setAuthenticated] = useState(false);

  const handleLogin = () => {
    setAuthenticated(true);
  }

  return (
    <div className="App">
      <header className="App-header">
      <BrowserRouter>
        <Login onLogin={handleLogin}/>
        {authenticated && <Navbar/>}
        <Routes>
          {authenticated && <Route path="/Dashboard" exact element={<Dashboard/>}/>}
          {authenticated && <Route path="/main" exact element={<Main/>}/>}
        </Routes>
      </BrowserRouter>
      </header>
    </div>
  );
}

export default App;
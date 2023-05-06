import { BrowserRouter, Routes, Route } from 'react-router-dom';
import Navbar from "./components/Navbar";
import Login from "./components/Login"
import Home from "./pages/Home"
import Main from "./pages/Main"

function App() {
  return (
    <div className="App">
      <header className="App-header">
      <BrowserRouter>
        <Login/>
        <Navbar/>
        <Routes>
          <Route path="/" exact element = {<Home/>}/>
          <Route path="/main" exact element = {<Main/>}/>

        </Routes>
      </BrowserRouter>
      </header>
    </div>
  );
}

export default App;

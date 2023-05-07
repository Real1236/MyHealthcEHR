import { BrowserRouter, Routes, Route, useNavigate } from 'react-router-dom';
import { useState } from 'react';
import Searchbar from "./components/SearchBar";
import Login from "./components/Login";
import Dashboard from "./pages/Dashboard";
import Sidebar from './components/Sidebar';
import DrugService from './pages/drugService';
import LabTest from './pages/labTest';
import ImagingReports from './pages/imagingReports';
import ImmunizationRec from './pages/immunizationRec';
import  SearchLand  from './pages/search';

function App() {
  const [authenticated, setAuthenticated] = useState(false);
  // const navigate = useNavigate();


  const handleLogin = () => {
    console.log("Hello")
    setAuthenticated(true);

  }
  // if (authenticated) {
  //   navigate('/Dashboard');
  // }


  const ComponentWithSearchbar = (props) => {
    return (
      <div >
        <div className='flex'>
          <Searchbar />
          <Sidebar/>
        </div>
        {props.children}
      </div>
    )
  }

  return (
    <div className="App">
      <BrowserRouter>
        {authenticated && <Searchbar/>}
        {authenticated && <Sidebar/>}
        <Routes>
          <Route path="/" exact element={<Login handleLogin={handleLogin} />} />
          <Route path="/Login" exact element={<ComponentWithSearchbar><Login handleLogin={handleLogin} /></ComponentWithSearchbar>} />
          <Route path="/Dashboard" exact element={<ComponentWithSearchbar><Dashboard /></ComponentWithSearchbar>} />
          <Route path="/imaging-reports" exact element={<ComponentWithSearchbar><ImagingReports /></ComponentWithSearchbar>} />
          <Route path="/service-inforformation" exact element={<ComponentWithSearchbar><DrugService /></ComponentWithSearchbar>} />
          <Route path="/immunization-records" exact element={<ComponentWithSearchbar><ImmunizationRec /></ComponentWithSearchbar>} />
          <Route path="/lab-tests" exact element={<ComponentWithSearchbar><LabTest /></ComponentWithSearchbar>} />
          <Route path="/search" exact element={<ComponentWithSearchbar><SearchLand /></ComponentWithSearchbar>} />
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;

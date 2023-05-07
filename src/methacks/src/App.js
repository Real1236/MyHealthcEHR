import { BrowserRouter, Routes, Route } from 'react-router-dom';
import { useState } from 'react';
import Searchbar from "./components/SearchBar";
import Login from "./components/Login"
import Dashboard from "./pages/Dashboard"
import Sidebar from './components/Sidebar';
import DrugService from './pages/drugService';
import LabTest from './pages/labTest';
import ImagingReports from './pages/imagingReports';
import ImmunizationRec from './pages/immunizationRec';

function App() {
  const [authenticated, setAuthenticated] = useState(false);

  const handleLogin = () => {
    setAuthenticated(true);
  }

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
          <Route path="/" exact element={<Login/>}/>
          <Route path="/Login" exact element={<ComponentWithSearchbar><Login/></ComponentWithSearchbar>}/>
          <Route path="/Dashboard" exact element={
            <ComponentWithSearchbar><Dashboard authenticated={authenticated}/></ComponentWithSearchbar>}/>
            <Route path="/imaging-reports" exact element={
              <ComponentWithSearchbar><ImagingReports authenticated={authenticated}/></ComponentWithSearchbar>}/>
          <Route path="/service-inforformation" exact element={
            <ComponentWithSearchbar><DrugService authenticated={authenticated}/></ComponentWithSearchbar>}/>
          <Route path="/immunization-records" exact element={
            <ComponentWithSearchbar><ImmunizationRec authenticated={authenticated}/></ComponentWithSearchbar>}/>
          <Route path="/lab-tests" exact element={
            <ComponentWithSearchbar><LabTest authenticated={authenticated}/></ComponentWithSearchbar>}/>

        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
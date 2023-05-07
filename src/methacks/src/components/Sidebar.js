import { useState } from "react";
import { Link, useLocation } from "react-router-dom";
import Logo from '../images/logo.png';
import Clinical from '../images/Clinical.png'
import DrugPharmacy from '../images/DrugPharmacy.png'
import Immunization from '../images/Immunization.png'
import Labtest from '../images/Labtest.png'

const links = [
  {
    path: "/imaging-reports",
    name: "Clinical and Diagnostic Imaging Reports",
    icon: <img src={Clinical}/>,
  },
  {
    path: "/service-inforformation",
    name: "Drug and Pharmacy Service Information",
    icon: <img src={DrugPharmacy}/>,
  },
  {
    path: "/lab-tests",
    name: "Lab Test results",
    icon: <img src={Labtest}/>,
  },
  {
    path: "/immunization-records",
    name: "Immunization Records",
    icon: <img src={Immunization}/>,
  },
];

const Sidebar = () => {
  const [showDropdown, setShowDropdown] = useState(false);
  const { pathname } = useLocation();

  return (
    <header className=" absolute mb-96 border-[#999999] border-solid border-2 flex flex-col bg-[#ffffff] z-[99999999] w-64 h-full shadow-xl">
      <div className="flex justify-center items-center ">
        <Link className="flex flex-row items-center gap-4 font-bold text-xl text-teal" to="/Dashboard">
          <img src={Logo} className="h-12 mt-4" alt="Logo" />
        </Link>
      </div>
      <nav className="flex-grow h-full">
        {links.map(({ name, icon, path }) => (
          <Link
            key={name}
            className={`text-black flex items-center px-4 py-2 hover:bg-gray-700/50 duration-300 transition-colors ${
              pathname === path && "text-black bg-gray-700/50"
            }`}
            to={path}
          >
            <span className="text-black my-8 mr-8">{name}</span>
            <span className="w-16">{icon}</span>
          </Link>
        ))}
      </nav>
    </header>
  );
};

export default Sidebar;

import { useNavigate } from 'react-router-dom';
import {useState} from 'react'
import InputBox from './Inputbox';
import LoginButton from './LoginAuth';
import LogoutButton from './LogoutAuth';
import { gapi } from 'gapi-script';
import { useEffect } from 'react';
import Yahoo from '../images/yahoo.png'
import Outlook from '../images/outlook.png'
import Signup from './Signup';
import Logo from '../images/logo.png'

const clientId = "331894438865-bknj5cat5h7iqe4t484t0iu3dor43stp.apps.googleusercontent.com";


function Login({ authenticated, handleLogin }) {

  useEffect(() => {
    function start() {
      gapi.client.init({
        clientId: clientId,
        scope: ""
      });
    }
    gapi.load('client:auth2', start);
  }, []);


  return (
    <div>
      <img className="w-16 p-2 m-2 absolute" src={Logo}/>
    <div className="flex">

    <div className="mb-96">
      <h1 className="text-3xl ml-64 mt-4 font-bold mt-48">Login To Your Account</h1>
      <div className="ml-16 flex mb-4">
      <img className="w-30 ml-40 h-14 mt-8 p-2 rounded-sm shadow-xl border-gray-100 border-2" src={Outlook}/>
        <LoginButton />
        <img className="w-30 h-14 mt-8 ml-6 p-4 rounded-sm shadow-xl border-gray-100 border-2" src={Yahoo}/>
        </div>
        <div className='font-bold my-4 pt-4 ml-64'>—————————OR——————————</div>
      <InputBox placeholder="Gmail" />
      <InputBox placeholder="Password" />

      <a href='/Dashboard'><div className="ml-12"><button className="rounded-3xl bg-[#57BEC8] mt-12 text-white px-4 py-2 text-xl ml-80" onClick={handleLogin}>Sign In</button></div></a>
    </div>
  <div className='ml-80'>
    <Signup/>
  </div>
    </div>
  </div>
  );
}

export default Login;
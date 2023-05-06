import { useNavigate } from 'react-router-dom';
import Home from '../pages/Home';
import InputBox from './Inputbox';
import LoginButton from './LoginAuth';
import LogoutButton from './LogoutAuth';
import { gapi } from 'gapi-script';
import { useEffect } from 'react';

const clientId = "331894438865-bknj5cat5h7iqe4t484t0iu3dor43stp.apps.googleusercontent.com";

function Login() {
  const history = useNavigate();

  useEffect(() => {
    function start() {
      gapi.client.init({
        clientId: clientId,
        scope: ""
      });
    }
    gapi.load('client:auth2', start);
  }, []);

  function handleLogin() {
    history('/');
  }

  return (
    <div className="mb-96">
      <h1 className="text-5xl ml-48 mt-80">Login To Your Account</h1>
      <LoginButton />
      <InputBox className="" />

      <button className="rounded-md bg-black mt-40 text-white px-4 py-2 text-xl ml-96" onClick={handleLogin}>Sign In</button>
    </div>
  );
}

export default Login;
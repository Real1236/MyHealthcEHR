import {useHistory} from 'react-router-dom'

function Login() {
    const history = useHistory();
  
    function handleLogin() {
      history.push('/App.js');
    }


    return (
      <div>
        <h1>Login Page</h1>
        <button onClick={handleLogin}>Login</button>
      </div>
    );
  }
  
  export default Login;
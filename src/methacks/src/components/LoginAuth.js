import { GoogleLogin } from "react-google-login";

const clientId="331894438865-bknj5cat5h7iqe4t484t0iu3dor43stp.apps.googleusercontent.com"

function googleAuth() {

    const onSuccess = (res) => {
        console.log("LOGIN SUCCESS! Current user: ", res.profileObj)
    }

    const onFailure = (res) => {
        console.log("LOGIN FAILED! Current user: ", res)
    }

    return(
        <GoogleLogin
            className=" ml-4 mt-8"
            clientId={clientId}
            buttonText="Login with Google"
            onSuccess={onSuccess}
            onFailure={onFailure}
            cookiePolicy={'single_host_origin'}
            isSignedIn={true}

        />

    )
}

export default googleAuth
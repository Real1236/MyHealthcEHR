import { GoogleLogout } from "react-google-login";

const clientId="331894438865-bknj5cat5h7iqe4t484t0iu3dor43stp.apps.googleusercontent.com"

function googleAuthOut() {

    const onSuccess =() => {
        console.log("nice")
    }

    return(
        <div>
        <GoogleLogout id="signOutButton"
            clientId={clientId}
            buttonText={"Logout"}
            onSuccess={onSuccess}
            cookiePolicy={'single_host_origin'}
            isSignedIn={true}

        />
        </div>
    )
}

export default googleAuthOut
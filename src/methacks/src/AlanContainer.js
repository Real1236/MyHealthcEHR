import React, {useEffect, useRef} from "react";
import alanBtn from '@alan-ai/alan-sdk-web';


const AlanContainer = () => {

    const rootElRef = useRef(null);

    useEffect(() => {
        alanBtn({
            key: 'df1b7033a09eca3d92ed520d95d3972d2e956eca572e1d8b807a3e2338fdd0dc/stage',
            onCommand: (commandData) => {
              if (commandData.command === 'go:back') {
                // Call the client code that will react to the received command
              }
            }
        });
      }, []);

    return(
        <div className = "alan-btn-container">
            <div ref={rootElRef}></div>
        </div>
    )
}

export default AlanContainer
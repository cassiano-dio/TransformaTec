import { useState } from "react";

function Cor (props){

    const [cor, setCor] = useState("azul")

    return(
        <div>
            <h2>
                Minha cor favorita é: {cor}
            </h2>
            <button onClick={
                () => setCor(props.cor)
            }>
                Alterar cor
            </button>
        </div>
    )

}

export default Cor
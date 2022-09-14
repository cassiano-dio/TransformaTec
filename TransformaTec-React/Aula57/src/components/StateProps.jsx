import { useState } from "react";

export default function StateColor(props){

    const [cor, setCor] = useState("azul")

    return (
        <div>
            <h1>Componente de função com props</h1>
            <h3>Minha cor favorita é: {cor} </h3>
            <button onClick={ () => setCor(props.cor) } >
                Alterar cor
            </button>
        </div>
    )

}
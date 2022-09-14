import React, {useState} from 'react';

export default function UseStateFunction(){

//export default UseStateFunction = () => {

    //hook setState
    const [clicks,setClicks] = useState(0)

    return (
        <div>
            <h3>Componente de função</h3>
            <p>Quantidade de cliques: {clicks}</p>
            <button onClick={
                () => setClicks(clicks + 1)
            }>
                Clique aqui!
            </button>
        </div>
    )

} 
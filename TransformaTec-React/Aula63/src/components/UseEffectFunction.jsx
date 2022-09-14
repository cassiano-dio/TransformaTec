import React, {useEffect, UseEffect, useState} from 'react'

export default function UseEffectFunction (){

    const [clicks, setClicks] = useState(0)
    const [press, setPress] = useState(0)

    useEffect(() => {
        document.title= `Quantidade de cliques: ${clicks}`
    },[clicks])

    return (
        <div>
            <h3>useEffect na função</h3>
            <p>Quantidade de cliques: {clicks}</p>
            <button onClick={
                () => setClicks(clicks + 1)
            }>
                Clique aqui!
            </button>
        </div>
    )
}
import React, {useEffect, useState} from 'react'

export default function UseEffectFunction() {


    const [clicks, setClicks] = useState(0)
    const [pressed,setPressed] = useState(0)

    useEffect(
        () => {
            document.title = `Clicks: ${clicks}`
        },[clicks]
    )

    return (
        <div>
            <h3>UseEffect em Função</h3>
                <p>Clicks: {clicks}</p>
                <button
                    onClick={
                        () =>setClicks(clicks + 1)
                    }
                >
                    Clique aqui
                </button>
        </div>
    )
}
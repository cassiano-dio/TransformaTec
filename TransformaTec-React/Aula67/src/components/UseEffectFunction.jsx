import React, {useState, useEffect} from 'react'

export default function UseEffectFunction(){


    const [count, setCount] = useState(0)

    useEffect(
        () => {
            document.title = `Cliques: ${count}`
        },[count]
    )

    return (
        <div>
            <p>Cliques {count}</p>
            <button onClick={() => setCount(count + 1)}>
                Clique aqui amigo!
            </button>
        </div>
    );
}
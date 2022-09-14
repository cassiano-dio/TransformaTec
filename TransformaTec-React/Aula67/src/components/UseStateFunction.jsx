import { useState } from "react";

export default function UseStateFunction(){

    const [count, setCount] = useState(0)
    
    return(
        <div>
            <h4>SetState em componente de Função</h4>
            <p>Quantidade de cliques: {count}</p>
            <button
                onClick={
                    () => setCount(count + 1)
                }
            >
                Clique aqui amigo!
            </button>
        </div>
    )
}

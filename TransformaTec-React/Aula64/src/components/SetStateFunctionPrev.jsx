import React, {useState} from 'react'

export default function SetStateFunctionPrev(){

    const [state,setState] = useState({
        name: 'Cassiano',
        age:32
    })

    return (
        <div>
            <button
                //realizando merge com estado anterior no componente de classe
                onClick={() => setState(
                    prevState => {
                        return {...prevState, name: 'Cassiano Ricardo'}
                    }
                )}
            >
                Atualizar nome
            </button>
            {JSON.stringify(state)}
        </div>
    )
}
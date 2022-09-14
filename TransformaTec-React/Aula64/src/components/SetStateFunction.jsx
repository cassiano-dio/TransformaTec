import React, {useState} from 'react'

export default function SetStateFunction(){

    const [state,setState] = useState({
        name: 'Cassiano',
        age:32
    })

    return (
        <div>
            //Atualizando uma propriedade do objeto e perdendo a outra
            <button
                onClick={() => setState({name:'Cassiano Ricardo'})}
            >
                Atualizar nome
            </button>
            {JSON.stringify(state)}
        </div>
    )
}
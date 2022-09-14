import React, {useState} from 'react'

export default function StateFunction (){

    const [numero, setNumero] = useState(10)

    return (
        <div>
            <h1>Componente de função</h1>
            <h1> Numero Atual: {numero} </h1>
            <button onClick={
                () => setNumero(numero + 15)
            }>
                Somar
            </button>
        </div>
    )

}
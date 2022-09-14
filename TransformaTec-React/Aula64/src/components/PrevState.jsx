import React, {useState} from 'react'

export default function PrevState(){

    const [balance, setBalance] = useState(100)

    //Atualiza o estado com o valor correto
    const deposit = () =>{

        setTimeout(() =>{
            //setBalance(balance + 100) //atualiza com o estado desatualizado
            setBalance((prevState) => prevState + 100)
        },3000)

    }

    return(
        <div>
            <button onClick={deposit}>Depositar 100</button>
            <button
                onClick={() => setBalance(balance - 200)}
            >
                Sacar 200
            </button>
            <h3>Meu saldo é: {balance}</h3>
        </div>
    )


}
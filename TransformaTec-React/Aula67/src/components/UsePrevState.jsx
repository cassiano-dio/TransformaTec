import React, {useState} from 'react'

export default function UsePrevState(){

    const [balance, setBalance] = useState(150)

    const deposit = () => {

        setTimeout(() => {
            
            //setBalance(balance + 100)
            setBalance((prevState) => prevState + 100)

        }, 3000);

    }


    return(
        <div>
            <h4>SetState com prevState</h4>
            <button
                onClick={deposit}
            >
                Depositar 100
            </button>

            <button
                onClick={
                    () => setBalance(balance - 200)
                }
            >
                Sacar 200
            </button>
            <p>Meu saldo atual é : {balance}</p>
        </div>
    )
}
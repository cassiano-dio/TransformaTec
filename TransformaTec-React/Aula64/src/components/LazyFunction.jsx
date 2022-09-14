import React, {useState} from 'react';

function counter(){
    return Math.random();
}


export default function LazyFunction(){

    
    //chama a função apenas uma vez
    const [myState, setMyState] = useState(counter());
    const [num, setNum] = useState(0);

    return (
        <div>
            <h3>Valor do state inicial: {myState}</h3>
            <h3>Valor do num: {num}</h3>
            <button
                onClick={
                    () => setNum(num + 1)
                }
            >
                Clique aqui!
            </button>
        </div>
    )

}
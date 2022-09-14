import React, {useState} from 'react'

export default function UseStateObject(){

    const [user, setUser] = useState(
        {
            name: 'Cassiano',
            age:32
        }
    )

    return (
        <div>
            <h4>Exemplo de prevState em objeto</h4>
            <button
                // onClick={
                //     ()=> setUser({name:'Cassiano Ricardo'})
                // }

                onClick={
                    () =>setUser(
                        (prevState) => {
                            return {...prevState, name: 'Cassiano Ricardo'}
                        }
                    )
                }
            >
                Atualizar nome
            </button>
            <p>
                {JSON.stringify(user)}
            </p>
        </div>
    )
}
import React, {useState} from 'react'

export default function FormState(){


    //Chamando mais de um setState
    const [username, setUsername] = useState('')
    const [email, setEmail] = useState('')

    const showData = (event) => {

        event.preventDefault()
        alert(username + ' ' + email)
    }

    return (
        <form onSubmit={showData}>

            <input 
                type="text" 
                value={username}
                onChange={event => setUsername(event.target.value)}
                name="username"
                placeholder='Username'
            />

            <input 
                type="text" 
                value={email}
                onChange={event => setEmail(event.target.value)}
                name="email"
                placeholder='Email'
            />

            <button>Enviar</button>

        </form>
    )

}
import React, {useState} from 'react'

const AddUserForm = (props) => {

    const addButton = {
        "backgroundColor": "lightgreen"
    }

    const initForm = {id:null, name:'', username:'', email:'', age:null}
    const [user, setUser] = useState(initForm)
    const handleInputChange = (event) => {

        const {name, value} = event.target;

        //O operador spread (...) pega o valor de cada campo do formulário e altera o estado inicial do formulário com os dados do novo usuário (funciona como um loop em um array de campos)
        setUser({...user, [name]:value})

    }

    return (

        <form
            style={
                {
                    display: 'flex',
                    flexDirection: 'column',
                }
            }
            onSubmit={
            (event) =>{
                
                event.preventDefault()
                if(!user.name || !user.username|| !user.email || !user.age)
                    return

                props.addUser(user)
                setUser(initForm)
            }
        }>
            <label >Nome</label>
            <input type="text" name='name' value={user.name} onChange={handleInputChange} placeholder="Nome" />
            
            <label>Username</label>
            <input type="text" name="username" value={user.username} onChange={handleInputChange} placeholder="Nickname" />
            
            <label>Email</label>
            <input type="email" name="email" value={user.email} onChange={handleInputChange} placeholder="Email" />
            
            <label>Idade</label>
            <input type="number" name="age" value={user.age} onChange={handleInputChange} placeholder="idade" />
            <button style= {addButton}>Registrar</button>

        </form>

    )

}

export default AddUserForm
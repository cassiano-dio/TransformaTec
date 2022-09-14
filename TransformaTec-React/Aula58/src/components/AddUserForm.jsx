import React, {useState} from 'react';


//function AddUserForm(props){}
const AddUserForm = (props) => {

    const initForm = {id: null, name: null, username: null, email: null}
    const [user, setUser] = useState(initForm)
    
    const handleInputChange = (event) => {

        const {name, value} = event.target

        setUser({...user, [name]:value})

    }

    return (
        <form onSubmit={
            (event) =>{

                event.preventDefault()

                if (!user.name || !user.email || !user.username) {
                    return
                }

                props.addUser(user)
                setUser(initForm)

            }
        }>

            <input type="text" name="name" value={user.name} onChange={handleInputChange} placeholder="Nome do usuário" />
            <input type="text" name='username' value={user.username} onChange={handleInputChange} placeholder="Nickname do usuário" />
            <input type="email" name="email" value={user.email} onChange={handleInputChange} placeholder="Email do usuário" />

            <button>Registrar</button>


        </form>
    )

}

export default AddUserForm
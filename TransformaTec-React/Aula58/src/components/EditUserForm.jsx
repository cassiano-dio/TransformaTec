import React, {useState, useEffect} from 'react';

const EditUserForm = (props) => {


    const [user, setUser] = useState(props.currentUser)

    useEffect(
        () =>{
            setUser(props.currentUser)
        },
        [props]
    )

    const handleInputChange = (event) => {

        const {name, value} = event.target

        setUser({...user, [name]:value})
    }

    return (
        <form onSubmit={
            (event) => {
                event.preventDefault()

                props.updateUser(user.id, user)                
            }
        }>

            <input type="text" name="name" value={user.name} onChange={handleInputChange} placeholder="Nome do usuário" />
            <input type="text" name='username' value={user.username} onChange={handleInputChange} placeholder="Nickname do usuário" />
            <input type="email" name="email" value={user.email} onChange={handleInputChange} placeholder="Email do usuário" />
            
            <button>Atualizar</button>

            <button onClick={
                () => {
                    props.setEditing(false)
                }
            }>
                Cancelar
            </button>
        </form>
    )

}

export default EditUserForm


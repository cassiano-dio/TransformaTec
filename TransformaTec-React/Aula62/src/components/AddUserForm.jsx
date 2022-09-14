import React, {useState} from 'react';
import styled from 'styled-components'
import styles from './styles.module.css'

const AddUserForm = (props) => {

    const AddButton = styled.button`
        color: limegreen;
        border-radius: 5px;
        border: transparent
`;

    const formStyle = {
        display: 'flex',
        flexDirection: 'column'
    }

    const initialState = {id:null, name:'', email:''}

    const [user, setUser] = useState(initialState)


    const handleInputChange = (event) => {

        const {name, value} = event.target

        setUser({...user, [name]:value})

    }

    return (
        <form 
            onSubmit={
                (event) => {
                    event.preventDefault()

                    props.addUser(user)
                    setUser(initialState)
                }
            }

            style={formStyle}
        >
            <label>Nome</label>
			<input className={styles.input} type="text" name="name" value={user.name} onChange={handleInputChange} />
            <label>Email</label>
			<input type="text" name="email" value={user.email} onChange={handleInputChange} />
            <AddButton>Registrar</AddButton>

        </form>
    )


}

export default AddUserForm
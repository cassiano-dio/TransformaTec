import React from 'react';
import styled from 'styled-components'
import styles from './styles.scss'

//botão principal
const Button = styled.button`
    margin-left: 10px;
    margin-right: 10px;
    font-size: 18px;
`

//Botão personalizado que herda do botão principal
const EditButton = styled(Button)`

    background-color: lightyellow;

`
//Botão personalizado que herda do botão principal
const RemoveButton = styled(Button)`
    background-color: lightcoral;
    
`


const UsersTable = (props) => (

    

    <table>
        <thead>
            <tr>
                <th>Nome</th>
                <th>Username</th>
                <th>Email</th>
                <th>Idade</th>
                <th>Ações</th>
            </tr>
        </thead>

        <tbody>
            {
                props.users.length > 0 ?(
                    props.users.map(
                        (user) => (
                            <tr key={user.id}>
                                <td>{user.name}</td>
                                <td>{user.username}</td>
                                <td>{user.email}</td>
                                <td>{user.age}</td>
                                <td>
                                    <EditButton
                                        onClick={
                                            () => props.editRow(user)
                                        }
                                    >
                                        Editar
                                    </EditButton>
                                </td>
                                <td>
                                    <RemoveButton
                                        onClick = {
                                            () => props.deleteUser(user.id)
                                        }
                                    >
                                        Excluir
                                    </RemoveButton>
                                </td>
                            </tr>
                        )
                    )
                ):( 
                    <tr>
                        <td colSpan={4}>Lista Vazia</td>
                    </tr>
                )
            }
        </tbody>
    </table>
)

export default UsersTable
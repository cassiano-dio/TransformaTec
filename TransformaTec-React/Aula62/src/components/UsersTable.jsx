import  React from 'react';

const UsersTable = (props) => (
    
    <table>
        <thead>
            <tr>
                <th>Nome</th>
                <th>Email</th>
            </tr>
        </thead>
        <tbody>
            {
                //array de usuarios
                props.users.length > 0 ? (

                    props.users.map(user => (
                        //dados de cada usuário
                        <tr key={user.id}>
                            <td>{user.name}</td>
                            <td>{user.email}</td>
                        </tr>
                    ))

                ):(
                    <tr>
                        <td colSpan={2}>Lista vazia</td>
                    </tr>
                ) 
            }
        </tbody>
    </table>    
    
)

export default UsersTable
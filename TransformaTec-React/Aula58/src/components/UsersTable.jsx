import React from 'react'

const UsersTable = (props) => (

    <table>

        <thead>
            <tr>
                <th>Nome</th>
                <th>Username</th>
                <th>Email</th>
                <th>Ações</th>
            </tr>
        </thead>

        <tbody>

            {
                props.users.length > 0 ?
                (

                    props.users.map(user => (

                        <tr key={user.id}>
                            <td>{user.name}</td>
                            <td>{user.username}</td>
                            <td>{user.email}</td>

                            <button onClick={
                                () => {
                                    props.editRow(user)
                                }
                            }>
                                Editar
                            </button>

                            <button onClick={
                                () => {
                                    props.deleteUser(user.id)
                                }
                            } >
                                Excluir
                            </button>

                        </tr>

                    ))

                ):(
                    <tr>
                        <td colSpan={4}>Lista vazia</td>
                    </tr>
                )
            }
        </tbody>
    </table>

)

export default UsersTable

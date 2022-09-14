import React, {useState} from 'react'

import AddUserForm from './AddUserForm'
import UsersTable from './UsersTable'

export default function Users(){


    const usersData = [
        { id: 1, name: 'Cassiano', email: 'cassiano@dio.com' },
        { id: 2, name: 'Cassio', email: 'cassio@dio.com' },
        { id: 3, name: 'Cassi', email: 'cassi@dio.com' }
    ]

    const initialState = {id: null, name: '', email: ''}

    //propriedade que será renderizada com um array de usuários
    const [users, setUsers] = useState(usersData)

    const addUser = (user) => {
        user.id = users.length + 1
        setUsers([ ...users, user ])
    }

    return(
        <div>
            <h2>
                Cadastro de usuários
            </h2>
            <div>
                <div>
                    <div>
                        <h3>Novo</h3>
                        <AddUserForm addUser={addUser} />
                    </div>
                </div>
                <div>
                    <h3>Lista de usuários</h3>
                    <UsersTable 
                        users={users}
                    
                    />
                </div>
            </div>
        </div>
    )


}
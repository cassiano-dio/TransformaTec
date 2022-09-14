import React, {useState} from 'react'

export default function TodoForm ({addTodo}){

    const [value, setValue] = useState("")

    const handleSubmit = (event) => {

        event.preventDefault()
        
        if(!value)
            return
        
        addTodo(value)
        setValue("")    

    }

    return (
        <form onSubmit={handleSubmit}>

            <input 
                type="text" 
                className="input"
                value={value}
                onChange={
                    (e) => {
                        setValue(e.target.value)
                    }
                }
            />

            <button>Enviar</button>

        </form>
    )

}
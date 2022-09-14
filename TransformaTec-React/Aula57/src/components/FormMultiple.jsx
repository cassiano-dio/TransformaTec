import {useState} from 'react'

export default function FormMultiple(){

    const [inputs, setInputs] = useState({})

    const handleChange = (event) => {

        //nome do campo de entrada
        const name = event.target.name

        //valor do campo de entrada
        const value = event.target.value

        setInputs( (values) => ({
                ...values, [name]:value
            })
        )

    }

    const handleSubmit = (event) => {
        event.preventDefault()

        alert(JSON.stringify(inputs))
    }

    return (
        <div className='form_div'>
            <h3>Formulário</h3>
            <form onSubmit={handleSubmit}>
                <input 
                    type="text" 
                    name='username' 
                    value={inputs.username || ""} 
                    placeholder="Username"
                    onChange={handleChange}
                />
                <input 
                    type="number" 
                    name='age' 
                    value={inputs.age || ""} 
                    placeholder="Idade"
                    onChange={handleChange}
                />
                <textarea 
                    name="description"  
                    cols="30" 
                    rows="10" 
                    onChange={handleChange} 
                    placeholder="Descrição">
                </textarea>
                <input type="submit" name="submit" value="Enviar" />
            </form> 
            <p>Nome: {inputs.username}</p>
            <p>Descrição:{inputs.description} </p>
            <p>Idade: {inputs.age}</p>
        </div>
    )

}
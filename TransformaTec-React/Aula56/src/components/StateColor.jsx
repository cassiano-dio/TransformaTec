import {useState} from 'react'

export default function StateColor (props){


    const [color, setColor] = useState("vermelho")
    const [nome, setNome] = useState("Cassiano")

    return(
        <div>
            <p> Minha cor favorita é: {color}</p>
            <p> Meu nome é: {nome}</p>
            <button type="button" onClick={
                () => setColor(props.color)
            }>Alterar Cor</button>
        </div>
    )
}
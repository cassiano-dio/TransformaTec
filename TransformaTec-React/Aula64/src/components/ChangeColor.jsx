import {useState} from 'react'

export default function ChangeColor(){


    //Define o estado inicial
    const [color, setColor] = useState("Azul")

    //Isto está errado
    //color = "Amarelo"

    return(
        <div>
            <h3>
                Minha cor favorita é {color}
            </h3>
            <button
                //Atualiza o estado com a nova cor a cada clique do botão
                onClick={
                    () => {
                        setColor("Vermelho")
                    }
                }
            >
                Mudar cor
            </button>
        </div>
    )

}
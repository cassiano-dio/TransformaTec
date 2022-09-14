import {useState, useEffect, useRef} from 'react'

export default function UseRef(){


    const [myValue, setMyValue] = useState("")
    const count = useRef(0)

    useEffect(
        () => {
            count.current = count.current + 1
        }
    )

    return (
        <div>
            <h1> Exemplo de UseRef</h1>
            <input 
                type="text"
                value={myValue}
                onChange={
                    (event) => setMyValue(event.target.value)
                }
            />
            <p>
                Quantidade de renderizações: {count.current}
            </p>
        </div>
    )


}
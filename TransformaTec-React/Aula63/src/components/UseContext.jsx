import {useState, useEffect,useContext, createContext} from 'react'


const UserNameContext = createContext()

export default function PrimeiroComponente(){


    const [userName, setUserName] = useState('Cassiano')

    return (
        <div style={{border: '1px solid'}}>
            <UserNameContext.Provider value={userName} >

                <h3>Exemplo de UseContext</h3>
                <p>Primeiro componente</p>
                <p>{`Olá ${userName}`}</p>

                <SegundoComponente userName = {userName}/>

            </UserNameContext.Provider>
        </div>
        
    )


}

function SegundoComponente (){
    return (
        <div style={{border: '1px solid'}}>
            <p>Segundo componente</p>

            <TerceiroComponente />
        </div>
    )
}
function TerceiroComponente (){
    return (
        <div style={{border: '1px solid'}}>
            <p>Terceiro  componente</p>

            <QuartoComponente />
        </div>
    )
}
function QuartoComponente (){

    const userName = useContext(UserNameContext)

    return (
        <div style={{border: '1px solid'}}>
            <p>Quarto componente</p>
            <p>{`Olá  ${userName} no quarto componente`}</p>
            <QuintoComponente />
        </div>
    )
}
function QuintoComponente (){
    return (
        <div style={{border: '1px solid'}}>
            <p>Quinto componente</p>

            <SextoComponente />
        </div>
    )
}

function SextoComponente (){
    const userName = useContext(UserNameContext)
    return(

        <div style={{border: '1px solid'}}>
            <p>Sexto componente</p>
            <p>{`Olá novamente ${userName}`}</p>
        </div>
    )
}
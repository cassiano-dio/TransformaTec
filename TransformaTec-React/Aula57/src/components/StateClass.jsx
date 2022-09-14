import React from 'react'

export default class StateClass extends React.Component {

    constructor(){
        super()
        this.state = {
            numero: 10
        }
    }

    somar(){
        let soma = this.state.numero + 15
        this.state.numero = soma
        console.log(soma)
        this.setState({numero: soma})
    }

    render() {
        return(
            <div>
                <h1>Componente de classe</h1>
                <h1> Numero Atual: {this.state.numero} </h1>
                <button onClick={
                    () => this.somar()
                }>
                    Somar
                </button>
            </div>
        )
    }
}
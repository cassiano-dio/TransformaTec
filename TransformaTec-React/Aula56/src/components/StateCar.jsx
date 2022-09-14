import React from 'react';

export default class StateCar extends React.Component {

    constructor(props) {
        super(props);
        this.modelo = "Fusca"
        this.state = {
            ligado: false,
            velocidade: 0
        }

    }
    ligarDesligar(){
        this.setState({ligado: !this.state.ligado})
    }
    acelerar(){
        let vel = this.state.velocidade + 5
        this.setState({velocidade: vel})
    }
    frear(){
        let vel = this.state.velocidade - 2
        this.setState({velocidade: vel})
    }
    parar(){
        //this.state.velocidade = 0
        console.log("V: ", this.state.velocidade)
        //this.setState({velocidade: 0})
    }
    render(){
        return(
            <div>

                <p>Carro: {this.modelo}</p>

                <p>Ligado: {this.state.ligado ? "Sim" : "Não"}</p>

                <p>Velocidade: {this.state.velocidade}</p>

                <button onClick={() => this.ligarDesligar()}>Girar Chave</button>

                <button onClick={() => this.acelerar()}>Acelerar</button>

                <button onClick={() => this.frear()}>Frear</button>
                
                <button onClick={() => this.parar()}>Parar</button>
            </div>
        )
    }

}
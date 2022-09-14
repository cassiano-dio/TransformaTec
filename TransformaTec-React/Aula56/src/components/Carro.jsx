import React from 'react';

export default class Carro extends React.Component {

    constructor(props) {
        super(props);
        this.modelo = "Marea"

        this.state = {
            ligado: false,
            explodiu : false,
            velocidade: 0
        }
    }

    ligaDesliga(){

        this.setState({ligado: !this.state.ligado})

        if(!this.state.ligado){
            this.setState({velocidade: 0})
        }
    }

    acelerar(){
        
        let velo = this.state.velocidade + 10
        this.setState({velocidade: velo})

        this.state.velocidade = velo
        console.log("velocidade", this.state.velocidade)

        if (this.state.velocidade > 190){
            this.setState({explodiu: true})
        }
    }

    frear(){
        let velo = this.state.velocidade - 10
        this.setState({velocidade: velo})
    }

    parar(){
        this.setState({velocidade: 0})
    }

    render() {
        return(
            <div>
                <h4>
                    Carro bomba: {this.modelo}
                </h4>

                <h4>
                    Ligado: {this.state.ligado ? "Sim" : "Não"}
                </h4>

                <h4>
                    Explodiu: {this.state.explodiu ? "BOOOOOOOOOOM" : "Não"}
                </h4>
                <h4>
                    Velocidade: {this.state.velocidade}
                </h4>

                <button onClick={
                    () => this.ligaDesliga()
                }>
                    Girar Chave
                </button>

                <button onClick={
                    () => this.acelerar()
                }>
                    Acelerar
                </button>
                
                <button onClick={
                    () => this.frear()
                }>
                    Frear
                </button>

                <button onClick={
                    () => this.parar()
                }>
                    Parar
                </button>

            </div>
        )
    }

}
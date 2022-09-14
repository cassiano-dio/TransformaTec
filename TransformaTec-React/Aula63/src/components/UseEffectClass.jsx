import React from 'react';

export default class UseEffectClass extends React.Component {
    constructor(props) {
        super(props);

        this.state = {
            clicks: 0
        }
    }
    //método de ciclo de vida do componente que atualiza apenas na primeira renderização do componente
    componentDidMount(){
        document.title = `Quantidade de cliques: ${this.state.clicks}`
    }
    //método de ciclo de vida do componente que atualiza em todas as renderizações do componente
    componentDidUpdate(){
        document.title = `Quantidade de cliques: ${this.state.clicks}`
    }
    render() {
        return(
            <div>
                <h3>UseEffect em Classe</h3>
                <p>Quantidade de cliques: {this.state.clicks} </p>
                <button onClick={
                    //Atualizando o estado da variável clicks
                    () => this.setState({clicks: this.state.clicks + 1})
                }>
                    Clique aqui!
                </button>
            </div>
        )
    }
}
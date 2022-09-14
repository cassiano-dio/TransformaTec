import React from 'react';

export default class UseStateClass extends React.Component{

    constructor(props){

        super(props);

        //Inciando o estado de uma variável
        this.state = {
            clicks: 10
        }

    }

    render() {
        return (
            <div>
                <h3>Componente de classe</h3>
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
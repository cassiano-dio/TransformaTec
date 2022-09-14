import React from 'react';

export default class Avaliacao extends React.Component {

    constructor(props) {
        super(props);

        this.state = {
            tema:"",
            questoes:0,
            tempoTotal:0,
            peso: 0
        }

        this.atualizar = this.atualizar.bind(this)
    }

    atualizar(){
        this.setState({
            tema: this.props.tema,
            questoes: this.props.questoes,
            tempoTotal: this.props.tempoTotal,
            peso: this.props.peso
        })
    }

    render(){
        return (
            <div>
                <h4>Tema: {this.state.tema}</h4>
                <h4>Número de questões: {this.state.questoes}</h4>
                <h4>Tempo total da avaliação (minutos): {this.state.tempoTotal}</h4>
                <h4>Peso na média final: {this.state.peso}</h4>

                <button onClick={this.atualizar}>Atualizar avaliação</button>
            </div>
        )
    }

}
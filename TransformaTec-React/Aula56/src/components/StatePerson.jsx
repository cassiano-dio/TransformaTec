import React from 'react';

export default class StatePerson extends React.Component {

    constructor(props) {
        super(props);

        this.state = {
            nome:"Jose",
            profissao:"Marceneiro",
            idade: 40,
        }

        this.atualizarPessoa = this.atualizarPessoa.bind(this)
    }

    atualizarPessoa(){
        this.setState({
            nome:this.props.nome,
            profissao:this.props.profissao,
            idade:this.props.idade
        })
    }

    render(){
        return (
            <div>
                <p>Nome: {this.state.nome}</p>
                <p>Profissão: {this.state.profissao}</p>
                <p>Idade: {this.state.idade}</p>
                <button onClick={this.atualizarPessoa}>Atualizar</button>
            </div>
        )
    }

}
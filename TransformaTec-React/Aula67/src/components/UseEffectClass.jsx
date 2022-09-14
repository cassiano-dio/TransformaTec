import React from 'react';

export default class UseEffectClass extends React.Component {

    constructor(props) {
        super(props);
        this.state = {
            count : 0
        }
    }

    //primeira renderização
    componentDidMount(){
        document.title = `Cliques: ${this.state.count}`
    }

    // renderiza todas vez que um estado é atualizado
    componentDidUpdate(){
        document.title = `Cliques: ${this.state.count}`
    }

    render() {
        return (
            <div>
            <p>Cliques {this.state.count}</p>
            <button onClick={() => this.setState({ count: this.state.count + 1 })}>
                Clique aqui amigo!
            </button>
            </div>
        );
    }
}
import {Component} from 'react'

export default class UseStateClass extends Component {

    constructor(props) {
        super(props)
        this.state = {
            count : 0
        }
    }

    render() {
        return (
            <div>
                <h4>SetState em componente de Classe</h4>
                <p>Quantidade de cliques: {this.state.count}</p>
                <button
                    onClick={
                        () => this.setState({count: this.state.count + 1})
                    }
                >
                    Clique aqui amigo!
                </button>
            </div>
        )
    }
}
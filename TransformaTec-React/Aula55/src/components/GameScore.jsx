import React from 'react'

class GameScore extends React.Component {

    constructor(props) {
        super(props)

        this.state = {
            points:this.props.points
        }
    }

    componentDidMount() {
        alert(JSON.stringify(this.state))
    }

    componentDidUpdate(){
        alert("Pontos: " + JSON.stringify(this.state))
    }

    updatePoints() {
        this.setState({points: this.state.points + 1})
    }

    render(){
        return(
            <div>
                <button onClick={() => this.updatePoints()}>Registrar Ponto</button>
                Pontos: {this.state.points}
            </div>
        )
    }

}

export default GameScore
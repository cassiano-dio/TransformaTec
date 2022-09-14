import React from 'react';

export default class Relogio extends React.Component {

    constructor() {
        super()
        this.state ={
            hora: new Date()
        }
    }

    componentDidMount(){
        this.timer = setInterval(
            () => this.tickTack(),
            1000);
    }

    tickTack(){
        this.setState({hora: new Date()})
    }

    render(){
        return(
            <div className="relogio">
                <h2>
                    Hora atual: {this.state.hora.toLocaleTimeString()}
                </h2>
                <h2>
                    Data: {this.state.hora.toLocaleDateString()}
                </h2>
            </div>
        )
            
    }

}
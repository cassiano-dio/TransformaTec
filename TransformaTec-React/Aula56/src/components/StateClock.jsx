import '../App.css';
import React from 'react';

class StateClock extends React.Component {

    constructor(props) {
        super(props);
        this.state = {
            time: new Date()
        }
    }

    tickTack(){

        this.setState({
            time: new Date()
        })

    }

    componentDidMount(){
        this.timer = setInterval(
            () => this.tickTack(),
            1000
        )
    }

    render() {
        return(
            <h2>
                {this.state.time.toLocaleTimeString()}
            </h2>
        )
    }
}

export default StateClock;
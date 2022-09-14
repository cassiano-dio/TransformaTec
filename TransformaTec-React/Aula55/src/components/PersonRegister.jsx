import React from 'react'

class PersonRegister extends React.Component {

    constructor(props) {
        super(props)

        this.state = {
            name:this.props.name,
            age:this.props.age,
            lastName:this.props.lastName,
            job:this.props.job
        }
    }


    render(){
        return (
            <div>
                <p>Nome: {this.state.name}</p>
                <p>Idade: {this.state.age}</p>
                <p>Sobrenome: {this.state.lastName}</p>
                <p>Cargo: {this.state.job}</p>
            </div>
        )
    }
}

export default PersonRegister
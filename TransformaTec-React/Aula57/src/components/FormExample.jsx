import React from 'react';

export default class FormExample extends React.Component {

    constructor(props) {
        super(props);
        this.state = {
            email:''
        }

        this.handleInputChange = this.handleInputChange.bind(this)
        this.handleSubmit = this.handleSubmit.bind(this)

    }

    handleSubmit(event){

        event.preventDefault()

        console.log(this.state.email)

    }

    handleInputChange(event){

        return this.setState({
            email: event.target.value
        })

    }

    render() {
        return(
            <div>
                <h1>Exemplo de formulário</h1>
                <form onSubmit={this.handleSubmit}>
                    <input type="text" placeholder='Email' onChange={this.handleInputChange}/>
                    <button>Enviar</button>
                </form>
                <h3>Email: {this.state.email}</h3>
            </div>
        )
    }


}
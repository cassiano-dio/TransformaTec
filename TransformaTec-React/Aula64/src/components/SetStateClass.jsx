import React from 'react'

export default class SetStateClass extends React.Component {

    //Atualizando objeto em componente de classe (merge)
    constructor(props){
        super(props)
        this.state = {
            name: 'Cassiano',
            age:32
        }
    }

    render() {
        return (
            <div>
                <button
                    onClick={
                        () => this.setState({ name: 'Cassiano Ricardo'})
                    }
                >
                    Atualizar nome
                </button>
                {JSON.stringify(this.state)}
            </div>
        )
    }

}
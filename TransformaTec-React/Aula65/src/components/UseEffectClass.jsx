import React from 'react'

export default class UseEffectClass extends React.Component {

    constructor(props) {
        super(props)

        this.state = {
            clicks : 0
        }
    }

    //Primeira renderização
    componentDidMount(){
        document.title = `Clicks: ${this.state.clicks}`
    }

    //Renderizações de atualização de estado
    componentDidUpdate(){
        document.title = `Clicks: ${this.state.clicks}`
    }

    //Renderização na destruição do componente
    componentWillUnmount(){
        setTimeout(
            () => {
                console.log("Destruindo")
            }, 3000
        )
        
        console.log("Destruido")
    }

    render(){
        return (
            <div>
                <h3>UseEffect em Classe</h3>
                <p>Clicks: {this.state.clicks}</p>
                <button
                    onClick={
                        () => this.setState({clicks:this.state.clicks + 1})
                    }
                >
                    Clique aqui
                </button>
            </div>    
        )
    }


}
import React from "react";

export default class BaseClasse extends React.Component{
    constructor(props){
        //Para permitir o uso de props
        super(props)
        
        //state
        this.state={
            canal:'CFB Cursos',
            curso:'React',
            ativo:true,
            nome:this.props.nomeAluno
        }
        this.status=this.props.status
        
        //bindagem
        this.ad = this.ativarDesativar.bind(this)

        //Instruções do construtor
    }

    //Função para manipular state
    ativarDesativar(){
        this.setState(
            state=>({
                ativo : !state.ativo
            })
        )
        console.log(this.state)
    }

    componentDidMount(){
        console.log('O componente foi criado')
    }

    componentDidUpdate(){
        console.log('O componente foi atualizado')
    }

    componentWillUnmount(){
        console.log('O componente foi removido')
    }

    render(){
        return(
            <>
                <h1>Componente de Classe</h1>
                <button onClick={this.ad}>Ativar Desativar</button>
                <button onClick={()=>this.ativarDesativar()}>Ativar Desativar</button>
            </>
        )
    }
}
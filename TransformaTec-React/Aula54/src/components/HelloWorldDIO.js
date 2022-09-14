import HelloDev from './HelloDev';

// Declarando o componente de função
function HelloWorldDIO(){

    //Retornando um componente HTML
    return (

        //Componente HTML que será renderizado no browser
        <div>
            <HelloDev />
            <p>Salve galera da DIO! tudo beleza?</p>
        </div>

    )

}

//Exportar o componente Hello WorldDIO para ser consumido em outros componentes ou paginas
export default HelloWorldDIO
//variavel de escopo global let
let nome = "Cassiano";

console.log(nome)

//não pode ser redeclarada
//var nome = "Ricardo"

const sobreNome = function()
{

    //variável de escopo de função
    let nome = " Peres";

    console.log(nome);

    return nome;

}

const nomeDoMeio = function()
{

    //variável de escopo de função
    let nome = " Ricardo de Oliveira ";

    console.log(nome);

    return nome;

}

let sobre = sobreNome()
let meio = nomeDoMeio()

//valor (nome) da variável atualizado
nome = nome + meio + sobre

console.log(nome)
//declarando um objeto na notação JSON
var pessoa = {
    //propriedade : valor
    "nome" : "Cassiano",
    "idade" : 32
}

//obtendo dados do JSON

console.log("Dados da pessoa: ", pessoa)

//obtendo uma proriedade do objeto pessoa
var idade = pessoa.idade;

console.log("Idade da pessoa:", idade)

pessoa.nome = "José"

console.log("Novo nome da pessoa:", pessoa.nome)

var pessoa = '{"nome":"Joao","idade":65}'

console.log("Tipo da variável ANTES do parse: ",typeof(pessoa))

var idade = pessoa.idade

console.log("Idade ANTES do parse: ", idade)

var pessoa_obj = JSON.parse(pessoa)

console.log("Tipo da variável DEPOIS do parse: ",typeof(pessoa_obj))

var idade = pessoa_obj.idade

console.log("Idade DEPOIS do parse: ", idade)
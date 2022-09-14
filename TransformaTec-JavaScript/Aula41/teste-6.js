var pessoa = {
    "nome":"José",
    "idade": 54
}

console.log("Tipo ANTES do stringify:", typeof(pessoa))

var pessoa_str = JSON.stringify(pessoa)

console.log("Tipo DEPOIS do stringify:", typeof(pessoa_str))
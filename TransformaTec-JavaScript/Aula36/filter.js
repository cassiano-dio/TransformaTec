let numeros = [ 1,2,4,5]
// filtra e retorna um resultado de acordo com a condição, varrendo todos os itens contidos no vetor.
// Cria uma variável "numero" para cada item dentro do vetor "numeros"
let result = numeros.filter(
    function (numero){
        return numero>3
    }
)
console.log(result)
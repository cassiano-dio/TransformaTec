//variavel i de escopo global
let i = 20;

let soma = 0;

let result = 0;

//variavel i de escopo de bloco
for(let i = 0; i < 10; i++ ){

    console.log("Variável 'i' de escopo de bloco: ",i)

    //variável de escopo global é vista e atualizada dentro do bloco
    soma = soma + i

}

//variável de escopo de bloco não pode ser chamada como variável global
//console.log("i: ",i)
console.log("Resultado da soma: ",soma)
let x = 100
//tenta executar uma função
try {
    
    //se a condição é válida, então executa 
    if(x < 30){
        console.log("O número é válido.")
    
    //se a condição é inválida, lança um erro com mensagem personalizada
    }else{
        //erro do tipo objeto com atributos "name" e "message" personalizados
        // throw {
        //     "name":"ErroNumeroInvalido",
        //     "message":"O número é inválido"
        // }

        throw "Numero invalido"
    }

//captura o erro e trata
} catch (error) {
    console.log(error.name)
    console.log(error.message)
}
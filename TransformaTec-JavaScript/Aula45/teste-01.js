const promessa = new Promise(
    (resolve) => {
        let a = 2
        let b = 3

        resolve( a * b)
    }
)

promessa.then(
    resultado => {
        console.log("Resultado da promessa: ", resultado)
        return resultado
    }
).then(
    resultado => {
        console.log("Resultado da promessa + 2: ", (resultado + 2))
        return resultado + 2
    }
).then(
    resultado => {
        console.log("Resultado da promessa: + 3: ", (resultado + 3))
        return resultado + 3
    }
).then(
    resultado => {
        console.log("Resultado da promessa: + 4: ", (resultado + 4))
        return resultado + 4
    }
).then(
    resultado => {
        console.log("Resultado da promessa: + 5: ", (resultado + 5))
        return resultado + 5
    }
).catch(
    erro => {
        console.log("Erro ao executar a promessa. Descrição do erro:\n" + erro)
    }
)
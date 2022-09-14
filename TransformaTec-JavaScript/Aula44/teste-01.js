//criando um novo objeto da classe Promise e colocando o objeto na variável "promessa" para tratar o fluxo de resposta
const promessa = new Promise((resolve, rejeita) => {

    let a = 2 + 5

    setTimeout(
        () => resolve(a),
        3000
    )
})

// then / catch
promessa
.then(
    soma => {
        console.log("SOMA:", soma)
    }
)


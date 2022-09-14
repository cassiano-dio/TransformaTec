//criando um novo objeto da classe Promise e colocando o objeto na variável "promessa" para tratar o fluxo de resposta
const promessa = new Promise((resolve, rejeita) => {
    let a = 2 + 3
    let b = 2 * 3
    let c = 2**3
    // criando um objeto de resultado
    const result = {
        "a":a,
        "b":b,
        "c":c
    }
    setTimeout(
        () => resolve(result),
        3000
    )
})
// then / catch
promessa
.then(
    (res) => {
        console.log(res.b)
    }
).catch(
    erro => {
        console.log("Erro! \n", erro)
    }
)


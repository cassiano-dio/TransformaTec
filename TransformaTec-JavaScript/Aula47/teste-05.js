async function criaPromessa(){

    return new Promise(
        (resolve) => {
            let a = 50
            let b = 100

            console.log("Resultado da promessa: ", a + b)

            resolve(a+b)
        }
    )
}

const dobro = async function(){

    const valor = await criaPromessa()

    setTimeout(
        function (){
            console.log("Resultado do dobro da promessa: ", valor * 2)
        },
        4000
    )

    await triplo()
}

const triplo = async () => {

    const valor = await criaPromessa()

    console.log("Resultado do triplo da promessa: ", valor *3)

    daumDelay()

}

const daumDelay = async () => {

    setTimeout(
        function (){
            console.log("Mensagem do daumDelay")
        },
        4000
    )

}

dobro()
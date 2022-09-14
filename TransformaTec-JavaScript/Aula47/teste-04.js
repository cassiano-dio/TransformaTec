new Promise(
    function(resolve){
        let a = 50;
        let b = 60;

        //resolve a função
        resolve(a + b)
    }
).then(
    function(res){
        console.log("Resultado: ",res)
        return res
    }
).then(
    function(res){
        console.log("Resultado * 2: ",res * 2)
        return res
    }
).then(
    function(res){
        console.log("Resultado * 3: ",res * 3)
    }
).catch(
    (erro) => {
        console.log("Erro:",erro)
    }
).finally(
    console.log("Finaliza a execução")
)
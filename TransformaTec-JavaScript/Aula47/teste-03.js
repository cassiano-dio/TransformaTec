new Promise(
    function(resolve){
        let a = 50;
        let b = 60;

        //forçando um erro na promisse (variável "c" não foi declarada)
        //resolve(a + c)

        //resolve a função
        resolve(a + b)
    }
).then(
    function(res){
        console.log("Resultado: ",res)
    }
).catch(
    (erro) => {
        console.log("Erro:",erro)
    }
).finally(
    console.log("Finaliza a execução")
)
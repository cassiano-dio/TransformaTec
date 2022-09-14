//teste de chamada assíncrona

console.log(1)
console.log(2)
console.log(3)
//forçar um delay com a função assíncrona setTimeout()
setTimeout(
    function (){
        console.log(4)
    },
    4000
)
console.log(5)
console.log(6)
console.log(7)
console.log(8)
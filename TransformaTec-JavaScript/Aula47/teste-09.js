class ErroLogin extends Error {

    constructor(name, message){

        super(message)

        this.name = name
    }
}

try {
    
    let email = "cassiano@dio.me"
    let senha = "123456"

    let emailSistema = "cassiano@dio.me"
    let senhaDoSistema = "123456"

    if (senha == senhaDoSistema && email == emailSistema) {
        
        console.log("Acesso autorizado")

    } else {
        
        let erroLogin = new ErroLogin("ErroLogin","Credenciais do usuário estão incorretas!")

        throw erroLogin
    }


} catch (erro) {
    
    console.log(erro.name)
    console.log(erro.message)
}
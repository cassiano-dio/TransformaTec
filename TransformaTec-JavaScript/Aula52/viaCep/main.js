const cep = document.getElementById("cep")
const pesquisar = document.getElementById("pesquisar")
const limpar = document.getElementById("limpar")




const validarCep = async (cep) =>{

    return cep.length == 8 && /^[0-9]+$/.test(cep)
}

const pesquisarCep = async () => {
    
    

    const cep_valor = cep.value

    try {

        if (await validarCep(cep_valor)) {
            
            const viacep_url = `https://viacep.com.br/ws/${cep_valor}/json`

            console.log("VIACEP URL: ", viacep_url)

            const cep_dados = await fetch(viacep_url)
            const cep_json = await cep_dados.json()

            console.log("DADOS DO CEP: ", cep_json)

            if(cep_json.hasOwnProperty('erro')){

                throw{
                    "name":"ErroCEP",
                    "message":"Não foi possível encontrar o CEP informado"
                }

            }else{
                await preencherDados(cep_json)
            }

        } else {
            throw{
                "name":"ErroCEP",
                "message":"CEP informado inválido"
            }
        }
        
    } catch (erro) {
        
        const erro_cep = document.createElement("p")
        erro_cep.setAttribute("id","erro_cep")
        erro_cep.setAttribute("class","erro_cep")
        erro_cep.innerHTML = erro.message

        document.body.appendChild(erro_cep)
    }


}

const preencherDados = async (endereco) => {

    const div_resposta = document.createElement("div")
    div_resposta.setAttribute("id", "div_resposta")
    div_resposta.setAttribute("class","container")

    const logradouro = document.createElement("p")
    logradouro.setAttribute("class","resposta")
    logradouro.setAttribute("id","logradouro")
    logradouro.innerHTML = endereco.logradouro

    const bairro = document.createElement("p")
    bairro.setAttribute("id","bairro")
    bairro.setAttribute("class", "resposta")
    bairro.innerHTML = endereco.bairro

    const localidade = document.createElement("p")
    localidade.setAttribute("id","localidade")
    localidade.setAttribute("class", "resposta")
    localidade.innerHTML  = endereco.localidade

    div_resposta.appendChild(logradouro)
    div_resposta.appendChild(bairro)
    div_resposta.appendChild(localidade)

    document.body.appendChild(div_resposta)

}

const limparDados = async () => {

    const div_resposta = document.getElementById("div_resposta")

    const erro = document.getElementById("erro_cep")

    cep.value = ""

    if (div_resposta) {
        document.body.removeChild(div_resposta)
    }else if (erro){
        document.body.removeChild(erro)
    }
}

pesquisar.addEventListener('click',pesquisarCep)
limpar.addEventListener('click', limparDados)
cep.addEventListener('focus',limparDados)
# Desafio de projeto


## Criar o seu primeiro repositório no GitHub

## Instalando o Git na sua máquina (Windows)

- Acessar o site do [Git](https://git-scm.com/download/win)
- Baixar o pacote de acordo com a sua arquitetura de sistema
- Após o download, seguir os passos clicando ```Next```

## Instalando o Git na sua máquina (Linux)

- Acessar o site do [Git](https://git-scm.com/download/linux)
- Seguir as intruções para instalação de acordo com a sua distribuição Linux

### Criando uma conta no GitHub

- Acessar o site do [GitHub](https://github.com/)
- Informar um email válido

### Criando um repositório no GitHub

- Acessar a sua conta no link de [Login](https://github.com/login)
- No seu perfil, acessar ```Repositories``` -> ```New```
- Inserir um nome, neste caso, ```desafio_de_projeto_01```
- Inserir uma descrição (opcional, mas muito útil)
- Manter o repositório como público
- Clicar em ```Create repository```

### Configurando um token de acesso pessoal para acesso ao GitHub

- Acessar o seu perfil -> Settings -> Developer Settings -> Personal Access Tokens
- New personal access token
- Inserir uma nota para o token
- Selecionar escopo Repo
- Copiar e salvar o token em um arquivo no seu computador (esse é o único momento onde o token será apresentado)
- Testar:
  - Clonar um repositório privado via HTTPS
  - Ao abrir a tela do GitHub, inserir o personal token

### Configurando uma chave SSH para acesso remoto ao GitHub

- Login na sua conta do GitHub -> Clicar no ícone do perfil -> Settings -> SSH and GPG Keys -> New SSH Key
- Acessar o Git Bash:
  - ```ssh-keygen -t ed25519 -C [seu_email_do_github]``` -> Enter
  - Inserir uma senha -> Repetir a senha
  - Verificar as chaves pública e privada criadas
  - Acessar a pasta onde se encontra as chaves ```cd /caminho/da/pasta```
  - Acessar o conteúdo da chave pública ```cat id_ed25519.pub```
  - Copiar o conteúdo
- No site do GitHub:
  -  Informar um nome para a chave em ```Title```
  -  Inserir o conteúdo em ```Key```
  -  Clicar em Add SSH Key e informar a sua senha quando solicitado
-  No Git Bash:
  - Inicialiar o SSH Agent: ```eval $(ssh-agent -s)```
  - Informar a chave privada ao SSH Agent ```ssh-add id_ed25519```
  - Informar a senha da sua chave SSH
  - Enter 
- Testar
  - Clonar um repositório privado via SSH 

### Criando repositório local

- Criar uma pasta para o projeto: ``` mkdir desafio_de_projeto-01```
- Acessar a pasta criada: ```cd desafio_de_projeto_01```
- Iniciar o repositório: ```git init```
- Adicionar o repositório de origem: ```git remote add origin https://github.com/cassiano-dio/desafio_de_projeto_01.git```
- Criar um arquivo chamado ```README.md```
- Inserir um título com a seguinte sintaxe:
```### Primeiro desafio de projeto```
- Criar uma pasta com o comando ```mkdir exercicios```
- Inserir os arquivos dos exercícios desenvolvidos nos módulos e semanas anteriores
- Realizar o primeiro commit: ```git commit -m "Meu primeiro commit"```
- Selecionar o branch "main": ```git branch -M main```
- Enviar alterações para o repositório remoto: ```git push -u origin master```


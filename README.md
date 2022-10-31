# DIM0547-DevWebII-ProjetoII

Projeto da segunda unidade da disciplina de Desenvolvimento de Sistemas Web II da UFRN

# Inicializando o banco de dados através do Docker
Para iniciar o ambiente com o Banco de Dados, primeiro é necessário instalar o Docker:
- https://docs.docker.com/engine/install/ubuntu/

Depois de instalado, é necessários realizar configurações pós-instalação:
- https://docs.docker.com/engine/install/linux-postinstall/#manage-docker-as-a-non-root-user

Somente o tópico que consiste de "Manage Docker as a non root user".

Após instalado e configurado o Docker, basta executar, na raiz do projeto: `docker compose -f "docker-compose.yml" up -d --build`


# Modelo ER

> 'Prova' possui varias 'Questao' 

> 'Questao' possui varias 'Alternativas'
> 'Questao' possui uma'Categoria'  

> 'Alternativa' possui varias 'Questao'  

> 'Usuario' possui um ou varias 'ListaDeEstudos'  

> 'ListaDeEstudos' possui varias 'Questoes'


# Funcionalidades

> Usuário pode criar 'Prova' e adicionar 'Questao'.

> Usuário pode criar 'Questao' e criar 'Alternativa' para a questão.

> Usuário pode criar 'ListaDeEstudos' e adicionar 'Questao' a Lista.
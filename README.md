# PassValidateApi

### Tópicos 

- [Descrição do projeto](#descrição-do-projeto)

- [Funcionalidades](#funcionalidades)

- [Aplicação](#aplicação)

- [Ferramentas utilizadas](#ferramentas-utilizadas)

- [Acesso ao projeto](#acesso-ao-projeto)

- [Abrir e rodar o projeto](#abrir-e-rodar-o-projeto)

- [Processo de desenvolvimento](#processo-de-desenvolvimento)


## Descrição do projeto 

<p align="justify">
 Projeto em desenvolvimento para o desafio do Itau Unibanco.

 A aplicação consiste em um serviço que informará se a senha digitada é verdadeira ou falsa.  .

## Funcionalidades

:pass_validate: `Funcionalidade 1:` Realizar validação de senha.

###

## Ferramentas utilizadas

<a href="https://www.java.com" target="_blank"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40" height="40"/> </a> 

<a href="https://spring.io/tools" target="_blank"> <img src="https://spring.io/images/spring-logo-9146a4d3298760c2e7e49595184e1975.svg" alt="springTools" width="40" height="40"/> </a> 

###

## Acesso ao projeto

Você pode [acessar o código fonte do projeto](https://github.com/CamilaLdnaCunha/challengeApi.git) ou [baixá-lo](https://github.com/CamilaLdnaCunha/challengeApi/archive/refs/heads/master.zip).

## Abrir e rodar o projeto

Após baixar o projeto, você pode abrir com o `Spring Tools Suite 4`. Para isso, na tela de launcher clique em:

- `File -> Import -> Mavem -> Existing Maven Projects`;
- Procure o local onde o projeto está e o selecione;
- Depois que ele aparecer o arquivo `pom` na tela, basta clicar em `Finish`.
- Espere o `Spring Tools Suite 4` finalizar a configuração do projeto;
- Para executar a aplicação, clique com o botão direito sobre o nome do projeto e selecione as opções `Rum As -> Spring Boot App` e aguarde o serviço iniciar. 

Para o teste da aplicação, é recomendado a utilização da ferramenta Postman(https://www.postman.com/);

- Abra o Postman e crie uma nova requisição;
- Selecione o metodo `GET` e informe a seguinyte URL para o request: `http://localhost:8080/challenge/AbTp!9foA1`;
- Clique em `Send`;

Na URL informada, o valor `AbTp!9foA1` corresponde a senha que será verificada. Neste caso, o valor do retorno será `falso` pois não é permitido a repetição de caracteres.

`
{
    "validate": false
}
`

## Regras de validação

Considere uma senha sendo válida quando a mesma possuir as seguintes definições:

- Nove ou mais caracteres;
- Ao menos `1` dígito;
- Ao menos `1` letra minúscula;
- Ao menos `1` letra maiúscula;
- Ao menos `1` caractere especial;
- Considere como especial os seguintes caracteres: `!@#$%^&*()-+`;
- Não possuir caracteres repetidos dentro do conjunto;
- Não aceita caracteres com acento(validação adicional);

## Exemplo:  

service.passValidate("") returm `false`  
service.passValidate("aa") returm `false`  
service.passValidate("ab") returm `false`  
service.passValidate("AAAbbbCc") returm `false`  
service.passValidate("AbTp9!foo") returm `false`  
service.passValidate("AbTp9!foA") returm `false`
service.passValidate("AbTp9 fok") returm `false`
service.passValidate("AbTp9!fok") returm `false`
service.passValidate("AbTp9!Çfok") returm `false`

## Processo de desenvolvimento

- Para algumas validações, utilizei algumas funcionalidades do regex para diminuir a quantidade de código;
- Busquei deixar o código mais organizado e limpo;
- Coloquei as classes e pacotes de forma organizada;
- Padroes de nomes que fazem sentido;
- O correto seria ter utilizado apenas regex para desenvolver a rotina de contagem de caracteres, mas devido ao tempo
optei por deixar com a implementação que utiliza for para essa versão;
  

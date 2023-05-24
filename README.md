<h1 align="center">Games-Survey</h1>

<p align='center'> 
    <img src="https://img.shields.io/badge/Spring_Boot  V3.0.5-F2F4F9?style=for-the-badge&logo=spring-boot"/>
    <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white"/>  
</p>

[![NPM](https://img.shields.io/npm/l/react)](https://github.com/MedeirosGiana/dslist-backend/blob/main/LICENSE)

## Sobre o projeto
Games Survey é uma aplicação back end construída durante  Intensivão Java Spring, evento organizado pela DevSuperior([https://www.youtube.com/@DevSuperior] "Site da DevSuperior").
A aplicação consiste em um sistema de coleções de jogos desenvolvido para organizar as coleções de jogos de um usuário, podendo posicionar os jogos de acordo com a ordem desejada.
Para garantir uma maior flexibilidade e separação de responsabilidades, utilizei DTO para trafegar os dados entre as camadas, seguindo uma arquitetura em camadas padrão, incluindo as camadas de repository, service e controller, além das entidades do modelo.

Para simplificar o acesso aos dados do banco de dados, utilizei o Spring Data JPA, utilizei também o Docker para rodar o banco de dados PostgreSQL e o PGAdmin, e para empacotar a API em um contêiner Docker, garantindo uma maior facilidade de implantação e portabilidade da aplicação,
configurei os perfis para os ambientes de desenvolvimento e de teste. No ambiente de desenvolvimento, utilizei o banco de dados PostgreSQL, enquanto no ambiente de teste, utilizei o banco de dados H2.

## Modelo de domínio
![image](https://github.com/MedeirosGiana/dslist-backend/assets/100285143/632320d2-baef-4bc2-a0c4-c92717f39c31)

## Tecnologias utilizadas
### Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven

## Implantação em produção
- Back end: Railway
- Banco de dados: Postgresql
- Docker compose

## Ferramenta utilizada
- Postman

## Como executar o projeto
### Back end
Pré-requisitos: Java 17, Postman, Git

```bash
## clonar repositório
git clone https://github.com/MedeirosGiana/dslist-backend.git

## entrar na pasta do dslist-backend
cd backend

## executar o projeto
./mvnw spring-boot:run
```

1. Execute o comando:
   - Obs: para alterar o perfil, só alterar o **test** para **dev** na pasta **resources**, sendo que ambiente de dev necessita do banco de dados PosgreSQL já o **test** roda com banco H2 em memoria.
  
2. Ao executar o projeto, pode ser acessado um navegador da Web em **http://localhost:8080/ ou http://localhost:8080/h2-console**

3. Utilizar a interface do Postman para testar os endpoints.


## Paso a passo do acesso através do deploy para realizar as consultas
- 1º - acessar o link: https://dslist-backend-production-90e7.up.railway.app/
- 2º - para listar todos os games https://dslist-backend-production-90e7.up.railway.app/games
- 3º - para listar todas as lists https://dslist-backend-production-90e7.up.railway.app/lists
- 4º - para listar os games por id https://dslist-backend-production-90e7.up.railway.app/games/ {colocar aqui o id desejado para busca}
- 5º - listar os games buscando na lista por id https://dslist-backend-production-90e7.up.railway.app/lists/2/games




## Autora
- Giana Medeiros
- https://www.linkedin.com/in/gianamedeiros/

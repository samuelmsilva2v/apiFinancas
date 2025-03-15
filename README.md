# API de Controle de Finanças
![GitHub repo size](https://img.shields.io/github/repo-size/samuelmsilva2v/apiFinancas?style=for-the-badge)
![GitHub language count](https://img.shields.io/github/languages/count/samuelmsilva2v/apiFinancas?style=for-the-badge)
![GitHub forks](https://img.shields.io/github/forks/samuelmsilva2v/apiFinancas?style=for-the-badge)
![Bitbucket open issues](https://img.shields.io/bitbucket/issues/samuelmsilva2v/apiFinancas?style=for-the-badge)
![Bitbucket open pull requests](https://img.shields.io/bitbucket/pr-raw/samuelmsilva2v/apiFinancas?style=for-the-badge)

[🇺🇸 Read in English](#financial-control-api)

💸 API RESTful desenvolvida em Spring Boot para o gerenciamento de finanças pessoais. Ela permite o controle de receitas, despesas, categorias de transações e o saldo total de um usuário.

## Funcionalidades

A API de Controle de Finanças oferece as seguintes funcionalidades:

- **Cadastrar, atualizar e remover contas a pagar**: Cadastre novas contas a serem pagas com nome, valor, data e categoria.
- **Cadastrar, atualizar e remover dinheiro a receber**: Cadastre novas entradas de dinheiro com nome, valor, data e categoria.
- **Controle de categorias**: Cada despesa pode ser associada a uma categoria (ex: Alimentação, Lazer, Transporte, etc.).

## Endpoints

### Endpoints de contas
| Método | Endpoint           | Descrição                |
|--------|--------------------|--------------------------|
| POST   | `/api/contas`      | Registra uma nova conta  |
| GET    | `/api/contas`      | Consulta todas as contas |
| GET    | `/api/contas/{id}` | Detalha uma conta por ID |
| PUT    | `/api/contas/{id}` | Atualiza uma conta       |
| DELETE | `/api/contas/{id}` | Remove uma conta         |

### Endpoints de categorias
| Método | Endpoint               | Descrição                    |
|--------|------------------------|------------------------------|
| POST   | `/api/categorias`      | Registra uma nova categoria  |
| GET    | `/api/categorias`      | Consulta todas as categorias |
| GET    | `/api/categorias/{id}` | Detalha uma categoria por ID |
| PUT    | `/api/categorias/{id}` | Atualiza uma categoria       |
| DELETE | `/api/categorias/{id}` | Remove uma categoria         |

## Tecnologias Utilizadas:
* Java 17
* Spring Boot
* Spring Data JPA
* Hibernate
* PostgreSQL
* Swagger
* Lombok
* Model Mapper
* Bean Validation (javax.validation)
* Docker
#### Front-end:
* Angular 19
* Bootstrap
* HttpClient

## Instalação:

#### **1. Clonar o Repositório do Back-end**
```bash
 git clone https://github.com/samuelmsilva2v/apiFinancas.git
 cd apiFinancas
```

#### **2. Execute o comando abaixo para criar a imagem Docker:**
```bash
docker build -t apifinancas .
```
##### Executando o container
```bash
docker-compose up -d
```
Acesse a documentação no Swagger: http://localhost:8082/swagger-ui/index.html#

**3. Clonar o Repositório do Front-end**
```bash
 git clone https://github.com/samuelmsilva2v/webFinancas.git
 cd webFinancas
```

**4. Instale as dependências do projeto:**
```bash
npm install
```

**5. Executar o front-end:**
```bash
$ ng s -o 
```
Isso irá iniciar o servidor de desenvolvimento na URL http://localhost:4200/. Você pode abrir seu navegador e acessar essa URL para visualizar a aplicação.

### API rodando integrada com o front-end
![](https://github.com/samuelmsilva2v/assets/blob/main/apiFinancas/Captura%20de%20tela%202024-10-31%20184207.png)
![](https://github.com/samuelmsilva2v/assets/blob/main/apiFinancas/Captura%20de%20tela%202024-10-31%20184231.png)

#### [Repositório do front-end](https://github.com/samuelmsilva2v/webFinancas)
---

# Financial Control API

[🇧🇷 Leia em Português](#api-de-controle-de-finanças)

💸 A RESTful API developed in Spring Boot for personal finance management. It allows users to track income, expenses, transaction categories, and the total balance.

## Features

The Financial Control API offers the following features:

- **Add, update, and remove payable accounts**: Register new accounts payable with name, amount, date, and category.
- **Add, update, and remove receivable funds**: Register new income entries with name, amount, date, and category.
- **Category management**: Each expense can be associated with a category (e.g., Food, Leisure, Transportation, etc.).

## Endpoints

### Account Endpoints
| Method | Endpoint              | Description                   |
|--------|-----------------------|-------------------------------|
| POST   | `/api/contas`         | Registers a new account       |
| GET    | `/api/contas`         | Retrieves all accounts        |
| GET    | `/api/contas/{id}`    | Retrieves account details by ID |
| PUT    | `/api/contas/{id}`    | Updates an account            |
| DELETE | `/api/contas/{id}`    | Deletes an account            |

### Category Endpoints
| Method | Endpoint              | Description                   |
|--------|-----------------------|-------------------------------|
| POST   | `/api/categorias`     | Registers a new category      |
| GET    | `/api/categorias`     | Retrieves all categories      |
| GET    | `/api/categorias/{id}`| Retrieves category details by ID |
| PUT    | `/api/categorias/{id}`| Updates a category            |
| DELETE | `/api/categorias/{id}`| Deletes a category            |

## Technologies Used:
#### Back-end:
* Java 17
* Spring Boot
* Spring Data JPA
* Hibernate
* PostgreSQL
* Swagger
* Lombok
* Model Mapper
* Bean Validation (javax.validation
* Docker
#### Front-end:
* Angular 19
* Bootstrap
* HttpClient

## Installation:

#### **1. Clone the Back-end Repository**
```bash
 git clone https://github.com/samuelmsilva2v/apiFinancas.git
 cd apiFinancas
```

#### **2. Run the command below to create the Docker image:**
```bash
docker build -t apifinancas
```
##### Running the Container
```bash
docker-compose up -d
```
Access the Swagger documentation: http://localhost:8082/swagger-ui/index.html#

**3. Clone the Front-end Repository**
```bash
git clone https://github.com/samuelmsilva2v/webFinancas.git
cd webFinancas
```

**4. Install the project dependencies:**
```bash
npm install
```

**5. Run the front-end:**
```bash
ng s -o
```
This will start the development server at URL http://localhost:4200/. You can open your browser and access this URL to view the application.

### API Running Integrated with the Front-End
![](https://github.com/samuelmsilva2v/assets/blob/main/apiFinancas/Captura%20de%20tela%202024-10-31%20184207.png)
![](https://github.com/samuelmsilva2v/assets/blob/main/apiFinancas/Captura%20de%20tela%202024-10-31%20184231.png)

#### [Front-End Repository](https://github.com/samuelmsilva2v/webFinancas)


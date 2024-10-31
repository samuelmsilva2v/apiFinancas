# API de Controle de Finanças

API RESTful desenvolvida em Spring Boot para o gerenciamento de finanças pessoais. Ela permite o controle de receitas, despesas, categorias de transações e o saldo total de um usuário.

## Funcionalidades

A API de Controle de Finanças oferece as seguintes funcionalidades:

- **Cadastrar, atualizar e remover contas a pagar**: Cadastre novas contas a serem pagas com nome, valor, data e categoria.
- **Cadastrar, atualizar e remover dinheiro a receber**: Cadastre novas entradas de dinheiro com nome, valor, data e categoria.
- **Controle de categorias**: Cada despesa pode ser associada a uma categoria (ex: Alimentação, Lazer, Transporte, etc.).

## Endpoints

### Endpoints de contas
| Método | Endpoint             | Descrição                   |
|--------|-----------------------|-----------------------------|
| POST   | `/api/contas`      | Registra uma nova conta       |
| GET    | `/api/contas`      | Consulta todas as contas   |
| GET    | `/api/contas/{id}` | Detalha uma conta por ID  |
| PUT    | `/api/contas/{id}` | Atualiza uma conta        |
| DELETE | `/api/contas/{id}` | Remove uma conta        |

### Endpoints de categorias
| Método | Endpoint             | Descrição                   |
|--------|-----------------------|-----------------------------|
| POST   | `/api/categorias`      | Registra uma nova categoria      |
| GET    | `/api/categorias`      | Consulta todas as categorias   |
| GET    | `/api/categorias/{id}` | Detalha uma categoria por ID  |
| PUT    | `/api/categorias/{id}` | Atualiza uma categoria        |
| DELETE | `/api/categorias/{id}` | Remove uma categoria        |

## Tecnologias Utilizadas:
- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **Hibernate**
- **PostgreSQL**
- **Swagger**
- **Lombok**
- **Model Mapper**
- **Bean Validation (javax.validation)**
- **Docker**

## Instalação:

### Construindo a imagem no Docker:
1. No terminal, navegue até a pasta do projeto.
2. Execute o comando abaixo para criar a imagem Docker:
```bash
docker build -t apifinancas .
```
### Executando o container
```bash
docker-compose up -d
```
### API rodando integrada com o front-end
![](https://github.com/samuelmsilva2v/assets/blob/main/apiFinancas/Captura%20de%20tela%202024-10-31%20184207.png)
![](https://github.com/samuelmsilva2v/assets/blob/main/apiFinancas/Captura%20de%20tela%202024-10-31%20184231.png)

[Repositório do front-end](https://github.com/samuelmsilva2v/webFinancas) 

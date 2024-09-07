# API de Controle de Finanças

Esta é uma API REST para o gerenciamento de finanças pessoais. Ela permite o controle de receitas, despesas, categorias de transações e o saldo total de um usuário. A API foi desenvolvida usando **Spring Boot** e **Java**.

## Funcionalidades

A API de Controle de Finanças oferece as seguintes funcionalidades:

- **Cadastrar, atualizar e remover contas a pagar**: Cadastre novas contas a serem pagas com nome, valor, data e categoria.
- **Cadastrar, atualizar e remover dinheiro a receber**: Cadastre novas entradas de dinheiro com nome, valor, data e categoria.
- **Controle de categorias**: Cada despesa pode ser associada a uma categoria (ex: Alimentação, Lazer, Transporte, etc.).


## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot **
- **Spring Data JPA** - Para a persistência de dados.
- **Hibernate** - Como implementação JPA.
- **PostgreSQL** - Banco de dados relacional.
- **Swagger** - Para documentação dos endpoints.
- **Lombok** - Para reduzir a verbosidade do código.
- **Model Mapper** - Para conversão entre entidades e DTOs.
- **Bean Validation (javax.validation)** - Para validação de dados de entrada.

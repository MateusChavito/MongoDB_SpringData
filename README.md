# 📚 MongoDB Spring Data - Gerenciamento de Cursos e Matrículas

Este repositório contém uma aplicação Spring Boot integrada ao MongoDB, que permite o gerenciamento de cursos e matrículas. As principais funcionalidades incluem operações de CRUD em documentos do MongoDB utilizando o **Spring Data MongoDB**.

## 📦 Estrutura do Projeto

- **Configuração MongoDB**: Configura a conexão com o banco de dados MongoDB.
- **Entidades**: `Curso` e `Matricula`, com relacionamentos e atributos essenciais.
- **Repositórios**: Interfaces que implementam operações CRUD automáticas através do `MongoRepository`.
- **Testes**: Testes unitários para garantir o funcionamento correto do repositório de cursos.

## 🚀 Funcionalidades

- **Gerenciamento de Cursos**: Cadastro, consulta e atualização de cursos.
- **Matrículas**: Registro de matrículas associadas a cursos, com controle de status e valores.

## 🛠️ Tecnologias Utilizadas

- **Java 17**
- **Spring Boot**
- **MongoDB**
- **JUnit** para testes

## ⚙️ Configuração

1. Configure seu MongoDB local na URL `mongodb://127.0.0.1:27017/MateusDados?authSource=admin`.
2. Utilize o Maven para gerenciar as dependências e executar o projeto.

## 📋 Testes
- Utilize o JUnit para validar o cadastro de cursos no MongoDB. Verifique se as inserções estão ocorrendo corretamente com o teste de integração disponível.

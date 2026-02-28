📋 Sistema de Cadastro de Funcionários
<p align="center"> <img src="https://img.shields.io/badge/Java-POO-orange?style=for-the-badge&logo=java" /> <img src="https://img.shields.io/badge/Status-Concluído-success?style=for-the-badge" /> <img src="https://img.shields.io/badge/Nível-Educacional-blue?style=for-the-badge" /> </p>
📖 Sobre o Projeto

O Sistema de Cadastro de Funcionários é uma aplicação desenvolvida em Java, com foco na prática dos principais conceitos de Programação Orientada a Objetos (POO).

O sistema permite cadastrar funcionários comuns e terceirizados, realizando o cálculo automático de seus pagamentos com base nas regras específicas de cada tipo.

Este projeto foi desenvolvido com objetivo educacional e aprimoramento de lógica e modelagem de classes.

🧠 Conceitos Aplicados

✔️ Encapsulamento

✔️ Herança

✔️ Polimorfismo

✔️ Sobrescrita de métodos (@Override)

✔️ Modularização em pacotes

✔️ Uso de Listas (ArrayList)

✔️ Entrada de dados com Scanner

🏗️ Estrutura do Projeto
cadastroFuncionarios
│
├── application
│   └── App.java
│
└── entities
    ├── Funcionario.java
    └── FuncionarioTerceirizado.java
📂 application

Responsável pela execução do sistema.

App.java → Classe principal com método main, onde ocorre a interação com o usuário.

📂 entities

Camada de entidades (modelo de domínio).

Funcionario.java → Classe base contendo atributos e método de cálculo de pagamento.

FuncionarioTerceirizado.java → Classe que herda de Funcionario e adiciona taxa adicional no pagamento.

⚙️ Funcionalidades

🔹 Cadastro de múltiplos funcionários
🔹 Identificação de funcionário terceirizado
🔹 Cálculo automático de pagamento
🔹 Exibição do pagamento final formatado

💻 Regras de Negócio
🧾 Funcionário Comum

Pagamento calculado por:

horasTrabalhadas × valorPorHora
🏢 Funcionário Terceirizado

Pagamento calculado por:

(horasTrabalhadas × valorPorHora) + adicional * 1.1

(O adicional recebe acréscimo de 10%)

▶️ Como Executar o Projeto
✅ Pré-requisitos

Java JDK 8 ou superior

IDE (Eclipse, IntelliJ, VS Code) ou terminal

🚀 Executando via terminal

1️⃣ Compile:

javac application/App.java

2️⃣ Execute:

java application.App
🖥️ Exemplo de Execução
Enter the number of employees: 2

Employee #1 data:
Outsourced (y/n)? n
Name: João
Hours: 40
Value per hour: 50.00

Employee #2 data:
Outsourced (y/n)? y
Name: Carlos
Hours: 40
Value per hour: 50.00
Additional charge: 200.00

PAYMENTS:
João - $2000.00
Carlos - $2300.00
🚀 Objetivo do Projeto

Este projeto foi desenvolvido para:

Praticar modelagem orientada a objetos

Trabalhar com herança e polimorfismo

Organizar código em pacotes

Simular uma regra de negócio real

🔮 Melhorias Futuras

Implementar persistência de dados (arquivo ou banco de dados)

Criar interface gráfica

Adicionar validações de entrada

Aplicar padrão MVC

Implementar testes unitários

👨‍💻 Autor

Pedro Augusto Ribeiro Ferreira

📌 Projeto desenvolvido para fins educacionais e aprimoramento técnico.

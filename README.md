---

# 📋 Sistema de Cadastro de Funcionários

## 📌 Descrição

O **Sistema de Cadastro de Funcionários** é uma aplicação em **Java** desenvolvida com o objetivo de aplicar conceitos fundamentais de **Programação Orientada a Objetos (POO)**.

O sistema permite cadastrar funcionários comuns e terceirizados, calculando automaticamente seus respectivos pagamentos com base nas regras definidas para cada tipo.

---

## 🧠 Conceitos de POO Aplicados

* Encapsulamento
* Herança
* Polimorfismo
* Sobrescrita de métodos (`@Override`)
* Organização em pacotes
* Uso de `ArrayList`
* Entrada de dados com `Scanner`

---

## 🏗️ Estrutura do Projeto

```
cadastroFuncionarios
│
├── application
│   └── App.java
│
└── entities
    ├── Funcionario.java
    └── FuncionarioTerceirizado.java
```

### 🔹 application

Contém a classe principal responsável pela execução do sistema.

* `App.java` → Classe com o método `main`, responsável pela interação com o usuário.

### 🔹 entities

Contém as classes de domínio do sistema.

* `Funcionario.java` → Classe base com atributos e método de cálculo de pagamento.
* `FuncionarioTerceirizado.java` → Classe que herda de `Funcionario` e adiciona taxa extra ao pagamento.

---

## ⚙️ Funcionalidades

* Cadastro de múltiplos funcionários
* Identificação de funcionário terceirizado
* Cálculo automático do pagamento
* Exibição formatada do pagamento final

---

## 💰 Regras de Negócio

### Funcionário Comum

```
pagamento = horasTrabalhadas × valorPorHora
```

### Funcionário Terceirizado

```
pagamento = (horasTrabalhadas × valorPorHora) + (adicional × 1.1)
```

O adicional recebe um acréscimo de 10%.

---

## ▶️ Como Executar

### Pré-requisitos

* Java JDK 8 ou superior

### Compilação

```
javac application/App.java
```

### Execução

```
java application.App
```

---

## 🖥️ Exemplo de Execução

```
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
```

---

## 🎯 Objetivo

Este projeto foi desenvolvido com foco em:

* Praticar modelagem orientada a objetos
* Aplicar herança e polimorfismo na prática
* Melhorar organização e estruturação de código
* Simular uma regra de negócio simples

---

## 🚀 Melhorias Futuras

* Validação de dados de entrada
* Persistência em arquivo ou banco de dados
* Interface gráfica
* Implementação de testes unitários
* Aplicação do padrão MVC

---

## 👨‍💻 Autor

Pedro Augusto Ribeiro Ferreira

Projeto desenvolvido para fins educacionais e aprimoramento técnico.

---

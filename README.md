
# 💳 Sistema Bancário em Java

Projeto desenvolvido com o objetivo de aplicar conceitos de Programação Orientada a Objetos (POO) utilizando Java, simulando operações básicas de um sistema bancário.

---

## 📌 Descrição

Este projeto representa um sistema bancário simples, onde é possível gerenciar clientes e contas, realizar depósitos, saques e transferências, além de aplicar regras de negócio específicas para diferentes tipos de contas.

O foco principal foi o aprendizado e aplicação prática de conceitos fundamentais do desenvolvimento back-end.

---

## 🧠 Conceitos Aplicados

- Programação Orientada a Objetos (POO)
- Encapsulamento
- Herança
- Sobrescrita de métodos (@Override)
- Regras de negócio
- Organização em camadas (model)

---

## ⚙️ Funcionalidades

- Criar cliente
- Criar conta bancária
- Realizar depósito
- Realizar saque
- Realizar transferência entre contas

### 💳 Conta Corrente
- Permite saldo negativo
- Possui limite configurável
- Saque permitido mesmo sem saldo suficiente (respeitando limite)

### 💰 Conta Poupança
- Não permite saldo negativo
- Saque apenas com saldo suficiente
- Regras mais restritas de movimentação

---

## 🏗️ Estrutura do Projeto
src/
└── model/
├── Cliente.java
├── Conta.java
├── ContaCorrente.java
└── ContaPoupanca.java


### 📌 Descrição das classes:

- **Cliente**: Representa os dados do cliente (nome, CPF, email)
- **Conta**: Classe base com operações bancárias comuns
- **ContaCorrente**: Possui limite e permite saldo negativo
- **ContaPoupanca**: Conta com regras mais restritas

---

## 🚀 Como Executar

1. Clone o repositório:
```bash
1.git clone https://github.com/Gabas878/sistema-bancario-java.git
2.Abra o projeto em uma IDE (IntelliJ, Eclipse ou VS Code)
3.Compile e execute a aplicação

## 🎯 Objetivo do Projeto

### Este projeto foi desenvolvido com foco em:

Consolidar fundamentos de Java
Praticar Programação Orientada a Objetos
Simular regras de negócio reais
Criar um projeto inicial para portfólio

📈 Próximas Melhorias
Implementar interface gráfica (GUI)
Adicionar persistência de dados (banco de dados)
Criar sistema de autenticação
Aplicar polimorfismo em cenários mais avançados

👨‍💻 Autor

Desenvolvido por Gabriel Passos

🔗 LinkedIn: www.linkedin.com/in/gabriel-passos-68a9433b4


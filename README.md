# SchoolSystem - Sistema de Gerenciamento de Alunos 🏫

Um sistema de terminal desenvolvido em **Java** para automatizar o cálculo de médias e a validação do status de aprovação de estudantes. Este projeto foi criado com o objetivo de consolidar conceitos práticos de **Programação Orientada a Objetos (POO)** e a sintaxe moderna da linguagem.

## 🚀 Tecnologias Utilizadas

*   **Java 11+** (Utilizando recursos modernos como inferência de tipos com `var`)
*   **Git & GitHub** (Para controle de versão e portfólio)

## 🎯 Conceitos de POO Praticados

O projeto foi estruturado utilizando boas práticas de desenvolvimento de software, destacando os seguintes pilares:

*   **Classes e Atributos:** Criação do molde `aluno` encapsulando características essenciais como nome e notas.
*   **Métodos com Retorno e Lógica:** Separação de responsabilidades, onde a classe calcula sua própria média matemática com precedência de operadores e gerencia o próprio status.
*   **Métodos Construtores:** Inicialização segura de objetos na memória do computador, obrigando o preenchimento de dados obrigatórios no momento da instância (`new`).
*   **Palavra-chave `var`:** Uso de inferência de tipo local para manter o código limpo, legível e moderno.

## 💻 Como Funciona o Código

O sistema possui uma classe principal que gerencia o fluxo de execução. Ao instanciar os objetos do tipo `aluno`, o sistema realiza as seguintes operações automaticamente:

```text
Aluno: Junior | Média: 7.0 | Status: APROVADO
Aluno: Ana    | Média: 5.25 | Status: REPROVADO
```

## 🛠️ Como Executar o Projeto

1. Certifique-se de ter o **JDK (Java Development Kit)** instalado em sua máquina.
2. Clone este repositório:
   ```bash
   git clone https://github.com
   ```
3. Abra o projeto na sua IDE de preferência (Eclipse, IntelliJ, VS Code).
4. Execute o arquivo `SchoolSystem.java`.

---
Desenvolvido para fortalecer a base lógica e evoluir na trilha de Engenharia de Software. 🚀

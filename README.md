# 🚣️ Batalha Naval em Java

Um jogo simples de **Batalha Naval** feito em Java para rodar no terminal. O jogador tem 10 tentativas para afundar 3 navios escondidos em um tabuleiro 5x5.

## 🎮 Como Jogar

1. O programa pedirá que você informe as posições dos 3 navios (linha e coluna, valores entre 0 e 4).
2. O jogador tentará acertar os navios informando coordenadas (linha e coluna).
3. O tabuleiro exibirá os acertos e erros:
   - `"~"` representa água (posição ainda não atacada).
   - `"X"` representa uma tentativa (acerto ou erro).
4. O jogo termina quando o jogador afunda todos os navios ou esgota as tentativas.

---

## 🧠 Conceitos Envolvidos

- Arrays multidimensionais
- Estruturas de repetição e decisão
- Entrada de dados com `Scanner`
- Programação estruturada

---

## 📆 Estrutura do Código

### Classes
- `BatalhaNaval`: contém todo o código do jogo dentro do método `main`.

### Lógica
- Dois tabuleiros são usados:
  - `tabuleiro`: contém a posição real dos navios.
  - `tabuleiroJogador`: mostra apenas os acertos visíveis ao jogador.
- O jogador tem 10 tentativas para acertar os 3 navios.

---

## 💡 Exemplo de Execução

```
Digite as posições dos navios (0-4):
Navio 1:
2
3
Navio 2:
0
1
Navio 3:
4
4
Bem-vindo ao jogo de Batalha Naval!
Você tem 10 tentativas para afundar 3 navios.

  0 1 2 3 4
0 ~ ~ ~ ~ ~
1 ~ ~ ~ ~ ~
2 ~ ~ ~ ~ ~
3 ~ ~ ~ ~ ~
4 ~ ~ ~ ~ ~

Tentativas restantes: 10
Digite a linha e a coluna (0-4): 2 3
Você acertou um navio!
```

---

## ⚙️ Como Executar

1. Salve o código no arquivo `BatalhaNaval.java`.
2. Compile o programa:
   ```bash
   javac BatalhaNaval.java
   ```
3. Execute:
   ```bash
   java BatalhaNaval
   ```

---


Feito com ❤️ em Java.

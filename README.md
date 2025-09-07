# Sistema-Carro-Simples

Este projeto consiste em uma simulação simples de controle de carro em Java. O objetivo é representar as principais operações de um automóvel usando lógica orientada a objetos e regras de segurança que simulam o funcionamento real de um veículo.

## Funcionalidades

O sistema permite controlar as seguintes funções do carro via terminal:

- **Ligar o carro**: Inicializa o veículo em ponto morto (Neutro), velocidade 0km/h e desligado.
- **Desligar o carro**: Só é permitido se o carro estiver em ponto morto e com velocidade 0km/h.
- **Acelerar**: Incrementa a velocidade em 1km/h, respeitando o limite máximo de 120km/h.
- **Diminuir a velocidade (frear)**: Decrementa a velocidade em 1km/h, respeitando o limite mínimo de 0km/h.
- **Trocar marcha**: O carro possui 6 marchas e ponto morto. Não é permitido pular marchas.
- **Virar para esquerda/direita**: Só pode ser realizado se a velocidade estiver entre 1km/h e 40km/h.
- **Verificar velocidade**: Exibe a velocidade atual.

## Regras de funcionamento

- O carro começa desligado, em ponto morto e com velocidade 0km/h.
- O carro desligado **não pode realizar nenhuma função**.
- A aceleração só pode ocorrer se o carro estiver ligado e fora do ponto morto (marcha 0).
- A troca de marchas deve seguir a sequência, sem pular marchas.
- As velocidades permitidas para cada marcha são:
  - **Ponto morto (Neutro/0)**: 0km/h
  - **1ª marcha**: 0 a 20km/h
  - **2ª marcha**: 21 a 40km/h
  - **3ª marcha**: 41 a 60km/h
  - **4ª marcha**: 61 a 80km/h
  - **5ª marcha**: 81 a 100km/h
  - **6ª marcha**: 101 a 120km/h
- O carro **só pode ser desligado** se estiver em ponto morto e com velocidade 0km/h.
- Virar o carro (esquerda/direita) só é permitido entre 1km/h e 40km/h.

## Como usar

1. Compile o projeto:
    ```bash
    javac src/Carro.java
    ```
2. Crie uma classe principal para iniciar o programa, exemplo:
    ```java
    public class Main {
        public static void main(String[] args) {
            Carro carro = new Carro();
            carro.operacoes();
        }
    }
    ```
3. Compile e execute:
    ```bash
    javac src/Main.java
    java -cp src Main
    ```

## Exemplo de uso

```text
Você entrou no carro . . .
O que deseja fazer?
1 - Ligar o carro
2 - Sair do carro
```

## Estrutura do projeto

```
Sistema-Carro-Simples/
├── src/
│   └── Carro.java
│   └── Main.java
└── README.md
```

## Autor

Feito por [Danilzs](https://github.com/Danilzs).

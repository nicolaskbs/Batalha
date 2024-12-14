- Personagem pode ser guerreiro ou assassino


- Construir um personagem:
    - Partição guerreiro
    - Partição assassino
    - Partição NÃO É personagem


-Tabela de dispersão =
Condição/ação


## Tabelas de Dispersão para Construção do Personagem


### Tabela de Dispersão para Regras Similares (tanto para guerreiro, quanto assassino)

| **Condição**           | Regra 1 | Regra 2 | Regra 3 | Regra 4 | Regra 5 | Regra 6 | Regra 7 |
|------------------------|---------|---------|---------|---------|---------|---------|---------|
| Soma atributos = 20 ?  | False   | True    | True    | True    | True    | True    | True    |
| Defesa >= 3 ?          | -       | False   | True    | True    | True    | True    | True    |
| Resistência >= 3 ?     | -       | -       | False   | True    | True    | True    | True    |
| Velocidade >= 3 ?      | -       | -       | -       | False   | True    | True    | True    |
| Ataque >= 3 ?          | -       | -       | -       | -       | False   | True    | True    |
| Ataque > Defesa ?      | -       | -       | -       | -       | -       | False   | True    |
| **Ação**               | Regra 1 | Regra 2 | Regra 3 | Regra 4 | Regra 5 | Regra 2 | Regra 7 |
| NÃO é Personagem       | X       | X       | X       | X       | X       | X       | ?       |


### Tabela de Dispersão para Construção de Guerreiro

| **Condição**               | Regra 7.1.1 | Regra 7.1.2 | Regra 7.1.3 | Regra 7.1.4 |
|----------------------------|-------------|-------------|-------------|-------------|
| Ataque > Velocidade ?      | False       | True        | True        | True        |
| Resistência > Defesa ?     | -           | False       | True        | True        |
| Resistência > Velocidade ? | -           | -           | False       | True        |
| **Ação**                   | Regra 7.1.1 | Regra 7.1.2 | Regra 7.1.3 | Regra 7.1.4 |
| Guerreiro                  | -           | -           | -           | X           |
| NÃO é Guerreiro            | X           | X           | X           | -           |


### Tabela de Dispersão para Construção de Assassino

| **Condição**               | Regra 7.2.1 | Regra 7.2.2 | Regra 7.2.3 | Regra 7.2.4 |
|----------------------------|-------------|-------------|-------------|-------------|
| Ataque > Resistência ?     | False       | True        | True        | True        |
| Velocidade > Defesa ?      | -           | False       | True        | True        |
| Velocidade > Resistência ? | -           | -           | False       | True        |
| **Ação**                   | Regra 7.2.1 | Regra 7.2.2 | Regra 7.2.3 | Regra 7.2.4 |
| Assassino                  | -           | -           | -           | X           |
| NÃO é Assassino            | X           | X           | X           | -           |
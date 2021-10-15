# RELATÓRIO

## Teste de Software

### IFSP – Instituto Federal de Educação, Ciência e Tecnologia de São Paulo

### Câmpus Capivari

### Curso de Testador de Software

### Professor : Waldo Luis de Lucca

### Atividade: Lab04

## Objetivos:

### Aplicar a técnica de teste funcional baseada no grafo de causaefeito e na tabela de decisão.

## Descrição:

### Planejamento e execução de teste de um programa de cálculo de comissões de vendedores.

### LAB04 – Especificação de Requisitos

#### O programa deve permitir que o usuário digite (via teclado) os dados referentes a uma venda e deve gerar, como resultado, o valor correspondente da comissão do vendedor.

### Os dados da venda são os seguintes:

- Tipo do vendedor (pode ser M – mensalista ou C – comissionado);
- Tipo do cliente (pode ser E – especial ou C – comum);
- Tipo do produto (pode ser E – especial ou C – comum);
- Valor da venda (pode ser qualquer número maior que zero).
  Com base nos dados de entrada, o valor da comissão é calculado da seguinte forma:
- Para todos os produtos comuns, a comissão é de 2%, independente do valor, do tipo
  de vendedor e do tipo de cliente;
- Para vendas acima de R$ 150,00, exceto para produtos comuns, para clientes
  especiais, a comissão é de 2,5% para vendedores comissionados e 2% para
  mensalistas;
- Para vendas de produtos especiais por vendedores mensalistas para clientes comuns,
  a comissão é de 1,5%;
- A comissão para vendedores mensalistas sobre a venda de produtos especiais para
  clientes especiais, até R$ 150,00, é de 1,5% e para vendedores comissionados é de
  1,75%.
- Vendedores comissionados têm comissão de 2% na venda de produtos especiais
  para clientes comuns.
  O programa deve exibir o valor da comissão calculado

## Link do arquivo com a resolução

[Link](https://drive.google.com/file/d/1STFAmLtqTI2Em0dEXSVg-_dUJ0_D1hdQ/view?usp=sharing)

### Digite o comando no terminal java Lab04 para testar o programa

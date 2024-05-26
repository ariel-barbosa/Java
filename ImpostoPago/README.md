
Descrição:
 * O programa lê os dados de N contribuintes, onde N é um valor fornecido pelo usuário.
 * Os contribuintes podem ser pessoa física ou pessoa jurídica.
 * O programa exibe o valor do imposto pago por cada contribuinte e o total de imposto arrecadado.
Dados de Pessoa Física:
 * Nome
 * Renda anual
 * Gastos com saúde
Dados de Pessoa Jurídica:
 * Nome
 * Renda anual
 * Número de funcionários

 //////////////////////////////////////////////////

Regras para Cálculo do Imposto:
Pessoa Física:
 * Renda anual abaixo de R$ 20.000,00: imposto de 15%.
 * Renda anual igual ou superior a R$ 20.000,00: imposto de 25%.
 * Gastos com saúde: 50% são abatidos do imposto.
Exemplo:
 * Renda anual: R$ 50.000,00
 * Gastos com saúde: R$ 2.000,00
Cálculo do imposto:
(50.000,00 * 25%) - (2.000,00 * 50%) = R$ 11.500,00

///////////////////////////////////////////////////

Pessoa Jurídica:
 * Imposto de 16%.
 * Empresas com mais de 10 funcionários: imposto de 14%.
Exemplo:
 * Renda anual: R$ 400.000,00
 * Número de funcionários: 25
Cálculo do imposto:
400.000,00 * 14% = R$ 56.000,00
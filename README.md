**Semestral Padrões de Projeto**
-- Giovanna Rosa - 35874716 --


------------**QUESTÃO 01**------------
**Design Pattern escolhido**: Factory Method

**Como ele funciona**: O objetivo principal é a criação de diferentes objetos, deste modo, o Factory se encaixa sendo o modelo perfeito pois, ele funciona a partir que subclasses decidam qual objeto será criado, sem a necessidade que o código principal saiba disso. Assim, nao criando uma dependência entre o codigo principal e as classes concretas. Ou seja, existe uma classe criadora, por isso o nome factory, que delega as subclasses o que deve ser criado. Entrando de acordo com o principio Open-Closed (aberto para extensão e fechado para modificação). 

**Como ele é aplicado na questão**: Como o objetivo principal da questão é a estruturação flexível de diferentes tipos de relatórios, com formatos e métricas diferentes, é necessário que cada relatório tenha uma subclasse própria (daily, weekly e emergency). O sistema cria relatório sem precisar saber de qual tipo está criando pois, o fluxo principal de criação é o mesmo. Assim, adequando-se perfeitamente ao factory method!
O sistema também permite adicionar, futuramente, outros tipos de relatório. Adequando-se ao princípio Open-Closed

Por que nao utilizar o strategy? -> Mesmo que indicado tambem para este tipo de questão, o strategy busca a troca de algoritmos de forma dinâmica, em tempo de execução. Nao sendo este o caso do projeto para a questão 01. 

------------**QUESTÃO 02**------------

**Design Pattern escolhido**: Strategy

**Como ele funciona**: O objetivo principal do Strategy busca possuir a troca dinâmica a lógica do cálculo do risco, não necessitando a modificação do fluxo principal, adequando-se aos padrões do SOLID. 

**Como ele é aplicado na questão**: O Strategy nessa questão busca alterar dinamicamente entre várias implementaçãoes (agressivo, moderado e conservador). Assim, o fluxo principal, que é o RiskAnalyzer recebe a estratégia e a usa sem a necessidade de saber como ela funciona. 
É possível também trocar a estratégia em tempo de execução, sem alterar o código da análise, por isso nome do design pattern é 'Strategy'!
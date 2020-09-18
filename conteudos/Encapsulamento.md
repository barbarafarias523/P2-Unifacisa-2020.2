# Encapsulamento 

O encapsulamento é um conceito da Programação Orientada a Objetos onde o estado de objetos (as variáveis da classe) e seus comportamentos (os métodos da classe) são agrupados em conjuntos segundo o seu grau de relação.o propósito do encapsulamento é o de organizar os dados que sejam relacionados, agrupando-os (encapsulando-os) em objetos (classes), reduzindo as colisões de nomes de variáveis (dado que variáveis com o mesmo nome estarão em namespaces distintos) e, da mesma forma, reunindo métodos relacionados às suas propriedades (ou variáveis de classe). Este padrão ajuda a manter um programa com centenas ou milhares de linhas de código mais legível e fácil de trabalhar e manter.

![image007](https://user-images.githubusercontent.com/69488674/93398305-ab684c00-f851-11ea-8944-c9b037c59bcc.jpg)

Como podemos notar, estas classes encapsulam os dados relacionados a cada objeto de forma que possamos acessar cada um deles sem conflito, por estarem cada um em seu domínio. Ou seja, para saber a idade de um homem, podemos perguntar por Homem.idade e, da mesma forma, para saber a idade de um cachorro, podemos perguntar por Cachorro.idade. Os dois atributos têm o mesmo nome, mas cada um tem o seu próprio domínio. O mesmo pode ser dito sobre as operações de cada uma das classes. Isto é encapsulamento!

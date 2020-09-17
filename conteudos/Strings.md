# String

Uma String armazena uma sequência de caracteres. Um objeto String é imutável, o que significa que o texto que ele carrega nunca é alterado. Sempre que um texto precisa ser modificado é utilizado mais espaço em memória para que uma nova String seja criada contendo a nova versão dele.

## Como criar uma string

Uma String é criada de forma semelhante a um tipo primitivo.

String texto = "Qualquer texto entre aspas é uma String";

É possível declarar uma variável como sendo do tipo String sem inicializá-la com um valor. Nesse caso, se a variável texto for declarada dentro de uma classe, como membro, o valor padrão null será atribuído a ela.

String texto;

## Testando igualdade entre Strings

A comparação entre Strings utilizando o operador de igualdade (==) retornará true se as duas referências apontarem para o mesmo objeto na memória.

String nome = "Arthur";
String apelido = nome;

if(nome == apelido) {
    System.out.println("Nome e apelido são iguais");
}

"Nome e apelido são iguais" será impresso apenas porque nome e apelido apontam para o mesmo objeto criado quando o compilador encontra o texto "Arthur".

## Equals

Equals é um método da classe Object utilizado para testar a relação de igualdade entre dois objetos. Esse método está presente em todas as classes, porque todas elas derivam de Object. A forma como essa comparação será feita pode ser determinada por quem está escrevendo a classe e no caso de String, seu autor preparou o método equals para verificar se duas Strings contém exatamente os mesmos caracteres.

String nome1 = "Carlos";
String nome2 = "Carla";

if (nome1.equals(nome2)) {
    System.out.println("Os nomes são iguais!");
} else {
    System.out.println("Os nomes são diferentes!");
}

## equalsIgnoreCase

Esse método ignora a distinção entre letras maiúsculas e minúsculas nas duas strings comparadas.

String nome1 = "Carlos";
String nome2 = "carlos";

if(nome1.equalsIgnoreCase(nome2)) {
    System.out.println("Os nomes são iguais!");
}

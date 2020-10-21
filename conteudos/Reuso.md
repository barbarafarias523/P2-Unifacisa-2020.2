# Reuso

A prática do reuso é importante para evitar a duplicação de código. Existem duas formas de fazer o reuso de código: herança e composição.

## Herança

Na herança temos o conceito de uma Classe Pai, Classe Base ou Superclasse (todas essas nomenclaturas denotam a mesma coisa) que é a classe que foi herdada pelas subclasses. A Classe Filha ou Subclasse é a classe que herda da classe Pai. Outros dois conceitos que temos na Herança é a Generalização onde se obtém similaridades entre classes e dessa forma define-se novas classes. As classes mais genéricas são as classes Pai. E a Especialização é onde Identifica-se atributos e métodos não correspondentes entre classes distintas colocando-os na classe filha. Ou seja, quando se tem similaridades entre as classes procura-se generalizá-las levando suas similaridades para a classe pai onde as classes filhas irão herdar essa similaridade. Por outro lado quando temos atributos e métodos não correspondentes nas classes filhas colocamos essas não correspondências nas classes filhas mais específicas que irão usar esses atributos e métodos. Normalmente na Herança usamos o termo "É um".

    public class Animal {

    }

    public class Cachorro extends Animal {

    }

    public class Gato extends Animal {

    }
    
## Composição

A composição por sua vez estende uma classe pela delegação de trabalho para outro objeto. Na composição ao invés de codificarmos um comportamento estaticamente, como é feito com o uso de herança, definimos pequenos comportamentos padrão e usamos composição para definir comportamentos mais complexos. Na composição agora podemos mudar a associação entre classes em tempo de execução, assim um objeto pode assumir mais de um comportamento.

    public class Sistema {

	    Pessoa pessoa = new Pessoa();

    }

    public class Pessoa {

    }

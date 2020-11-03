# Interface

A interface é um recurso muito utilizado em Java, bem como na maioria das linguagens orientadas a objeto, para “obrigar” a um determinado grupo de classes a ter métodos ou propriedades em comum para existir em um determinado contexto, contudo os métodos podem ser implementados em cada classe de uma maneira diferente.

Dentro das interfaces existem somente assinaturas de métodos e propriedades, cabendo à classe que a utilizará realizar a implementação das assinaturas, dando comportamentos práticos aos métodos. Para realizar a chamada/referência a uma interface por uma determinada classe, é necessário adicionar a palavra-chave implements ao final da assinatura da classe que irá implementar a interface escolhida.

## Sintaxe 

    public class nome_classe implements nome_interface

## Exemplo

    public interface Veiculo {

    public String getNome();
    public String getId();
    }

    public interface Motor {

    public String getModelo();
    public String getFabricante();
    }

    public class Carro implements Veiculo,Motor{

    @Override
    public String getId() {

       }

    @Override
    public String getNome() {

     }

    @Override
    public String getFabricante() {

    }

    @Override
    public String getModelo() {

    }

    }
    
    }

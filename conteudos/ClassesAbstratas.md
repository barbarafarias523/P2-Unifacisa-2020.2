# Classes Abstratas 

As classes abstratas são as que não permitem realizar qualquer tipo de instância. São classes feitas especialmente para serem modelos para suas classes derivadas. As classes derivadas, via de regra, deverão sobrescrever os métodos para realizar a implementação dos mesmos. As classes derivadas das classes abstratas são conhecidas como classes concretas.

Métodos Abstratos – Os métodos abstratos estão presentes somente em classes abstratas, e são aqueles que não possuem implementação. A sintaxe deste tipo de método é a seguinte: **abstract ;**

## Exemplo 

    public abstract class Funcionario
     {
         public string Nome;
         public decimal Salario;

         public abstract void Reajustar();
     }
     
     

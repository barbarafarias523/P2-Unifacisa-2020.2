# Arrays

Os arrays ou matrizes, como são conhecidos são objetos de recipientes que contém um número fixo de valores de um único tipo. O comprimento de um array é estabelecido quando criado, sendo que após a criação o seu comprimento fica fixo. Cada item em um array é chamado de elemento, e cada elemento é acessado pelo número, o índice, lembrando que sempre sua numeração começa em 0.

![ArraysEmJava1](https://user-images.githubusercontent.com/69488674/94609776-a1911080-0275-11eb-8d33-23fd2868c092.jpg)

## Declarando Arrays 

A declaração de um array, cada elemento recebe um valor padrão, sendo 0 (zero) para números de tipo primitivo, falso (false) para elementos booleanos e nulo (null) para referências.

    public class Declaracao_Array {
        public static void main(String[] args) {
        //[] - são inseridos em uma variável que referecia um array
        int[] a = new int[4];
        //OUTRA MANEIRA DE FAZER UMA DECLARAÇÃO DE ARRAY
        int[] b;
        b = new int[10];
        //DECLARANDO VÁRIOS ARRAYS
        int[] r = new int[44], k = new int[23];

    //{} - inicializar valores em um array sua declaração
        int[] iniciaValores = {12,32,54,6,8,89,64,64,6};

    //DECLARA UM ARRAY DE INTEIROS
        int[] meuArray;

        //ALOCA MEMÓRIA PARA 10 INTEIROS
        meuArray = new int[10];
        
        //INICIALIZA O PRIMEIRO ELEMENTO
        meuArray [0] = 100;
        meuArray [1] = 85;
        meuArray [2] = 88;
        meuArray [3] = 93;
        meuArray [4] = 123;
        meuArray [5] = 952;
        meuArray [6] = 344;
        meuArray [7] = 233;
        meuArray [8] = 622;
        meuArray [9] = 8522;
        //meuArray [10] = 564; //ESTOURA A PILHA POIS NÃO EXISTE O ÍNDICE 10

        System.out.println(meuArray[9]);
        System.out.println(meuArray[2]);
    }
}

## Descobrindo o tamanho de um array

Por padrão, cada array sabe seu próprio tamanho, independente de quantos valores forem inseridos. O array armazena na variável de instância o método length, que retorna o tamanho do array.

    public class TamanhoArray {

     public static void main(String[] args) {
        int[] arrayUm = {12,3,5,68,9,6,73,44,456,65,321};
        int[] arrayDois = {43,42,4,8,55,21,2,45};

        if(arrayDois.length > 8){
            System.out.println("Tamanho do ArrayDois - Maior que 8!");
        }else{
            System.out.println("Tamanho do ArrayDois - Menor que 8!");
        }
        System.out.println("\nTamanho do ArrayUm = "+arrayUm.length);
    }
}

## Percorrendo Arrays

A instrução for aprimorado, como é conhecida, serve para obter elementos de um array, sem a possibilidade de alterá-los. Se caso houver necessidade de modificar os elementos, isso pode ser feito com a instrução for controlada por contador.

    for ( parâmetro : nomeDoArray )
  
      instrução
    
    public class Percorrendo_Arrays_For_Aprimorado {
    public static void main(String[] args) {
        int[] arrayNum = {87, 68, 52, 5, 49, 83, 45, 12, 64};
        int total = 0;
        //ADICIONA O VALOR DE CADA ELEMENTO AO TOTAL
        for(int i : arrayNum)
            total += i;
        System.out.printf("Total de elementos arrayNum: %d\n", total);
    }
}

## Arrays multidimensionais

Esse tipo de array é declarado como tendo duas dimensões e é usado para representar tabelas de valores que consistem em informações organizadas em linhas e colunas.

Os arrays bidimensionais precisam de dois índices para identificar um elemento particular.

Por exemplo, quando um array é identificado dessa forma “numero[indiceA][indiceB]”, a variável numero é o array, o indiceA é a linha e o indiceB é identificado como a coluna, fazendo uma identificação de cada elemento no array por número de linha e coluna.

Exemplo de declaração: int [][] a = { { 1, 2 }, { 2, 2 } };

![ArraysEmJava2](https://user-images.githubusercontent.com/69488674/94611232-d3a37200-0277-11eb-9de6-dbeb66a2bcdd.jpg)

    public class Inicializando_Arrays_Bidimensionais {
      public static void main(String[] args) {

        int[][] array1 = { { 1,2,3 }, { 4, 5, 6 } };
        int[][] array2 = { { 1, 2 }, { 3 }, { 4, 5, 6} };

        System.out.println("Valores no array1 passados na linha são");
        outputArray( array1 ); //exibe o array 2 por linha

        System.out.println("Valores no array2 passados na linha são");
        outputArray( array2 ); //exibe o array 2 por linha

        }
    //FAZ UM LOOP PELAS LINHAS DO ARRAY
    public static void outputArray(int[][] array)
    {
        //FAZ UM LOOP PELAS COLUNAS DA LINHA ATUAL
        for(int linha = 0; linha < array.length; linha++)
        {
            //FAZ LOOP PELAS COLUNAS DA LINHA ATUAL
            for( int coluna = 0; coluna < array[linha].length; coluna++)
                System.out.printf("%d ", array[linha][coluna]);
            System.out.println();
        }
    }
}

# Exceções

As exceções ocorrem quando algo imprevisto acontece, elas podem ser provenientes de erros de lógica ou acesso a recursos que talvez não estejam disponíveis.

**Alguns possíveis motivos externos para ocorrer uma exceção são:**

Tentar abrir um arquivo que não existe.

Tentar fazer consulta a um banco de dados que não está disponível.

Tentar escrever algo em um arquivo sobre o qual não se tem permissão de escrita.

Tentar conectar em servidor inexistente.

**Alguns possíveis erros de lógica para ocorrer uma exceção são:**

Tentar manipular um objeto que está com o valor nulo.

Dividir um número por zero.

Tentar manipular um tipo de dado como se fosse outro.

Tentar utilizar um método ou classe não existentes.

**try{ … }** - Neste bloco são introduzidas todas as linhas de código que podem vir a lançar uma exceção.

**catch(tipo_excessao e) { … }** - Neste bloco é descrita a ação que ocorrerá quando a exceção for capturada.

    try
    {
      //trecho de código que pode vir a lançar uma exceção
    }
    catch(tipo_exceçao_1 e)
    {
      //ação a ser tomada
    }
    catch(tipo_exceçao_2 e)
    {
      //ação a ser tomada
    }
    catch(tipo_exceçao_n e)
    {
      //ação a ser tomada
    }

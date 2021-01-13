import java.util.Scanner;    // Importa a classe Scanner para ser possível receber dados pelo teclado

class Main{  
    public static void main(String args[]){  

        Scanner UserInput = new Scanner(System.in);  // Instancia um objeto da classe Scanner
        
        System.out.println("Digite o valor da compra:");  // Solicita ao usuário o valor da compra
        int v = UserInput.nextInt();                      // Recebe como inteiro o valor da compra fornecido pelo usuário
        if (v < 10 || v > 1000)                           // Verifica se o valor se encaixa nas restrições da questão, caso não se encaixe, imprime uma mensagem na tela e encerra o programa.
        {
            System.out.println("O valor precisa ser maior ou igual a 10 e menor ou igual a 1000");
            System.exit(1);
        }

        System.out.println("Digite a quantidade de parcelas:");  // Procedimento análogo ao descrito nas linhas 8 a 14, agora realizado com relação às parcelas.
        int p = UserInput.nextInt();
        if (p < 2 || p > 18)
        {
            System.out.println("a quantidade de parcelas precisa ser maior que 2 e menor que 18");
            System.exit(1);
        }

        monthly_price(v,p);            // Chama a função que resolve a questão.

    }  

    
    private static void monthly_price(int v, int p){   // Função que resolve a questão. Declarada como private pois só será chamada pela classe que declara.
                                                       // Declarada como static para poder ser referenciada diretamente dentro da função main, que também é static.
      System.out.println();                            // Pula uma linha para separar os valores de saída do valor de entrada, gerando uma melhor visualização.
      int remainder = v % p;                           // Resto da divisão entre o valor e as parcelas. Serve para verificar quantas parcelas terao o valor aumentado.
      int price = v / p;                               // Divisão inteira do preço pelas parcelas, serve para descobrir o preço de uma parcela sem acréscimo.
      
      for (int i = 0; i < p; i++)                      // Para cada uma das parcelas repete o seguinte procedimento:
      {
          int current_price = price;                   // Inicialmente é considerado o preço de uma parcela sem acréscimo como o valor que vai ser mostrado na tela.
          
          if (remainder > 0)                           // Caso a divisão entre preço e número de parcelas não seja exata, toma as seguintes ações:
          {
              current_price++;                         // Incrementa em 1 o valor a ser mostrado na tela.
              remainder--;                             // Decrementa em 1 a quantidade de parcelas que terá o valor aumentado.
          }  
          
          System.out.println(current_price);           // Ao final, imprime o valor da parcela na tela e repete o procedimento para a parcela seguinte, caso exista.
      }
    }





}  
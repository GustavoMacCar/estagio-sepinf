def monthly_price(v,p):    # Função que resolve a questão:
    print()                # Pula uma linha na exibição para separar os dados de saida dos dados de entrada para melhor visualização.
    remainder = v % p      # Resto da divisão entre o valor e as parcelas. Serve para verificar quantas parcelas terao o valor aumentado.
    price = v // p         # Divisão inteira do preço pelas parcelas, serve para descobrir o preço de uma parcela sem acréscimo.

    for i in range(p):                 # Para cada uma das parcelas repete o seguinte procedimento:
        current_price = price          # Inicialmente é considerado o preço de uma parcela sem acréscimo como o valor que vai ser mostrado na tela.
        if remainder > 0:              # Caso a divisão entre preço e número de parcelas não seja exata, toma as seguintes ações:
            current_price += 1         # Incrementa em 1 o valor a ser mostrado na tela.
            remainder -= 1             # Decrementa em 1 a quantidade de parcelas que terá o valor aumentado.
        print(current_price)           # Ao final, imprime o valor da parcela na tela e repete o procedimento para a parcela seguinte, caso exista.

if __name__ == "__main__":             # Quando o programa é chamado pela linha de comando (e não por outro programa) realiza as seguintes ações:
    
    v = int(input('Digite o valor da compra:\n'))    # Solicita ao usuário o valor da compra e transforma esse valor em um inteiro.
    if v < 10 or v > 1000:                           # Verifica se o valor se encaixa nas restrições da questão, caso não se encaixe, imprime uma mensagem na tela e encerra o programa.
        print('O valor precisa ser maior ou igual a 10 e menor ou igual a 1000')
        exit()

    p = int(input('Digite a quantidade de parcelas:\n'))   # Procedimento análogo ao descrito nas linhas 15 a 18, agora realizado com relação às parcelas.
    if p < 2 or p > 18:
        print('a quantidade de parcelas precisa ser maior que 2 e menor que 18')
        exit()

    monthly_price(v, p)  # Chama a função definida na linha 1 para resolver a questão com os valores fornecidos pelo usuário.

# olimpiada_unicamp_junior_fase3_2019_parcelamento_sem_juros
        


# Estruturas Condicionais

## if - else if - else

As expressões, if - else if - else, permite que o programa possa avaliar uma expressão como sendo verdadeira ou falsa.

    Scanner scan = new Scanner(System.in);
    System.out.println("Entre com o valor do item ");
		double valor = scan.nextDouble();
		
		if (valor <= 10) {
			System.out.println("Esta barato, pode comprar");
		} else if (valor > 10 && valor < 15) {
			System.out.println("Você pode pedir um desconto.");
		} else if (valor >= 15 && valor < 17){
			System.out.println("Pode pesquisar mais.");
		} else {// valor >= 17
			System.out.println("Muito caro");
      
## Switch - case

A declaração condicional switch testa o valor de uma variável, e dependendo do valor contido nessa variável, permite executar uma entre múltiplas escolhas de ações. Desta forma, é possível substituir múltiplos “ifs” encadeados por um código mais simples de criar, entender e manter posteriormente.

    Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um dia da semana(1-7): ");
		
		int diaSemana = scan.nextInt();
    
    switch(diaSemana) {
		case 2: 
		case 3: 
		case 4: 
		case 5: 
		case 6: System.out.println("Dia útil"); break;
		case 1:
		case 7: System.out.println("Fim de semana"); break;
		default: System.out.println("Não é um dia da semana");

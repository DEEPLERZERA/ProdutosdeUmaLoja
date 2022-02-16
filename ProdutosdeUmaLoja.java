//ProdutosdeUmaLoja.java

import java.io.*; //Importando bibliotecas

class ProdutosdeUmaLoja   //Criando classe do programa
{

   public static void main(String args[]) throws IOException  //Inicializando m�todo main
   {

      String[] IngredienteNome = { "CafeEmPo", "Cookie", "Leite", "Pao", "cha", "frios", "Chocolate"};           //Cria��o de Arrays para armazenar todos os dados no banco
      String[] IngredienteUnidadedeMedida = {"ML", "G", "L", "G", "ML", "G"};
      String[] IngredientePrecoUnidade = {"5Reais", "3Reais", "5Reais", "1Reais", "2.50Reais", "3Reais"};
      String[] ProdutoNome = {"CafecomLeite", "CookieRecheado", "PaocomMortandela", "Cha"};
      String[] ProdutoPreco = {"4Reais", "6Reais", "5Reais", "3Reais"};
      String[] ProdutoIngredientes = {"CafeeLeite", "CookieChocolate","PaoeFrios","Cha"};
      int[] IngredienteQuantidade = {5,8,2,15,2,27,52};

      System.out.println("Produtos: ");            //Imprimindo na tela as op��es dispon�veis
	  System.out.println("\n1-CafecomLeite");
	  System.out.println("\n2-CookieRecheado");
	  System.out.println("\n3-PaocomMortandela");
	  System.out.println("\n4-Cha");
	  System.out.println("\n5-Quer adicionar mais Ingredientes?");
      System.out.println("\n\n-Qual opcao?");
      BufferedReader Teclado1 = new BufferedReader(new InputStreamReader(System.in));     //Chamando fun��o que l� teclado

      int A = Integer.parseInt(Teclado1.readLine());    //Lendo o n�mero que o usu�rio botou na tela e aplicando no switch case......

       switch(A) {

		   case 1:    //caso 1 acontece
		   {

			   if(IngredienteQuantidade[0] >= 5 && IngredienteQuantidade[2] >= 2) {     //verificando se temos a quantidade de ingredientes dispon�veis
				     System.out.println("Voce pode comprar CafeComLeite");       //Imprimindo na tela que o usu�rio pode comprar
				     System.out.println("Quantidade de CafeEmPo: " + IngredienteQuantidade[0]);    //Imprimindo a quantidade dos ingredientes na tela para o usu�rio
				     System.out.println("Quantidade de Leite: " + IngredienteQuantidade[2]);
				}
				else {   //Em caso n�o tenha a quantidade exata mostra isso para o usu�rio
					 System.out.println("Voce nao pode comprar CafeComLeite");
					 System.out.println("Quantidade de CafeEmPo: " + IngredienteQuantidade[0]);
				     System.out.println("Quantidade de Leite: " + IngredienteQuantidade[2]);
				}
				break;  //Encerra case 1
			   }
		   case 2:  //Inicia case 2
		   {
			    if(IngredienteQuantidade[1] >= 10 && IngredienteQuantidade[6] >= 30) {
					System.out.println("Voce pode comprar CookieRecheado!");
					System.out.println("Quantidade de Cookie: " + IngredienteQuantidade[1]);
				    System.out.println("Quantidade de Chocolate: " + IngredienteQuantidade[6]);
				}
				else {
					 System.out.println("Voce nao pode comprar CookieRecheado!");
					 System.out.println("Quantidade de Cookie: " + IngredienteQuantidade[1]);
				     System.out.println("Quantidade de Chocolate: " + IngredienteQuantidade[6]);
				}
				break;
		   }
		   case 3:  //Inicia case3
		   {
			   if(IngredienteQuantidade[3] >= 10 && IngredienteQuantidade[5] >= 15) {
				     System.out.println("Voce pode comprar PaocomMortandela!");
				     System.out.println("Quantidade de Pao: " + IngredienteQuantidade[3]);
				     System.out.println("Quantidade de Frios: " + IngredienteQuantidade[5]);
			   }
			   else {
				     System.out.println("Voce nao pode comprar PaocomMortandela!");
				      System.out.println("Quantidade de Pao: " + IngredienteQuantidade[3]);
				      System.out.println("Quantidade de Frios: " + IngredienteQuantidade[5]);
			   }
			   break;
		   }
		   case 4: {  //Inicia case 4

			   if(IngredienteQuantidade[4] >= 1) {
                  System.out.println("Voce pode comprar cha!");
                  System.out.println("Quantidade de Cha: " + IngredienteQuantidade[4]);

			   }
			   else {
				   System.out.println("Voce nao pode comprar cha!");
				   System.out.println("Quantidade de Cha: " + IngredienteQuantidade[4]);
			   }
			   break;
		   }
		   case 5: //Case 5 iniciado

		        System.out.println("Ingredientes: ");   //Imprime as op��es
			    System.out.println("\n1-CafeEmPo");
			    System.out.println("\n2-Cookie");
			    System.out.println("\n3-Leite");
			  	System.out.println("\n4-Pao");
			    System.out.println("\n5-Cha");
			    System.out.println("\n6-Frios");
			    System.out.println("\n7-Chocolate");
	            System.out.println("\n\n-Qual opcao: ");
			    BufferedReader Teclado2 = new BufferedReader(new InputStreamReader(System.in));  //Chamando fun��o que L� teclado novamente

                int B = Integer.parseInt(Teclado2.readLine());  //Passando o n�mero para a vari�vel B

      switch(B) {  //Criando outro switch case

		   case 1: {  //Iniciando case 1

			    System.out.println("Quanto deste produto voce quer adicionar?: ");
			    BufferedReader Teclado3 = new BufferedReader(new InputStreamReader(System.in));    //L� teclado do usu�rio
                int C = Integer.parseInt(Teclado3.readLine());   //Passa o dado para a vari�vel C

                IngredienteQuantidade[0] =  IngredienteQuantidade[0] + C;    //Faz a somat�ria do n�mero da Array antiga com o atual
                System.out.println("Agora voce tem de CafeEmPo: " + IngredienteQuantidade[0]);  //Imprime na tela o novo valor da array
			     break;  //Encerra case 1
		   }

		   case 2: {  //Inicia case 2

			    System.out.println("Quanto deste produto voce quer adicionar?: ");
			    BufferedReader Teclado3 = new BufferedReader(new InputStreamReader(System.in));
			    int C = Integer.parseInt(Teclado3.readLine());

			    IngredienteQuantidade[1] =  IngredienteQuantidade[1] + C;
			    System.out.println("Agora voce tem de Cookie: " + IngredienteQuantidade[1]);
			    break;
		   }

		   case 3: {  //Inicia case 3

		   	    System.out.println("Quanto deste produto voce quer adicionar?: ");
		   	    BufferedReader Teclado3 = new BufferedReader(new InputStreamReader(System.in));
		   	    int C = Integer.parseInt(Teclado3.readLine());

		   	    IngredienteQuantidade[2] =  IngredienteQuantidade[2] + C;
		   	    System.out.println("Agora voce tem de Leite: " + IngredienteQuantidade[2]);
		   	    break;
		   }

	      case 4: {   //Inicia case 4

			    System.out.println("Quanto deste produto voce quer adicionar?: ");
			    BufferedReader Teclado3 = new BufferedReader(new InputStreamReader(System.in));
			    int C = Integer.parseInt(Teclado3.readLine());

			    IngredienteQuantidade[3] =  IngredienteQuantidade[3] + C;
			    System.out.println("Agora voce tem de Pao: " + IngredienteQuantidade[3]);
			    break;
		   }

	  	 case 5: {  //Inicia case 5

			    System.out.println("Quanto deste produto voce quer adicionar?: ");
			    BufferedReader Teclado3 = new BufferedReader(new InputStreamReader(System.in));
			    int C = Integer.parseInt(Teclado3.readLine());

			    IngredienteQuantidade[4] =  IngredienteQuantidade[4] + C;
			    System.out.println("Agora voce tem de Cha: " + IngredienteQuantidade[4]);
			    break;
		   }

       	 case 6: {  //Inicia case 6

			    System.out.println("Quanto deste produto voce quer adicionar?: ");
			    BufferedReader Teclado3 = new BufferedReader(new InputStreamReader(System.in));
			    int C = Integer.parseInt(Teclado3.readLine());

			    IngredienteQuantidade[5] =  IngredienteQuantidade[5] + C;
			    System.out.println("Agora voce tem de Frios: " + IngredienteQuantidade[5]);
			    break;
		   }

	 	 case 7:  //Inicia case 7

			    System.out.println("Quanto deste produto voce quer adicionar?: ");
			    BufferedReader Teclado3 = new BufferedReader(new InputStreamReader(System.in));
			    int C = Integer.parseInt(Teclado3.readLine());

			    IngredienteQuantidade[6] =  IngredienteQuantidade[6] + C;
			    System.out.println("Agora voce tem de Chocolate: " + IngredienteQuantidade[6]);
			    break;
			    default:   //M�todo padr�o caso as outras op��es n�o sejam escolhidas pelo usu�rio
			    System.out.println("\nOpcao Invalida!!!");



	  }



			      default:   //M�todo padr�o caso as outras op��es n�o sejam escolhidas pelo usu�rio
			      System.out.println("\nOpcao invalida!!!");


		               }



	         }

       }





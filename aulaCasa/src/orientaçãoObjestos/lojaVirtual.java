package orientaçãoObjestos;

import java.util.Scanner;

public class lojaVirtual {
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		
		int categorias, compra, cadastro, senhaLogin,  result;   
		byte eletronicos, materialEscolar; 
		byte roupas, acessorios; 
		String nome, email, CPF, telefone, senha, sobrenome;
		int dia, mes, ano;
		boolean verificaNumero = false, verificaCPF = false, verificaEmail = false, verificaSenha = false;
		
		System.out.println(" Digite a categoia que você deseja pequisar: \n"
				+ "\n 	1 - Eletrônico  "
				+ "\n 	2 - Roupas  " 
				+ "\n 	3 - Acessórios  " 
				+ "\n 	4 - Material escolar  " ); 
			categorias = sc.nextInt(); 
		
		
		switch ( categorias ) {
		case 1: 
				System.out.println(" Temos disponível em nossa loja os seguintes eletrônicos: \n" 
						+ "\n 	1 - JBL, Caixa de Som Bluetooth, Xtreme 3 - Preta;"
						+ "\n 	2 - JBL, Fone de Ouvido On ear, Tune 520BT - Azul, " );
				eletronicos = sc.nextByte(); 
				
				switch ( eletronicos ) {
				case 1: 
						System.out.println("     JBL, Caixa de Som Bluetooth, Xtreme 3 - Preta    \n"
								+ "\n caracteísticas do produto: "
								+ "\n\n Marca	                                   JBL "
								+ "\n Nome do modelo                            XTREME 3 "
								+ "\n Tipo de alto-falante   	           Tweeter"
								+ "\n Tecnologia de conectividade	           Bluetooth, USB "
								+ "\n Características especiais	           Porta USB, À prova d'água "
								+ "\n\n Deseja adicionar esse produto no carrinho de compras? 1- sim, 2- não ");
						compra = sc.nextInt(); 
						
					break; 
						
				case 2: 
						System.out.println("\n     JBL, Fone de Ouvido On ear, Tune 520BT - Azul  \n"
								+ "\n características do produto: "
								+ "\n\n Marca	                                        JBL"
								+ "\n Nome do modelo	                                JBLT520BTBLU"
								+ "\n Cor	                                        AZUL"
								+ "\n Fator de forma dos fones de ouvido	        Sobre a orelha"
								+ "\n Tecnologia de conectividade             	Sem fio"
								+ "\n\n Deseja adicionar esse produto no carrinho de compras ? 1- sim, 2- não");
						compra = sc.nextInt(); 
				} break; 
				
		case 2: 
				System.out.println(" Temos disponível em nossa loja as seguintes roupas: \n"
						+ "\n   1 - Cropped Canelado Regata; "
						+ "\n   2 - Short mom jeans rasgada cintura alta sem lycra. ");
				roupas = sc.nextByte(); 
				
				switch ( roupas ) {
					case 1: 
						System.out.println("\n       Cropped Canelado Regata \n"
								+ "\n características do produto: "
								+ "\n\n - Cropped Tecido Ribana "
								+ "\n - SEM Bojo "
								+ "\n - Veste do 36 ate 42 "
								+ "\n - Medida - Altura: 41 cm "
								+ "\n\n Deseja adicionar esse produto no carrinho de compras ? 1- sim, 2- não ");
						compra = sc.nextInt();
						break; 
						
					case 2: 
						System.out.println("\n   Short mom jeans rasgada cintura alta sem lycra \n"
								+ "\n características do produto: "
								+ "\n\n - Cor:                Lavanda "
								+ "\n - Tipo:	       Perna reta "
								+ "\n - Linha da cintura:   Cintura Alta "
								+ "\n - Comprimento:	       Curto "
								+ "\n - Caimento da peça:   Ajuste Regular "
								+ "\n - Tecido:     	       Não elástico "
								+ "\n - Material:	       Jeans "
								+ "\n - Composição:	       100% Algodão "
								+ "\n - Translúcido:	       Não"
								+ "\n\n Deseja adicionar esse produto no carrinho de compras ? 1- sim, 2- não ");
						compra = sc.nextInt();
				} break; 
				
		case 3: 
				System.out.println(" Temos disponível em nossa loja os seguites acessórios: \n"
						+ "\n   1 - 6 Peças Sólido Grampo De Cabelo De Jacaré, "
						+ "\n   2 - Colar Clássico Duplo Coração Azul Prata. ");
					acessorios = sc.nextByte();
				
				switch ( acessorios ) {
					case 1: 
						System.out.println("\n    6 Peças Sólido Grampo De Cabelo De Jacaré \n"
								+ "\n características do produto: "
								+ "\n\n - Cor:	        Multicolorido "
								+ "\n - Material:	Liga de ferro "
								+ "\n - tamanho:     único "
								+ "\n\n Deseja adicionar esse produto no carrinho de compras ? 1- sim, 2- não");
						compra = sc.nextInt();
						break; 
						
					case 2: 
						System.out.println("\n    Colar Clássico Duplo Coração Azul Prata \n"
								+ "\n características do produto "
								+ "\n\n - Tamanho da corrente: 45cm "
								+ "\n - Bolsa de veludo incluída "
								+ "\n - Tamanho do pingente: 1 cm * 1 cm "
								+ "\n\n Deseja adicionar esse produto no carrinho de compras ? 1- sim, 2- não");
						compra = sc.nextInt();
				} break; 
				
		case 4: 
				System.out.println(" Em nossa loja tem disponível os seguintes materias escolares: \n"
						+ "\n   1 - Caneta Hidrográfica Fineliner Ponta Fina 0.4 mm Kit 24 Cores, "
						+ "\n   2 - Régua 30cm Transparente - Acrinil. ");
				materialEscolar = sc.nextByte(); 
				
				
				switch ( materialEscolar ) {
					case 1: 
						System.out.println("\n   Caneta Hidrográfica Fineliner Ponta Fina 0.4 mm Kit 24 Cores \n"
								+ "\n características do produto: "
								+ "\n\n - Fabricante:	        Fengzengmei	"
								+ "\n - Tipo de material:	‎Plástico"
								+ "\n - Tipo de ponta:	‎Super Fine"
								+ "\n\n Deseja adicionar esse produto no carrinho de compras ? 1- sim, 2- não");
						compra = sc.nextInt();
						break; 
						
					case 2: 
						System.out.println("\n    Régua 30cm Transparente - Acrinil \n"
								+ "\n características do produto:"
								+ "\n\n - Régua 30cm Transparente "
								+ "\n - Material: Acrilico "
								+ "\n - Marca: Acrinil "
								+ "\n\n Deseja adicionar esse produto no carrinho de compras ? 1- sim, 2- não");
						compra = sc.nextInt();
						
				} break; 		
		}	
		
			System.out.println(" Para continuar comprando você precisa fazer login ou cadastro no site, digite: "
					+ "\n  1 - login. "
					+ "\n  2 - cadastro. ");
			cadastro = sc.nextInt();
			
			switch ( cadastro ) {
			case 1: 
				System.out.println(" Digite o seu nome: ");
				nome = sc.next();
				System.out.println(" Digite sua senha: ");
				senhaLogin = sc.nextInt(); 
				
				break;
				
			case 2: 
				System.out.println(" Vamos começar o seu cadastro! ");
				System.out.println(" Digite o seu nome: ");
					nome = sc.next();
				System.out.println("\n Digite seu sobrenome: ");
					sobrenome = sc.next();
				System.out.println("\n insira sua data de nascimento (dividindo por 'enter'): ");
			        dia = sc.nextInt(); mes = sc.nextInt(); ano = sc.nextInt();  
				
				  do {
		              	System.out.println("\n Insira seu número para contato: ");
		                	telefone = sc.next();
		                if(telefone.length()==11) {
		                    verificaNumero = true;
		                } else { 
		                	verificaNumero = false;
		                		System.out.println("\n número inválido tente novamente.");
		                }
		                
		            } while(verificaNumero != true);
		            
		            do {
		                System.out.println("\n Insira seu email: ");
		                	email = sc.next();
		                if(email.length()>=11) {
		                    verificaEmail = true;
		                } else {
		                    verificaEmail = false;
		                    	System.out.println("\n email inválido tente novamente.");
		                }
		                
		            } while(verificaEmail != true);
		            
		            do {
		                System.out.println("Insira seu CPF: ");
		                	CPF = sc.next();
		                if(CPF.length()==11) {
		                    verificaCPF = true;
		                } else {
		                    verificaCPF = false;
		                    	System.out.println("CPF inválido tente novamente.");
		                }
		                
		            } while(verificaCPF != true);
		            
		            do {
		                System.out.println("Insira uma senha de 7 digitos: ");
		                	senha = sc.next();
		                if(senha.length()==11) {
		                    verificaSenha = true;
		                } else {
		                    verificaSenha = false;
		                    	System.out.println(" Senha inválida tente novamente.");
		                }
		                
		            } while(verificaCPF != true);
		            
		            System.out.println("Você foi cadastrado com sucesso!");
		        }
		        
	  }
}



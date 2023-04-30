import java.util.Scanner;

public class ProgramaNome{
    
    public String main () {

    Scanner sc=new Scanner(System.in);
    
    String nome;
    
    System.out.print(" Informe seu Nome: ");
    nome=sc.nextLine();

   if (nome == "") {
	   System.out.println(" O nome não pode estar vazio");
   }
   
   else {
	   System.out.print(" Seu nome é válido");
   }
   
   

    System.out.print (nome);
    
    return nome;
    
    }
}
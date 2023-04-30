import java.util.Scanner;

public class ProgramaIdade{
    
    public int main () {

    Scanner sc=new Scanner(System.in);
    
    int idade;

    System.out.print(" Informe sua Idade: ");
    idade=sc.nextInt();

    
     
    if (idade>=120 || idade <=0){
    	
    	System.out.println ( + idade+ " não é  uma idade Inválida");
    }
    else {
    System.out.println(" A idade " + idade + " é uma idade Válida");
    }
    
    return idade;
   
    
    
    }
}
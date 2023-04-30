import java.util.Scanner;

public class ProgramaCPF{
	Scanner sc =new Scanner(System.in);
    
    public String main () {
    

    System.out.println(" Informe seu CPF: ");
    String Cpf=sc.next();

    if (Cpf.length()!=11){
        System.out.println ("CPF inválido");
        }
    else {
    	System.out.println("CPF Válido");
    }
    
    return Cpf;
    
    }
}
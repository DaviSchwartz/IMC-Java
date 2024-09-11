import java.util.Scanner;

class Pesagem {
    
    public static void main(String arg[]) {
        
        Scanner t = new Scanner(System.in);
        
        Pessoas JJ = new Pessoas();
        Pessoas DD = new Pessoas();
        
        
        //Questionando Informações de JJ
        System.out.println("Escreva seu Nome: ");
        String n = t.next();
        JJ.escreve_nome(n);
        
        System.out.println("Escreva sua Idade: ");
        int i = t.nextInt();
        JJ.escreve_idade(i);
        
        System.out.println("Escreva seu Peso: ");
        double p = t.nextDouble();
        JJ.escreve_peso(p);
        
        System.out.println("Escreva sua Altura: ");
        double a = t.nextDouble();
        JJ.escreve_altura(a);
        
        
        //Questionando Informações de DD
        System.out.println("Escreva seu Nome: ");
        n = t.next();
        DD.escreve_nome(n);
        
        System.out.println("Escreva sua Idade: ");
        i = t.nextInt();
        DD.escreve_idade(i);
        
        System.out.println("Escreva seu Peso: ");
        p = t.nextDouble();
        DD.escreve_peso(p);
        
        System.out.println("Escreva sua Altura: ");
        a = t.nextDouble();
        DD.escreve_altura(a);
        
        //Passando Informações e IMC de JJ
        System.out.println ("Seu Nome é: " + JJ.mostra_nome());
        System.out.println ("Sua Idade é: " + JJ.mostra_idade());
        System.out.println ("Seu Peso é: " + JJ.mostra_peso());
        System.out.println ("Sua Altura é: " + JJ.mostra_altura());
        System.out.println ("Seu IMC é: " + JJ.calcular_IMC());
        
        
        //Passando Informações e IMC de DD
        System.out.println ("Seu Nome é: " + DD.mostra_nome());
        System.out.println ("Sua Idade é: " + DD.mostra_idade());
        System.out.println ("Seu Peso é: " + DD.mostra_peso());
        System.out.println ("Sua Altura é: " + DD.mostra_altura());
        System.out.println ("Seu IMC é: " + DD.calcular_IMC());
        
        System.out.println ("X========================================================X");
        System.out.println ("| Abaixo de 18,5     | Você está abaixo do peso ideal    |");
        System.out.println ("|____________________|________________________________   |");
        System.out.println ("| Entre 18,5 e 24,9  | Você está no seu peso ideal       |");
        System.out.println ("|____________________|___________________________________|");
        System.out.println ("| Entre 25,0 e 29,9  | Você está acima do seu Peso Ideal |");
        System.out.println ("|____________________|___________________________________|");
        System.out.println ("| Entre 30,0 e 34,9  | Obesidade grau 1                  |");
        System.out.println ("|____________________|___________________________________|");
        System.out.println ("| Entre 35,0 e 39,9  | Obesidade grau 2                  |");
        System.out.println ("|____________________|___________________________________|");
        System.out.println ("| 40,0 e acima       | Obesidade grau 3                  |");
        System.out.println ("X========================================================X");
            
    }
    
}
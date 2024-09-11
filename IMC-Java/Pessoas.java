class Pessoas {
    
    //Criando dados de PESSOA
    String nome;
    int idade;
    double peso;
    double altura;
    
    void escreve_nome(String n){
        nome = n;
    }
    
    void escreve_idade(int i){
        idade = i;
    }
    
    void escreve_peso(double p){
        peso = p;
    }
    
    void escreve_altura(double a){
        altura = a;
    }
    
    //Criando as "Funções"
    String mostra_nome(){
        return nome;
    }
    
    int mostra_idade(){
        return idade;
    }
    
    double mostra_peso(){
        return peso;
    }
    
    double mostra_altura(){
        return altura;
    }
        
    double calcular_IMC (){
        double IMC;
        IMC = peso/(altura*altura);
        return IMC;
        
    }
    }

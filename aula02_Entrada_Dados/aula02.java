import java.util.Scanner;

public class aula02 {
    public static void main(String[] args){
        //Criando objeto Scanner para entrada de dados 
        Scanner ObjScanner = new Scanner(System.in);

        //Pedindo dados pessoais ( nome e idade )
        System.out.print("Digite seu Nome: ");
        String nome = ObjScanner.nextLine();

        System.out.print("Insira Sua Idade: ");
        int idade = ObjScanner.nextInt();

        if (idade < 0){ //erro
            System.out.print("Idade inserida invalida! Execute o programa novamente.");
        } else if (idade == 18){ // caso especifico
            System.out.print("Olá "+nome+", você acaba de virar um adulto.");
        } else if(idade > 18){// Maior de idade
            System.out.print("Olá "+nome+", você é maior de idade");
        } else { // Maior de idade
            System.out.print("Olá "+nome+",você é menor de idade ("+idade+")");
        }
        ObjScanner.close();
    }
}
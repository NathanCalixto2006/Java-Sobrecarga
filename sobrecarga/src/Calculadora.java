package OosSobrecarga;

import java.util.Scanner;

public class Operacao {
    private int nroFatorial = 0;
    private int nroMinuendo = 0;
    private int nroSubtraendo = 0;
    private int nroGenerico1 = 0;
    private int nroGenerico2 = 0;

    public int soma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public void setMinuendo(int numero) {
        this.nroMinuendo = numero;
    }

    public void setSubtraendo(int numero) {
        this.nroSubtraendo = numero;
    }

    public int subtracao() {
        return this.nroMinuendo - this.nroSubtraendo;
    }

    public void setFatorial(int numero) {
        this.nroFatorial = numero;
    }

    public int getFatorial() {
        return fatorialRecursivo(nroFatorial);
    }

    private int fatorialRecursivo(int numero) {
        if (numero == 1 || numero == 0) {
            return 1;
        } else {
            return fatorialRecursivo(numero - 1) * numero;
        }
    }

    public int multiplicacao() {
        return this.nroGenerico1 * this.nroGenerico2;
    }

    public void setNumeroGenerico1(int numero) {
        this.nroGenerico1 = numero;
    }

    public void setNumeroGenerico2(int numero) {
        this.nroGenerico2 = numero;
    }

    public int divisao() {
        return this.nroGenerico1 / this.nroGenerico2;
    }

    // Sobrecarga
    public int soma(int numero1, int numero2, int numero3) {
        return numero1 + numero2 + numero3;
    }

    public int soma(String numero1, String numero2) {
        return Integer.parseInt(numero1) + Integer.parseInt(numero2);
    }
}

public class Calculadora {
    public static void main(String[] args) { 
        // Entrada
        Scanner teclado = new Scanner(System.in); 
        System.out.println("Digite a operação:\n"
                + "1-adição dois valores inteiros\n"
                + "2-subtração\n"
                + "3-multiplicação\n"
                + "4-divisão\n"
                + "5-exponenciação\n"
                + "6-fatorial\n"
                + "7-adição três valores\n"
                + "8-adição dois valores texto");
        int tipo = teclado.nextInt();
        System.out.println("Digite o valor 1:"); 
        int valor1 = teclado.nextInt();
        int valor2 = 0;
        if (tipo != 5 && tipo != 6) {
            System.out.println("Digite o valor 2:"); 
            valor2 = teclado.nextInt();
        }
        teclado.close();
        
        // Processamento e saída
        Operacao operacao = new Operacao();
        switch (tipo) {
            // passagem de parametros retornando por função
            case 1: 
                System.out.println("Adição 2 valores inteiros=" + operacao.soma(valor1, valor2)); 
                break; 
            // passagem por método e retornando por função
            case 2: 
                operacao.setMinuendo(valor1);
                operacao.setSubtraendo(valor2);
                System.out.println("Subtração=" + operacao.subtracao());
                break;
            case 3: 
                operacao.setNumeroGenerico1(valor1);
                operacao.setNumeroGenerico2(valor2);
                System.out.println("Multiplicação=" + (valor1 * valor2));
                break;
            case 4: 
                operacao.setNumeroGenerico1(valor1);
                operacao.setNumeroGenerico2(valor2);
                System.out.println("Divisão=" + (valor1 / valor2));
                break;
            case 5: 
                System.out.println("Exponenciação= TÁ COM VOCÊ COLEGA!"); 
                break; 
            // passagem por método e retornando por função
            case 6: 
                operacao.setFatorial(valor1);
                System.out.println("Fatorial=" + operacao.getFatorial());
                break;
            // sobrecarga soma
            case 7: 
                System.out.println("adição 3 valores=" + operacao.soma(valor1, valor2, 78)); 
                break;
            case 8: 
                System.out.println("adição 2 valores textos=" + operacao.soma(Integer.toString(valor1), Integer.toString(valor2))); 
                break; 
            default: 
                System.out.println("Operação inválida!");
        }
    }
}
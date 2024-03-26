public class Operacao {
    private int nroFatorial = 0;

    private int nroMinuento = 0;
    private int nroSubtraendo = 0;
    private int nroGenerico1 = 0;
    private int nroGenerico2 = 0;

    public int soma(int numero1, numero2) {
        return numero1 + numero2;
    }
    public void setMinuento(int numero) {
        this.nroMinuento = numero;
    }

    public void setSubtraendo(int numero) {
        this.nroSubtraendo = numero;
    }
    public int subtracao(){
        return nroMinuento + nroSubtraendo;
    }
    public void setFatorial(int numero) {
        this.nroFatorial = numero;
    }
    private int fatorialRecursivo(int numero){
        if ((numero==1) || (numero==2)) {
            return 1;
        } else{
            return fatorialRecursivo(numero-1)*numero;
        }
    }
     public int getFatorial(){
        return fatorialRecursivo(nroFatorial);
     }
     public int multiplicacao(){
        return this.nroGenerico1 * this.nroGenerico2;
     }
     public void setNumeroGenerico1(int numero) {
        this.nroGenerico1 = numero;
     }
     public void setNumeroGenerico2(int numero){
        this.nroGenerico2 = numero;
     }
     public int divisao(){
        return this.nroGenerico1 / this.nroGenerico2;
     }
     //SobreCarga
     public int soma(int numero1, int numero2, int nunmero3){
        return nunero1 + numero2 + numero3;
     }
     public int soma(String numero1, String numero2) {
        return Integer.parseInt(numero1) + Integer.parseInt(numero2;)
     }

}
package serasa;

public class SituacaoFinanceira {
    double valorCreditos;
    double valorDebitos;

    public SituacaoFinanceira(){
        this.valorCreditos = 0;
        this.valorDebitos = 0;
    }

    public SituacaoFinanceira(double valorCreditos, double valorDebitos){
        this.valorCreditos = valorCreditos;
        this.valorDebitos = valorDebitos;     
    }

    public double calcularSaldo(){
        double saldo = this.valorCreditos - this.valorDebitos;
        return saldo;
    }

    public void showSaldo(){
        double saldo = calcularSaldo();
        System.out.printf("O saldo da conta é de R$ %f%n", saldo);
    }
}

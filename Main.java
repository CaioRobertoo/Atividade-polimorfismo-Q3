public class Main {
    public static void main(String[] args) {

        Funcionario dev = new Desenvolvedor(5000.00);
        Funcionario suporte = new Suporte(3000.00);

        System.out.println("Salário final do Desenvolvedor: R$ " + dev.calcularSalarioFinal());
        System.out.println("Salário final do Suporte: R$ " + suporte.calcularSalarioFinal());
    }
}

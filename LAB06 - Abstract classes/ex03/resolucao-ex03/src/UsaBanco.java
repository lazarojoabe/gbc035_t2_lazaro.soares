public class UsaBanco {
    public static void main(String[] args) {
        ContaEspecial ce = new ContaEspecial(1200, 001, 1234, 500);
        System.out.println("O saldo eh: " + ce.getSaldo(1234));
        ce.debitaValor(300, 1234);
        System.out.println("O novo saldo eh de: " + ce.getSaldo(1234));

        ce.debitaValor(900);
        System.out.println("O estado da conta eh: " + ce.getEstado(1234));

        ContaEspecial ce1 = new ContaEspecial(1000, 002, 5678, 0);
        ce1.debitaValor(1000, 5678);
        System.out.println("Novo saldo: " + ce1.getSaldo(5678));
        System.out.println("Após debitar todo o saldo, o estado da conta eh: " + ce1.getEstado(5678));
    }
}

public class ContaEspecial extends ContaCorrente{
    private float limite;

    public ContaEspecial(float val, int num, int pwd, float limite){
        super(val, num, pwd);
        this.limite = limite;
        if(limite == 0){
            ContaComum cm = new ContaComum(val, num, pwd);
            cm.setEstado(pwd, getEstado(pwd));
        }
    }

    public boolean debitaValor(float val, int pwd){
        if (!isSenha(pwd))
            return false; // senha deve ser válida
        if (getEstado(pwd) != 1)
            return false; // conta deve ser ativa
        if (val <= 0)
            return false; // val > 0
        if (val > getSaldo(pwd))
            return false;

        debitaValor(val);

        if(limite > 0){
            if (getSaldo(pwd) == 0)
                setEstado(pwd, 1); // a conta permanece ativa
        } else {
            if (getSaldo(pwd) == 0)
                setEstado(pwd, 2); // em caso de a conta, por ter limite = 0, ser comum
        }
        return true;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }
}
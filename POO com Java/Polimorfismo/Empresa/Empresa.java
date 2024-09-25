public class Empresa {
    public static void main(String[] args) {
        Gerente gerente_local = new Gerente();
        Gerente gerente_geral = new Gerente();
        Vendedor vendedor_norte = new Vendedor();
        Vendedor vendedor_sul = new Vendedor();
        Estagiario estagiario_ti = new Estagiario();
        Estagiario estagiario_mkt = new Estagiario();

        gerente_local.setNome("Bruno");
        gerente_geral.setNome("Pedro");
        vendedor_norte.setNome("Luís");
        vendedor_sul.setNome("Maria");
        estagiario_ti.setNome("Carlos");
        estagiario_mkt.setNome("Daniela");

        System.out.println("O salário do gerente local " + gerente_local.getNome() + " é: " + gerente_local.calcularSalario());
        System.out.println("O salário do gerente geral " + gerente_geral.getNome() + " é: " + gerente_geral.calcularSalario());
        System.out.println("O salário do vendedor da empresa no norte " + vendedor_norte.getNome() + " é: " + vendedor_norte.calcularSalario());
        System.out.println("O salário do vendedor da empresa no sul " + vendedor_sul.getNome() + " é: " + vendedor_sul.calcularSalario());
        System.out.println("O salário do estagiário de T.I " + estagiario_ti.getNome() + " é: " + estagiario_ti.calcularSalario());
        System.out.println("O salário do estagiário de MKT " + estagiario_mkt.getNome() + " é: " + estagiario_mkt.calcularSalario());

    }
}

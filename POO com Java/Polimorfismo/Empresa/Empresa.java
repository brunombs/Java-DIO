public class Empresa {
    public static void main(String[] args) {
        Gerente gerente_local = new Gerente(7000, 1050);
        Gerente gerente_geral = new Gerente(8500, 1250);
        Vendedor vendedor_norte = new Vendedor(3000, 750);
        Vendedor vendedor_sul = new Vendedor(2000, 500);
        Estagiario estagiario_ti = new Estagiario(1500);
        Estagiario estagiario_mkt = new Estagiario(1300.99);

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

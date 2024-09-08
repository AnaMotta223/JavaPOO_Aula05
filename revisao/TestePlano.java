package revisao;

public class TestePlano {

	public static void main(String[] args) {
		Clinica c = new Clinica("Amil","Checkup","1346787");
		Medico m = new Medico("Unimed","José","133");
		Anestesista a = new Anestesista("Amil","Carlos","123","Geral");
		//Double valorTotal = a.getValorPago() + m.getValorPago() + c.getValorPago();
		ControlePgto cp = new ControlePgto();
		
		c.calcularPagamento();
		cp.calcularTotal(c);
		m.calcularPagamento();
		cp.calcularTotal(m);
		a.calcularPagamento();
		cp.calcularTotal(a);
		
		System.out.println(c);
		System.out.println(m);
		System.out.println(a);
		//System.out.println(valorTotal);
		
	}

}

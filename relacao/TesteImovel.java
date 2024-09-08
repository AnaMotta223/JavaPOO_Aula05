package relacao;

public class TesteImovel {
	public static void main(String[] args) {
		
		Pessoa p = new Pessoa("Fulaninho","fulano@gmail.com");
		Pessoa p2 = new Pessoa("Fulaninha","fulana@gmail.com");
		
		Imovel i = new Imovel("apartamento",3.000,p);
		Imovel i2 = new Imovel("apartamento",6.000,p2);
	
		System.out.println(i);
	}
}

package SubSistemaCrm;

public class CrmServices {
	
	private CrmServices () {
		super();
	}

	public static void gravarCliente(String nome, String cep, String Cidade, String Estado) {
		System.out.println("Cliente salvo no sistema de CRM");
		System.out.println(nome);
		System.out.println(cep);
	}
}

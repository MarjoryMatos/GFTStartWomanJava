package SubSistemasCep;

public class CepAPI {
	
	private static CepAPI instancia = new CepAPI();
	
	private CepAPI() {
		super();
	}
	
	public static CepAPI getInstancia() {
		return instancia;
	}
	
	public String recuperarCidade(String cep) {
		return "São Paulo";
	}

	public String recuperarEstado(String cep) {
		return "São Paulo";
	}
}

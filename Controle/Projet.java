package Controle;

public class Projet {
	private String code;
	private String intitule;

	public Projet(String code, String intitule) {
		super();
		this.code = code;
		this.intitule = intitule;
	}

	@Override
	public String toString() {
		return "Projet [code=" + code + ", intitule=" + intitule + "]";
	}

}

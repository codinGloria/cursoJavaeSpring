package seção07.heranca;

public class Pessoa {

	public static void main(String[] args) {
		
		PessoaDesenvolvedoraBackEnd pDBE = new PessoaDesenvolvedoraBackEnd("Glória", "Java e Spring", 2000.0);
		pDBE.codar();
		
		PessoaDesenvolvedoraFrontEnd pDFE = new PessoaDesenvolvedoraFrontEnd("Glória", "Java e Spring", 2000.0);
		pDFE.codar();
	}

}

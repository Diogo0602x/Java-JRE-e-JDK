
public class TestaCondicionais {

	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 16;
		int quantidadePessoas = 3;
		if (idade >= 18) {
			System.out.println("você têm mais de 18 anos");
			System.out.println("seja bem, vindo");
		} else {
			if(quantidadePessoas >= 2) {
				System.out.println("você não tem 18, mas pode entrar, pois está acompanhado");
			}
			System.out.println("infelizmente você não pode entrar");
		}
	}
}

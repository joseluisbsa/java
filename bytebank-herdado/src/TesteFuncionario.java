
public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario func1 = new Funcionario();
		func1.setNome("Joseph");
		func1.setCpf("363363363-43");
		func1.setSalario(2500.98);
		
		System.out.println(func1.getNome());
		System.out.println(func1.getBonificacao());
	}

}

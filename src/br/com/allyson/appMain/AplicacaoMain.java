package br.com.allyson.appMain;


import br.com.allyson.pessoas.*;

public class AplicacaoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Funcionario objNovoFunc01 = new Funcionario();
		Cliente objNovoCli01 = new Cliente();
		
		
		//objNovoCli01.cadastrar("01", "Prof", "Dias", "11/11/1111", "Aqui", "8396969696");
		
		//objNovoFunc01.cadastrar(01, "prof", 15.0, "02/02/2022", "Dias", "18/09/1986", "Aqui", "958666616");
	
		objNovoCli01.getNome();
		objNovoCli01.getCodigo();
		objNovoFunc01.getEndereco();
		
		
	}

}

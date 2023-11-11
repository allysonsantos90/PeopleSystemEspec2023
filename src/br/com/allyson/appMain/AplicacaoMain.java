package br.com.allyson.appMain;
import java.time.LocalDate;

import br.com.allyson.compacicao.*;
import br.com.allyson.pessoas.*;

public class AplicacaoMain {

	public static void main(String[] args) {
		
		Funcionario objNovoFunc01 = new Funcionario();
		Cliente objNovoCli01 = new Cliente();
		Endereco objEndCli01 = new Endereco();
		LocalDate dataNasc01 = LocalDate.of(2000, 12, 1);
		
		
		objNovoCli01.cadastrar("C01", "Lider da Projecta", "Junio", null, dataNasc01 ,objEndCli01, null);
		
		//objNovoFunc01.cadastrar(01, "prof", 15.0, "02/02/2022", "Dias", "18/09/1986", "Aqui", "958666616");
	
		objNovoCli01.getNome();
		objNovoCli01.getCodigo();
		objNovoFunc01.getEndereco();
		//objNovoClie01.
		
		
	}

}

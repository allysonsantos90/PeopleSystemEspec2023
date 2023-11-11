package br.com.allyson.pessoas;

import br.com.allyson.compacicao.Endereco;

public class Cliente extends Pessoa {
	private String codigo;
	private String profissao;
	
	public void cadastrar (String codigo, String profissao, String nomeCliente, String dataNascimento, Endereco endereco, String telsContato) {
		this.codigo = codigo;
		this.profissao = profissao;
		setNome (nomeCliente);
		setDateNascimento (dataNascimento);
		setEndereco (endereco);
		setTelsContato(telsContato);
	}
		
	
	public String getCodigo() {
		this.codigo = codigo;
		return this.profissao = profissao;
		
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

}

package br.com.allyson.pessoas;

import java.time.LocalDate;

import br.com.allyson.compacicao.Endereco;

public class Cliente extends Pessoa {
	private String codigo;
	private String profissao;
	
	public void cadastrar (String nome, String codigo, String profissao, String nomeCliente, LocalDate dataNascimento, Endereco endereco, String telsContato) {
		this.codigo = codigo;
		this.profissao = profissao;
		cadastrar (nome, dataNascimento, endereco, telsContato);
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

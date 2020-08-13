package br.com.sicredi.woop.pauta.domain;

public class Associado {
    private String id;
    private String nome;
    private String numeroCPF;

    public Associado() {
    }
    
    public Associado(final String nome, final String numeroCPF) {
        this.nome = nome;
        this.numeroCPF = numeroCPF;
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumeroCPF() {
		return numeroCPF;
	}

	public void setNumeroMatricula(String numeroCPF) {
		this.numeroCPF = numeroCPF;
	}
}

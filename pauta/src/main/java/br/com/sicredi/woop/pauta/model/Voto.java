package br.com.sicredi.woop.pauta.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import br.com.sicredi.woop.pauta.enums.SimNaoEnum;

@Document
public class Voto {
	
    @Id
    private String id;
    private String numeroCPF;
    private SimNaoEnum voto;
    
    public Voto() {
    }

    public Voto(String numeroCPF, SimNaoEnum voto) {
        this.numeroCPF = numeroCPF;
        this.voto = voto;
    }

    public String getId() {
        return id;
    }
    
	public String getNumeroCPF() {
		return numeroCPF;
	}

	public void setNumeroCPF(String numeroCPF) {
		this.numeroCPF = numeroCPF	;
	}

	public SimNaoEnum getVoto() {
		return voto;
	}

	public void setVoto(SimNaoEnum voto) {
		this.voto = voto;
	}

	public String getNumeroCPF1() {
		// TODO Auto-generated method stub
		return null;
	}
}

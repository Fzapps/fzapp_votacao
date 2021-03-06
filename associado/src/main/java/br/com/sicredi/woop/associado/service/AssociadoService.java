package br.com.sicredi.woop.associado.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import br.com.sicredi.woop.associado.exception.WoopAssociadoJaExisteException;
import br.com.sicredi.woop.associado.exception.WoopException;
import br.com.sicredi.woop.associado.model.Associado;
import br.com.sicredi.woop.associado.repository.AssociadoRepository;

@Service
public class AssociadoService {

    @Autowired
    private AssociadoRepository repository;

    public Associado criar(String nome, String numeroCPF) throws WoopException {
        validaAssociado(numeroCPF);
        return repository.save(new Associado(nome, numeroCPF));
    }

    public Page<Associado> buscarTodosAssociados(PageRequest pageRequest) {
        return repository.findAll(pageRequest);
    }
    
    public Optional<Associado> buscarAssociado(String numeroCPF) {
    	return Optional.ofNullable(repository.findByNumeroCPF(numeroCPF));
    }

    private void validaAssociado(String numeroCPF) throws WoopException {
		Optional<Associado> associado = Optional.ofNullable(repository.findByNumeroCPF(numeroCPF));
        
        if (associado.isPresent()) {
            throw new WoopAssociadoJaExisteException();
        }
	}
}

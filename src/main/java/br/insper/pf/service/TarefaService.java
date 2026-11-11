package br.insper.pf.service;

import br.insper.pf.entity.Tarefa;
import br.insper.pf.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaService {

    @Autowired
    private TarefaRepository tarefaRepository;

    public List<Tarefa> findAll() {
        return tarefaRepository.findAll();
    }

    public Tarefa criar(Tarefa tarefa) {
        return tarefaRepository.save(tarefa);
    }

    public void delete (long id) {
        Tarefa tarefa = tarefaRepository.findById(id);
        tarefaRepository.delete(tarefa);
    }
}

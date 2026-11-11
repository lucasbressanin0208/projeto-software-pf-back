package br.insper.pf.controller;

import br.insper.pf.entity.Tarefa;
import br.insper.pf.repository.TarefaRepository;
import br.insper.pf.service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    @Autowired
    private TarefaService tarefaService;

    @GetMapping
    public List<Tarefa> findAll() {
        return tarefaService.findAll();
    }

    @PostMapping
    public Tarefa save(@RequestBody Tarefa tarefa) {
        return tarefaService.criar(tarefa);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        tarefaService.delete(id);
    }

}

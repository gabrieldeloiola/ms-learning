package br.com.gpesso.mslearningproject.controllers;

import br.com.gpesso.mslearningproject.entities.Worker;
import br.com.gpesso.mslearningproject.repositories.WorkerRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workers")
public class WorkerController {

    private WorkerRepository workerRepository;
    public WorkerController(WorkerRepository workerRepository) {
        this.workerRepository = workerRepository;
    }

    @GetMapping("/list")
    public ResponseEntity<List<Worker>> findAll(){
        List<Worker> list = workerRepository.findAll();
        return ResponseEntity.ok(list);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Worker> findById(@PathVariable Long id){
        Worker object = workerRepository.findById(id).get();
        return ResponseEntity.ok(object);
    }

}

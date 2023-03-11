package br.com.gpesso.mslearningproject.repositories;

import br.com.gpesso.mslearningproject.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker,Long> {
}

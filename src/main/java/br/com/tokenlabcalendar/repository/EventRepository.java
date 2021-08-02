package net.guides.springboot.loginregistrationspringbootauthjsp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends CrudRepository<net.guides.springboot.loginregistrationspringbootauthjsp.model.Event, Long> {
}

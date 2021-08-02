package br.com.tokenlabcalendar.repository;

import br.com.tokenlabcalendar.model.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends CrudRepository<Event, Long> {
}
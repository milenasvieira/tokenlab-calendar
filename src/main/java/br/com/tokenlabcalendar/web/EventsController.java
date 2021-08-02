package br.com.tokenlabcalendar.web;


import br.com.tokenlabcalendar.model.Event;
import br.com.tokenlabcalendar.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EventsController {

    @Autowired
    EventRepository eventRepository;

    @PostMapping("/createEvent")
    public String createEvent(Event event) {

        eventRepository.save(event);
        return "redirect:/calendar";
    }

    @GetMapping("/getEvents")
    public List<Event> getEvents() {
        return (List<Event>) eventRepository.findAll();
    }

    @GetMapping("/getEventById")
    public Event getEvents(long id) {
        return eventRepository.findById(id).get();
    }

    @PatchMapping("/updateEvent")
    public String updateEvent(Event event) {

        eventRepository.save(event);
        return "redirect:/calendar";
    }


    @DeleteMapping("/deleteEvent")
    public String deleteEvent(long id) {

        eventRepository.deleteById(id);
        return "redirect:/calendar";
    }


}

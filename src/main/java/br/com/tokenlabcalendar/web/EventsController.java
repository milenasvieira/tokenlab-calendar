package net.guides.springboot.loginregistrationspringbootauthjsp.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import net.guides.springboot.loginregistrationspringbootauthjsp.repository.EventRepository;
import net.guides.springboot.loginregistrationspringbootauthjsp.model.Event;

import java.util.List;

@Controller
public class EventsController {

    @Autowired
    EventRepository eventRepository;

    @PostMapping(value = "/createEvent",  produces = MediaType.APPLICATION_JSON_VALUE)
    public String createEvent(@RequestBody Event event, Model model) {
        event = eventRepository.save(event);
        model.addAttribute(event);
        return "success";
    }

    @GetMapping(value = "/getEvents",  produces = MediaType.APPLICATION_JSON_VALUE)
    public String getEvents(Model model) {
        List<Event> eventList = (List<Event>) eventRepository.findAll();
        model.addAttribute(eventList);
        return "success";
    }

    @GetMapping("/getEventById")
    public String getEvents(@RequestHeader long id, Model model) {
        Event event =  eventRepository.findById(id).get();
        model.addAttribute(event);
        return "success";
    }

    @PatchMapping("/updateEvent")
    public String updateEvent(@RequestBody Event event, Model model) {

        event = eventRepository.save(event);
        model.addAttribute(event);
        return "success";
    }


    @DeleteMapping("/deleteEvent")
    public String deleteEvent(@RequestHeader long id, Model model) {

        eventRepository.deleteById(id);
        model.addAttribute((Long) id);
        return "success";
    }


}

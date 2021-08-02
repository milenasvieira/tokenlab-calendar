package net.guides.springboot.loginregistrationspringbootauthjsp.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Event {
    public String title;
    public String start;
    public String end;
    public String groupId;
    public String url;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    public Event(String title, String start, String end, String groupId, String url) {
        this.title = title;
        this.start = start;
        this.end = end;
        this.groupId = groupId;
        this.url = url;
    }

    public Event(String title, String start, String end) {
        this.title = title;
        this.start = start;
        this.end = end;
        this.groupId = null;
        this.url = null;
    }

    public Event() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Long getId() {
        return id;
    }
}

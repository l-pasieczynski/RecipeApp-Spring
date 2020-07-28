package pl.cv.recipedietapp.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Plan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 100)
    private String name;
    @Column(nullable = false, length = 1000)
    private String description;
    private LocalDateTime created;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_plan", joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "plan_id"))
    private List<User> userId = new ArrayList<>();


    @PrePersist
    public void prePersist() {
        created = LocalDateTime.now();
    }

    public Plan() {
    }

    public Long getId() {
        return id;
    }

    public Plan setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Plan setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Plan setDescription(String description) {
        this.description = description;
        return this;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public Plan setCreated(LocalDateTime created) {
        this.created = created;
        return this;
    }

    public List<User> getUserId() {
        return userId;
    }

    public Plan setUserId(List<User> userId) {
        this.userId = userId;
        return this;
    }
}

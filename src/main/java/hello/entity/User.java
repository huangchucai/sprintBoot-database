package hello.entity;

import java.time.Instant;

public class User {
    private Integer id;
    private String username;
    private String avatar;
    private Instant createAt;
    private Instant updateAt;

    public User(Integer id, String name) {
        this.id = id;
        this.username = name;
        this.avatar = "";
        this.createAt = Instant.now();
        this.updateAt = Instant.now();

    }

    public String getAvatar() {
        return avatar;
    }

    public Instant getCreateAt() {
        return createAt;
    }

    public Instant getUpdateAt() {
        return updateAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

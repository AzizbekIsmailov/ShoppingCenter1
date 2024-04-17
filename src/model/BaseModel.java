package model;

import java.util.UUID;

public class BaseModel {
    {
        this.id = UUID.randomUUID();
        this.isActive = true;
    }

    private UUID id;
    private boolean isActive;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}

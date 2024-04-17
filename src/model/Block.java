package model;

import java.util.UUID;

public class Block extends BaseModel{

    private UUID userId;
    private String reason;

    public Block(UUID userId, String reason) {
        this.userId = userId;
        this.reason = reason;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}

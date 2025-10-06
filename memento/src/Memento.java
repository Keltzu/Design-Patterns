import java.time.LocalDateTime;

public interface Memento {
    LocalDateTime getTimestamp();
    String getDescription();
}
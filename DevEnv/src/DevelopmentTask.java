import java.time.LocalDateTime;

public class DevelopmentTask {
    String name;
    LocalDateTime creationDate;
    LocalDateTime dueDate;
    int complexity;
    String language;
    Manager creator;
    Developer developer;

    public DevelopmentTask(String name, LocalDateTime creationDate,
            LocalDateTime dueDate, int complexity, String language, Manager creator, Developer developer) {
        
        this.name = name;
        this.creationDate = creationDate;
        this.dueDate = dueDate;
        this.complexity = complexity;
        this.language = language;
        this.developer = developer;
        
    }
    
    
}

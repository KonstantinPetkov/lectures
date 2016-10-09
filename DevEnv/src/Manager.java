
import com.sun.org.apache.xml.internal.utils.res.XResourceBundle;
import java.time.LocalDateTime;

public class Manager {

    String name;
    String email;

    public Manager(String name, String email) {
        this.name = name;
        this.email = email;
    }
    
    DevelopmentTask createTask(String name, LocalDateTime dueDate,
            int complexity, String language, Developer developer){
        
         DevelopmentTask newTask
                = new DevelopmentTask(name, LocalDateTime.now(), dueDate, complexity, 
                        language, this, developer);

        return newTask;
    }
}

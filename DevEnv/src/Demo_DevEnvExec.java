
import java.time.LocalDateTime;

public class Demo_DevEnvExec {

    public static void main(String[] args) {

        Manager ivanov = new Manager("Georgi Ivanov", "gi@swift.bg");

        Developer pesho = new Developer("pesho", "Java", 3);

        DevelopmentTask task =
                ivanov.createTask("Super important task",
                        LocalDateTime.of(2016, 11, 1, 12, 0), 4, "Java", pesho);

        System.out.println("task created -> given to pesho");

        pesho.solveTask(task);

    }
}

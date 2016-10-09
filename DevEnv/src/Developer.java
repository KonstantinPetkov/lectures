public class Developer {
    String name;
    String language;
    int experience;
    
    Developer(String name, String language, int experience){
        this.name = name;
        this.language = language;
        this.experience = experience;
    }
    
    void solveTask(DevelopmentTask task){
        if( ! this.equals(task.developer) ){
            System.out.println("Error! This task is NOT for me (" + name + ").");
        } else if( this.experience < task.complexity ){
            System.out.println("Error! This task is TOO HARD for me (" + name + ").");
        } else if( ! this.language.contains(task.language) ){
            System.out.println("Error! I DON'T know this language (" + name + ").");
        } else {
            System.out.println("GOOD! I solved " + task.name + "(" + name + ").");
        }
    }
}

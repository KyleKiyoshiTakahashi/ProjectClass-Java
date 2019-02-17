public class ProjectTest {
    public static void main(String[] args){
        Project project = new Project();
        Project project2 = new Project("Second Project");
        Project project3 = new Project("Third Project", "This is the project's description.");

        project.setName("My first project");
        project.setDescription("NODES ONLY");
    
        System.out.println(project2.getName());
        System.out.println(project3.getName());
        System.out.println(project3.getDescription());

        project.elevatorPitch();
        project2.elevatorPitch();
        project3.elevatorPitch();
        
    }
}
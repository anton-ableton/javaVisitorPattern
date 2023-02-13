package basepatterns.behavioral.visitor;

public class Sobes implements SobesTask{
    SobesTask[] sobesTasks;
    public Sobes() {
        this.sobesTasks = new SobesTask[] {
                new Task1(),
                new Task2(),
                new Task3()
        };
    }

    @Override
    public void be_done(Student student) {
        for (SobesTask task: sobesTasks) {
            task.be_done(student);
        }
    }
}

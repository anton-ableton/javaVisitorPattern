package basepatterns.behavioral.visitor;

public class Task3 implements SobesTask{
    @Override
    public void be_done(Student student) {
        student.do_task(this);
    }
}

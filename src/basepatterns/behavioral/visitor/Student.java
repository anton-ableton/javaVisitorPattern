package basepatterns.behavioral.visitor;

public interface Student {
    public void do_task(Task1 unique_ptr);

    public void do_task(Task2 abstract_factory);

    public void do_task(Task3 templates);
}

package basepatterns.behavioral.visitor;

public class LoserStudent implements Student{
    public void do_task(Task1 unique_ptr) {
        System.out.println("*I can't write it via move semantics (×﹏×)");
    }

    public void do_task(Task2 abstract_factory) {
        System.out.println("*I don't know what's this (ಠ益ಠ)");
    }

    public void do_task(Task3 templates) {
        System.out.println("*How to write basic factorial OMG??? ( -_・)");
    }
}

package basepatterns.behavioral.visitor;

public class RunSobes {
    public static void main(String[] args) {
        System.out.println("\n===============================================\n");
        Sobes sobes = new Sobes();
        Student loser = new LoserStudent();
        Student gigachad = new GigachadStudent();

        System.out.println("-Okay, do these tasks for me.");

        sobes.be_done(loser);

        System.out.println("\n===============================================\n");
        System.out.println("-So, previous student is otchislen i edet v okopi, now you, do these tasks for me.");

        sobes.be_done(gigachad);
    }
}

public class Main {
    public static void main(String[] args) {
        VoteInfo v = new VoteInfo();

        Person p1 = new Person("wilson", "amber", "5/4/2002", 40831);
        Person p2 = new Person("ahmad", "hassan", "5/4/2002", 40831);
        Person p3 = new Person("fuji", "tamiko", "6/18/1995", 40831);

        v.registerVoter(p1,"apple");
        v.registerVoter(p2,"peach");
        v.registerVoter(p3,"peach");
    }
}

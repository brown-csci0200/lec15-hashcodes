import java.util.HashMap;
import java.util.HashSet;

public class VoteInfo {
    private HashMap<Person,String> registrations;
    private HashSet<Person> whoVoted;

    // usual constructor (inits HashMap/Set)

    public VoteInfo() {
        this.registrations = new HashMap<Person, String>();
        this.whoVoted = new HashSet<Person>();
    }

    /**
     * Adds a person and their party affiliation to the
     *   registrations hashmap
     *
     * @param p - the person who is registering
     * @param party - the party they are registering with
     */
    public void registerVoter(Person p, String party) {
        this.registrations.put(p, party);
    }
}

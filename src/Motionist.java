import java.io.IOException;

public class Motionist extends Member {

    boolean isActive;
    public Motionist(String name, int memberId, String dateOfBirth, boolean hasPaid, boolean isActive) throws IOException {
        super(name, memberId, hasPaid, dateOfBirth, isActive);
    }

    public Motionist(String name, String dateOfBirth, int age) {
        super(name, dateOfBirth, age);
    }
    public Motionist(){
    }

    @Override


    public String toString(){
        return "\nName: " + getName() +
                "\nMember ID: " + getMemberId() +
                "\nDate of birth: " + getDateOfBirth() +
                "\nHas paid membership fee: " + isHasPaid() +
                "\n";
    }
}

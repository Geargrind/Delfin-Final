public class Motionist extends Member {


    public Motionist(String name, int memberId, String dateOfBirth, boolean hasPaid) {
        super(name, memberId, hasPaid, dateOfBirth);
    }

    public Motionist(String name, String dateOfBirth) {
        super(name, dateOfBirth);
    }



    public String toString(){
        return "\nName: " + getName() +
                "\nMember ID: " + getMemberId() +
                "\nDate of birth: " + getDateOfBirth() +
                "\nHas paid membership fee: " + isHasPaid() +
                "\n";
    }
}

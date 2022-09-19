public class Employee {
    public String name;
    public String address;
    public int joinedYear;

    public void setValues(String name, int joinedYear, String address) {
        this.name = name;
        this.joinedYear = joinedYear;
        this.address = address; 
    }

    public int getJoinedYear() {
        return joinedYear;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
}

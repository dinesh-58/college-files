public class HRManager extends Manager {
    public void setId (int id) {
        this.id = id;
    }

    public void setName (String name) {
        this.name = name;
    }
    public void showDetails() {
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
        System.out.println("Post: HR Manager");
    }
}

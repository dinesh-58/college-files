public class MainClass {
    public static void main(String[] args) {
        HRManager hrm = new HRManager();
        GeneralManager gm = new GeneralManager();

        hrm.setId(1);
        hrm.setName("John");

        gm.setId(2);
        gm.setName("Jane");

        hrm.disp();
        hrm.showDetails();
        gm.showDetails();
    }
}

public class MainStudent {
    public static void main(String[] args) {

        Student student = new Student("Paloma");
        student.addScore(2);
        student.addScore(4);
        student.addScore(3);

        student.checkStatus();
    }
}

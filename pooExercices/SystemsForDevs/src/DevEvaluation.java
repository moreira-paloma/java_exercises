public class DevEvaluation {

    private String nameDev;
    private double evaluateJava;
    private double evaluateLogic;
    private boolean accept;

    public DevEvaluation(String nameDev) {
        this.nameDev = nameDev;
        this.evaluateJava = 0.0;
        this.evaluateLogic = 0.0;
        this.accept = false;
    }

    public void setEvaluateJava(double score) {
        if (score >= 0.0 && score <= 10.0) {
            this.evaluateJava = score;
            System.out.println("Java score saved successfully.");
        } else {
            System.out.println("Error: score must be between 0 and 10.");
        }
    }

    public void setEvaluateLogic(double score) {
        if (score >= 0.0 && score <= 10.0) {
            this.evaluateLogic = score;
            System.out.println("Logic score saved successfully.");
        } else {
            System.out.println("Error: score must be between 0 and 10.");
        }
    }

    public String getNameDev() {
        return nameDev;
    }

    public double getEvaluateJava() {
        return evaluateJava;
    }

    public double getEvaluateLogic() {
        return evaluateLogic;
    }

    public boolean isAccept() {
        return accept;
    }

    public void finalizarAvaliacao() {
        double average = (evaluateJava + evaluateLogic) / 2;

        if (average >= 7.0) {
            accept = true;
        } else {
            accept = false;
        }
    }

    public void exibirResultado() {
        System.out.println("Candidate: " + nameDev);
        System.out.println("Java score: " + evaluateJava);
        System.out.println("Logic score: " + evaluateLogic);

        if (accept) {
            System.out.println("Status: Approved");
        } else {
            System.out.println("Status: Reproved");
        }
    }
}
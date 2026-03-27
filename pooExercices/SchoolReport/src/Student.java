import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    //private double[] score;
    private List<Double> scores;

    public Student(String name){
        this.name = name;
        //this.score = new double[0];
        this.scores = new ArrayList<>();
    }

    public void addScore(double score){
        scores.add(score);

    }

    public double calculateAverage(){
        double sum= 0;
        for(Double score : scores){
            sum += score;
        }
        return sum / scores.size();

    }

    public String getName() {
        return name;
    }

    public List<Double> getScores() {
        return scores;
    }

    public void setScores(List<Double> scores) {
        this.scores = scores;
    }

    public void checkStatus(){
        double average = calculateAverage();
        if(average >= 7){
            System.out.println("Voce foi aprovado!");
        }else{
            System.out.println("Voce foi reprovado!");
        }


    }

   /* public double addScore(double score){
        double newArray = new double[score.length + 1];
        for(int i = 0; i)

    }*/



}

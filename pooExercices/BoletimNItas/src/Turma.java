import java.util.ArrayList;

public class Turma {

    ArrayList<Aluno> listaAlunos;

    public Turma() {
        this.listaAlunos = new ArrayList<>();

    }

    public void adicionarAlunos(Aluno aluno) {
        listaAlunos.add(aluno);
    }

    public double calcularMediaAluno(Aluno aluno) {
        return (aluno.getNota1() + aluno.getNota2()) / 2;
    }

    public void listarAprovados() {
        for (Aluno aluno : listaAlunos) {
            if (calcularMediaAluno(aluno) >= 7) {
                System.out.println(aluno.getNome() + " voce passou de ano!");
            }
        }
    }
    public void listarReprovados(){
        for(Aluno aluno : listaAlunos){
            if(calcularMediaAluno(aluno) < 7){
                System.out.println(aluno.getNome() + " voce reprovou de ano! " );
            }
        }
    }

    public void calcularMediaTurma(){
        double mediaTurma = 0;
        for(Aluno aluno : listaAlunos) {
            mediaTurma += calcularMediaAluno(aluno);
        }
        System.out.println(mediaTurma / listaAlunos.size());
        }


    }


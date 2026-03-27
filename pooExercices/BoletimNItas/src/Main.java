public class Main {
    public static void main(String[] args) {

        Turma turma = new Turma();

        Aluno aluno = new Aluno("Maria", 5,4);
        Aluno aluno2 = new Aluno("Paloma", 8, 6);

        turma.adicionarAlunos(aluno);
        turma.adicionarAlunos(aluno2);

        System.out.println("APROVADOS");
        turma.listarAprovados();


        System.out.println("REPROVADOS");
        turma.listarReprovados();


        System.out.println("MÉDIA DA TURMA");
        turma.calcularMediaTurma();


    }
}

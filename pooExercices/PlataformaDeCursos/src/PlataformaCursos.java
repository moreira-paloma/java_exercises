import java.util.ArrayList;

public class PlataformaCursos {

    private ArrayList<Curso> cursos = new ArrayList<>();

    public void adicionarCurso(Curso curso) {

        for (Curso c : cursos) {
            if (c.getCodigo().equalsIgnoreCase(curso.getCodigo())) {
                System.out.println("Código já existe: " + curso.getCodigo());
                return;
            }
        }

        cursos.add(curso);
    }

    public void listarCursos() {
        for (Curso curso : cursos) {
            System.out.println(curso.getCodigo() + " - " + curso.getNome() +
                    " | Final: " + curso.calcularMensalidadeFinal());
        }
    }

    public double calcularFaturamentoPotencial() {
        double total = 0;

        for (Curso curso : cursos) {
            total += curso.calcularMensalidadeFinal();
        }

        return total;
    }

    public Curso buscarCursoMaisCaro() {

        if (cursos.isEmpty()) return null;

        Curso maisCaro = cursos.get(0);

        for (Curso curso : cursos) {
            if (curso.calcularMensalidadeFinal() > maisCaro.calcularMensalidadeFinal()) {
                maisCaro = curso;
            }
        }

        return maisCaro;
    }
}
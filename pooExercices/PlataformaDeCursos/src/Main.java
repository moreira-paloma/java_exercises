public class Main {
    public static void main(String[] args) {

        PlataformaCursos plataforma = new PlataformaCursos();

        Curso curso1 = new CursoPremium("001", "Java Avançado", 200, 50);
        Curso curso2 = new CursoPromocional("002", "Python Básico", 150, 0.20);

        plataforma.adicionarCurso(curso1);
        plataforma.adicionarCurso(curso2);

        plataforma.listarCursos();

        System.out.println("\nFaturamento potencial: " + plataforma.calcularFaturamentoPotencial());

        Curso maisCaro = plataforma.buscarCursoMaisCaro();
        System.out.println("\nCurso mais caro: " + maisCaro.getNome());
    }
}
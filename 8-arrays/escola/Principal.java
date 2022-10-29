package escola;

public class Principal {
    public static void main(String[] args) {
        Turma turmaB = new Turma();
        turmaB.identificacao = "Maternal B";
        turmaB.nomeProfessora = "Abadia";
        turmaB.alunos = new Aluno[3];

        turmaB.alunos[0] = new Aluno();
        turmaB.alunos[0].nome = "JP";
        turmaB.alunos[0].idade = 4;

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Rubiara";
        aluno1.idade = 4;

        turmaB.alunos[1] = aluno1;

        for (int i = 0; i < turmaB.alunos.length; i++) {
            Aluno aluno = turmaB.alunos[i];

            if (aluno != null) {
                System.out.printf("%d - %s (%d anos)%n",
                        i, aluno.nome, aluno.idade);

            }
        }
    }
}

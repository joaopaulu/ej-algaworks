package escola;

public class Principal {
    public static void main(String[] args) {
        Turma turmaB = new Turma();
        turmaB.identificacao = "Maternal B";
        turmaB.nomeProfessora = "Abadia";

        Aluno aluno1 = new Aluno();
        aluno1.nome = "JP";
        aluno1.idade = 4;

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Marcos";
        aluno2.idade = 4;

        turmaB.adicionarAluno(aluno1);
        turmaB.adicionarAluno(aluno2);

        turmaB.imprimirListaDeAlunos();


    }
}

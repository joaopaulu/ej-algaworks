import java.util.ArrayList;

public class ApiArrayList {
    public static void main(String[] args) {
        ArrayList<String> alunos = new ArrayList<>();
        alunos.add("JP");
        alunos.add("Valéria");

        for(String aluno : alunos){
            System.out.println(aluno);
        }
    }
}

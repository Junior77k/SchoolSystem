class aluno{
    String nome;
    double nota1;
    double nota2;
        
    aluno(String nomeInicial, double notaInicial1, double notaInicial2) {
        nome = nomeInicial;
        nota1 = notaInicial1;
        nota2 = notaInicial2;
    }

    double calcularMedia() {
        return (nota1 + nota2) / 2;
    }
   
    void exibirStatus(){

    var mediaFinal = calcularMedia();

    if (mediaFinal >= 6.0) {
        System.out.println("Aluno: " + nome + "| Média: " + mediaFinal + " | Status: APROVADO");
    } else {System.out.println("Aluno: " + nome + " | Média: " + mediaFinal + " | Status: REPROVADO");}

    }
    }

public class SchoolSystem {
    public static void main(String[] args) {
        
        // Correção: Passando apenas os valores puros dentro do construtor
        aluno aluno1 = new aluno("Junior", 10.0, 4.0);
        aluno aluno2 = new aluno("Ane", 5.0, 5.5);

        // Executando os testes na tela
        aluno1.exibirStatus();
        aluno2.exibirStatus();
}
}




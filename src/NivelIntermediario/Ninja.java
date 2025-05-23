package NivelIntermediario;
//criar uma classe (objeto)
public class Ninja {

        String nome;
        int idade;
        String missao;
        String nivelDificuldade;
        String statusMissao;

        public void mostrarInformacoes(){
                System.out.println("Nome: " + nome);
                System.out.println("Idade: " + idade);
                System.out.println("Missao: " + missao);
                System.out.println("Nivel: " + nivelDificuldade);
                System.out.println("Status da Missao: " + statusMissao);
        }

}
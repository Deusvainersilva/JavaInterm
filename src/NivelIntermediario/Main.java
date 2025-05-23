package NivelIntermediario;

public class Main {
    public static void main(String[] args) {

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 18;
        sasuke.missao = "Salvar uma pessoa";
        sasuke.nivelDificuldade = "Médio";
        sasuke.statusMissao = "Concluido";
        sasuke.mostrarInformacoes();
        sasuke.mostrarHabilidadeEspecial();


    }
}
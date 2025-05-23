package NivelIntermediario;

public class Uchiha extends Ninja {
    String habilidadeEspecial = "Atirar facas";

    @Override
    public void mostrarInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Missao: " + missao);
        System.out.println("Nivel: " + nivelDificuldade);
        System.out.println("Status da Missao: " + statusMissao);
    }


    public void mostrarHabilidadeEspecial(){
        System.out.println("Habilidade especial: " + habilidadeEspecial);
    }

}

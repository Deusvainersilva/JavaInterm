package NivelIntermediario;

public class Main {
    public static void main(String[] args) {



        //Criar ninja
        Ninja Sasuke = new Ninja();

        Ninja.nome = "Sasuke";
        Ninja.aldeia = "Aldeia da folha";
        Ninja.idade = 18;

       //Aplicando metodos ao objeto
        Sasuke.SharinganAtivado();
        String chamandoMetodo = Sasuke.BoasVindas();
        System.out.println(chamandoMetodo);

        int quantoTempoFalta = Sasuke.anosHockage(70);
        System.out.println(quantoTempoFalta);

    }

}

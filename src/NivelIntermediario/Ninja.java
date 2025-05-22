package NivelIntermediario;
//criar uma classe (objeto)
public class Ninja {

        static String nome;
        static String aldeia;
        static int idade;


        //criar um metodo publico personalizado
        public void SharinganAtivado(){
                System.out.println("O Sharingan ativou");
        }

        //metodo string
        public String BoasVindas(){
               return "Olá, eu sou um ninja!";
        }


        //metodo int
        public int anosHockage(int idadeMinimaHockage){
                return idadeMinimaHockage - idade;
        }


}

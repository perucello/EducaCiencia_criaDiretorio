package manipulando_diretorio_java;

public class Main {

    public static void main(String[] args) {

        //Endereço - path
        String pasta = "C:\\EducaCienciaFastCode\\";

        Criar_diretorio criar = new Criar_diretorio();
        criar.CriaDiretorio(pasta);

    }
}

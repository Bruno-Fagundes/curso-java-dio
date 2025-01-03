package dio.bruno.anatomia.das.classes;

public class BoletimEstudantil
{
    public static void main(String[] args)
    {
        int mediaFinal = 6;
        StatusEscolar(mediaFinal);
    }

    static void StatusEscolar(int mediaFinal) {
        if (mediaFinal < 6)
            System.out.println("REPROVADO");
        else if (mediaFinal == 6)
            System.out.println("EXAME");
        else
            System.out.println("APROVADO");
    }
}
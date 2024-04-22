import java.util.Scanner;

public class Promedio {

  private String nombreCurso;

    public Promedio(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public void promedio(){
        Scanner sc = new Scanner(System.in);
        int grado;
        int promedio;
        int sumaNotas = 0;
        int contadorGrado = 1;

        while(contadorGrado <= 10){
            System.out.println("Ingrese Nota: ");
            grado = sc.nextInt();
            sumaNotas = sumaNotas + grado;
            contadorGrado = contadorGrado + 1;
        }

        promedio = sumaNotas/10;
        System.out.println("La suma de las notas es: "+sumaNotas );
        System.out.println("El promedio es de: " + promedio);

    }
}

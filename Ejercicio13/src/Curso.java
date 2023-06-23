import java.util.Arrays;

public class Curso {
/**
 *  crearemos una clase
 *      * entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia,
 *      * cantidadDiasPorSemana, turno (mañana o tarde), precioPorHora y alumnos. Donde
 *      * alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
 *      * nombres de cada alumno.
 *
 */

    private String nombreCurso;
    private int cantidadHorasPorDia;
    private int cantidadHorasPorSemana;
    private boolean turnoM;
    private double precioPorHora;
    private String[] alumnos = new String[5];

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public int getCantidadHorasPorSemana() {
        return cantidadHorasPorSemana;
    }

    public void setCantidadHorasPorSemana(int cantidadHorasPorSemana) {
        this.cantidadHorasPorSemana = cantidadHorasPorSemana;
    }

    public boolean isTurnoM() {
        return turnoM;
    }

    public void setTurnoM(boolean turnoM) {
        this.turnoM = turnoM;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    public Curso() {
    }

    public Curso(String nombreCurso, int cantidadHorasPorDia, int cantidadHorasPorSemana, boolean turnoM, double precioPorHora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadHorasPorSemana = cantidadHorasPorSemana;
        this.turnoM = turnoM;
        this.precioPorHora = precioPorHora;
        this.alumnos = alumnos;
    }


    @Override
    public String toString() {
        return "Curso{" +
                "nombreCurso='" + nombreCurso + '\'' +
                ", cantidadHorasPorDia=" + cantidadHorasPorDia +
                ", cantidadHorasPorSemana=" + cantidadHorasPorSemana +
                ", turnoM=" + turnoM +
                ", precioPorHora=" + precioPorHora +
                ", alumnos=" + Arrays.toString(alumnos) +
                '}';
    }
}

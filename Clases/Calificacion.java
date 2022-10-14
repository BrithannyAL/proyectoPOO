package Clases;

import Cursos.Cursos;

public class Calificacion {
    private int nota;
    private Cursos curso;

    public Calificacion(int n, Cursos c){
        this.nota = n;
        this.curso = c;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Cursos getCurso() {
        return curso;
    }

    public void setCurso(Cursos curso) {
        this.curso = curso;
    }
}

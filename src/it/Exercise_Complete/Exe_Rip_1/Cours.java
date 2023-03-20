package it.Exercise_Complete.Exe_Rip_1;

import java.util.ArrayList;
import java.util.List;

public class Cours {
    /**
     * Progettare una classe Corso che permetta di memorizzare:
     * - Nome del corso
     * - Crediti formativi
     * - Studenti iscritti
     */
    /**
     * ● Implementare un costruttore che inizializzi solamente il nome e il numero di
     * crediti.
     * ● Implementare i getter e i setter per ciascuna variabile.
     * ● Realizzare un metodo che stampi gli studenti iscritti al corso.
     * ● Realizzare un metodo per aggiungere uno studente agli studenti iscritti al
     * corso.
     * ● Realizzare un metodo che prenda in input una lista di corsi e che dia in output
     * il numero di crediti totali corrispondenti.
     * ● Realizzare un metodo ControllaIscrizioneStudente che prenda in input uno
     * studente e restituisca se lo studente è presente o meno tra gli iscritti
     * ● Realizzare un metodo che permetta la ricerca in base ad una stringa passata
     * in input (keySearch) e che ritorni una lista di studenti coerenti con la ricerca
     * effettuata.
     */

    private String courseClass;
    private int credits;
    private List<Student> students;

    public Cours(String courseClass, int credits) {
        this.courseClass = courseClass;
        this.credits = credits;
        this.students = new ArrayList<Student>();
    }

    public String getCourseClass() {
        return courseClass;
    }

    public void setCourseClass(String courseClass) {
        this.courseClass = courseClass;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void printStudent() {
        System.out.println(students);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public static void totalCredits(List<Cours> courses) {
        int total = 0;

        for (int i = 0; i < courses.size(); i++) {
            total += courses.get(i).getCredits();
        }
        System.out.println(total);
    }

    public boolean present(Student student) {
        return students.contains(student);
    }

    public static List<Student> search(List<Student> students, String keySearch) {

        List<Student> result = new ArrayList<Student>();
        for (Student student : students) {
            String fullName = student.getName() + " " + student.getCognome();
            if (fullName.toLowerCase().contains(keySearch.toLowerCase())){
                result.add(student);
            }
        }
        return result;
    }
}

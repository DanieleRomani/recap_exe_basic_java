package it.Exe_Rip_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /**
     * ) Creare una classe Main nella quale:
     * ● Istanziare 3 oggetti di tipo Studenti usando i 2 costruttori creati.
     * ● Istanziare due oggetti di tipo Corso A e B iscrivendo gli studenti creati.
     * ● Stampare per entrambi i corsi gli studenti iscritti.
     * ● Creare un nuovo corso C e calcolare la somma dei CFU dei 3 corsi A, B e C.
     * ● Aggiungere un nuovo Studente al corso C e stampare la nuova lista degli
     * iscritti
     * ● Verificare che il nuovo studente sia stato correttamente iscritto al corso C e
     * che non sia presente tra gli iscritti dei corsi precedenti A e B.
     * ● Utilizzare il metodo di ricerca per provare a fare una ricerca all’interno di un
     * corso.
     */
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Student mario = new Student("mario", "rossi", 25, "via cesari");
        Student franco = new Student("franco", "bianchi",22,"via cesari");
        Student ciccio = new Student();
        ciccio.setName("ciccio");
        ciccio.setCognome("DAJJJE");
        ciccio.setIndirizzo("via cesari");
        ciccio.setNumMatricola(29);
        Cours a = new Cours("A", 10);
        Cours b = new Cours("B", 16);

        students.add(mario);
        students.add(ciccio);
        students.add(franco);

        a.addStudent(mario);
        a.addStudent(franco);
        a.printStudent();

        b.addStudent(ciccio);
        b.printStudent();

        Cours c = new Cours("C", 16);

        List<Cours> courses = new ArrayList<Cours>();
        courses.add(c);
        courses.add(b);
        courses.add(a);

        Cours.totalCredits(courses);

        Student gennaro = new Student("Gennaro", "bullo", 12, "via cesari");
        c.addStudent(gennaro);
        c.printStudent();

        students.add(gennaro);

        System.out.println(a.present(gennaro));
        System.out.println(b.present(gennaro));
        System.out.println(c.present(gennaro));

        List<Student> studentiCercati = Cours.search(students, "u");
        System.out.println(studentiCercati);
    }
}
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
        List<ClassStudent> students = new ArrayList<>();

        ClassStudent mario = new ClassStudent("mario", "rossi", 25, "via le man dal c");
        ClassStudent franco = new ClassStudent("franco", "bianchi",22,"via le man dal m");
        ClassStudent ciccio = new ClassStudent();
        ciccio.setName("ciccio");
        ciccio.setCognome("DAJJJE");
        ciccio.setIndirizzo("via le man dal cul");
        ciccio.setNumMatricola(29);
        ClassCours a = new ClassCours("A", 10);
        ClassCours b = new ClassCours("B", 16);

        students.add(mario);
        students.add(ciccio);
        students.add(franco);

        a.addStudent(mario);
        a.addStudent(franco);
        a.printStudent();

        b.addStudent(ciccio);
        b.printStudent();

        ClassCours c = new ClassCours("C", 16);

        List<ClassCours> courses = new ArrayList<ClassCours>();
        courses.add(c);
        courses.add(b);
        courses.add(a);

        ClassCours.totalCredits(courses);

        ClassStudent gennaro = new ClassStudent("Gennaro", "bullo", 12, "via le man dal cul");
        c.addStudent(gennaro);
        c.printStudent();

        students.add(gennaro);

        System.out.println(a.present(gennaro));
        System.out.println(b.present(gennaro));
        System.out.println(c.present(gennaro));

        List<ClassStudent> studentiCercati = ClassCours.search(students, "u");
        System.out.println(studentiCercati);
    }
}
package it.develhope.SIZE.Exe_20;

public class Exe_20 {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    /**
     * 1: Copy over the student class
     *
     *    Make sure there are 5 fields inside, if they are not simply create some more.
     *    make every field private first.
     *
     *    Then create getters and setters for each of these 5 fields.
     *
     *    Once ready use all 5 below
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");

        // Write and use your 5 getters and setters!
        Student student = new Student();
        student.setName("Giulio");
        student.setSurname("Pastore");
        student.setAge(18);
        student.setBirthDate(30);
        student.setMonthBirthDay(11);
        System.out.println("Name = " + student.getName() + " Surname = " + student.getSurname() + " Student age = " +
                student.getAge() + " Day Birthday = " + student.getBirthDate() + " Mounth Birthday = " +
                student.getMonthBirthDay());
    }

    /**
     * 2: Create 3 setter constraints for the student class
     *
     *    Think about what reasonably constraints are?
     *
     *    Should a student be able to be a negative age?
     *
     *    Create a counter for one of the getters, try to think about
     *    what other code could be inside a getter? Why not write it?
     */
    public static void exercise2() {
        System.out.println("\nExercise 2:");

        //Write your code here
        Student student = new Student();

        student.setName(""); ;
        student.setAge(135);
        student.setBirthDate(32);

        System.out.println("Name = " + student.getName() + " Student age = " +
                student.getAge() + " Day Birthday = " + student.getBirthDate());

    }
}
//"Correzione 2: ok il controllo nei due setter, ma vorrei che, qualora si passasse un'età o un nome non valido al setter, " +
//        "questo stampasse un errore e "non settasse il valore dell'attributo sempre e comunque". Ad esempio, con la classe che hai
//        implementato tu, se io eseguissi le istruzioni sotto, avrei un'età di -32 per l'oggetto student, il che ovviamente è sbagliato!
//        Student student = new Student();
//        student.setName("Daniele"); ; student.setAge(-32);
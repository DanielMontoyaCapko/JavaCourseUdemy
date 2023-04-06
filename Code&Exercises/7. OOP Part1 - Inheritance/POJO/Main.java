public class Main {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            Student s = new Student(43218 + i,
                    switch (i){
                        case 1 -> "Mary";
                        case 2 -> "Maya";
                        case 3 -> "Alice";
                        case 4 -> "Eugeo";
                        case 5 -> "Eydis";
                        default -> "No";
                    },
                    "5/7/1999",
                    2);
            System.out.println(s);
        }
        // Part 2
        
        Student pojoStudent = new Student(3214, "Ann","5/7/1999",3);
        LPAStudent recordStudent = new LPAStudent(3214, "Jacob","5/7/1999",3);

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList() + 3);

        System.out.println(pojoStudent.getName() + " list " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " list " + recordStudent.classList());
    }
}

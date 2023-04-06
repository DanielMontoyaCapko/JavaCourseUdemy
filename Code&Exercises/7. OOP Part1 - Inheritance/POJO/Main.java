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
    }
}

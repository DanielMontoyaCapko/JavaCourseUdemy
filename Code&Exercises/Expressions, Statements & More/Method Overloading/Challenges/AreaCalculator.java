public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0,4.0));
        System.out.println(area(-1.0,4.0));
    }

    public static double area(double radius) {
        return radius < 0 ? -1 : Math.pow(radius,2) * Math.PI;
    }

    public static double area(double side1, double side2){
        return (side1 < 0 || side2 < 0) ? -1 : side1 * side2;
    }
}

//    public static double area(double radius) {
//        return radius < 0 ? -1 : Math.pow(radius,2) * Math.PI;
//        if (radius < 0){
//            totalArea = -1;
//        } else {
//            totalArea = Math.pow(radius,2) * Math.PI;
//        }
//        return totalArea;
//    }
//
//    public static double area(double side1, double side2){
//        return (side1 < 0 || side2 < 0) ? -1 : side1 * side2;
//        double totalArea;
//        if(side1 < 0 || side2 < 0){
//            totalArea = -1;
//        } else {
//            totalArea = side1 * side2;
//        }
//        return  totalArea;

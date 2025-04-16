package randomProjects;
class calculator{
    private double num1;
    private double num2;
    public calculator(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public double add(double num1, double num2){
        try{
            if(num1 < 0 || num2 < 0){
                throw new IllegalArgumentException("Negative numbers are not allowed.");
            }else{
                return num1 + num2;
            }
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            return 0.0;
        }   
        
    }
    public double subtract(double num1, double num2){
        try{
            if(num1 < 0 || num2 < 0){
                throw new IllegalArgumentException("Negative numbers are not allowed.");
            }else{
                return num1 - num2;
            }
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            return 0.0;
        } 
    }
    public double multiply(double num1, double num2){
        try{
            if(num1 < 0 || num2 < 0){
                throw new IllegalArgumentException("Negative numbers are not allowed.");
            }else{
                return num1 * num2;
            }
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            return 0.0;
        } 
    }   
    public double divide(double num1, double num2){ 
        try{
            if(num2 == 0){
                throw new ArithmeticException("Division by zero is not allowed.");
            }else{
                try{
                    if(num1 < 0 || num2 < 0){
                        throw new IllegalArgumentException("Negative numbers are not allowed.");
                    }else{
                        return num1 / num2;
                    }
                }catch(IllegalArgumentException e){
                    System.out.println(e.getMessage());
                    return 0.0;
                } 
            }
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
            return 0.0;
        }
    }
}



public class safeCalculator {
    public static void main(String[] args) {
        calculator calc = new calculator(10, 5);
        System.out.println("Addition: " + calc.add(10, 5));
        System.out.println("Subtraction: " + calc.subtract(10, 5));
        System.out.println("Multiplication: " + calc.multiply(10, 5));
        System.out.println("Division: " + calc.divide(10, 0)); // Division by zero
        System.out.println("Negative Addition: " + calc.add(-10, 5)); // Negative number
        System.out.println("Negative Subtraction: " + calc.subtract(10, -5)); // Negative number
        System.out.println("Negative Multiplication: " + calc.multiply(-10, 5)); // Negative number
        System.out.println("Negative Division: " + calc.divide(10, -5)); // Negative number
        System.out.println("Negative Division: " + calc.divide(-10, -5)); // Negative number
        System.out.println("Negative Division: " + calc.divide(-10, 0)); // Negative number
        System.out.println("Negative Division: " + calc.divide(10, -0)); // Negative number
        
    }

      
    
}

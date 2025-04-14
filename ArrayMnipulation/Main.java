import java.util.Arrays;
class GradeManager{
    static void printGrades(int[] grades){
        System.out.println(Arrays.toString(grades));
        for(int grade: grades){
            System.out.println(grade);
        }
        System.out.println();
    }
    static int[] sortGrades(int[] grades){
        Arrays.sort(grades);
        return grades;
    }
    static int searchGrade(int[] grades, int target){
        for(int i=0; i< grades.length; i++){
            if(grades[i] == target){
                return i;
            }
        }
        System.out.println("Grade not found");
        return -1;
    }
    static int getGrade(int[] grades, int index){
        try{
            if(index < 0 || index >= grades.length){
                throw new ArrayIndexOutOfBoundsException("Index out of bounds");
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("error occurred");
        }
        return grades[index];
    }
}

public class Main {
    public static void main(String[] args) {
        GradeManager manager = new GradeManager();
        int[] grades = {85, 90, 78, 92, 88};

        System.out.println("original Grades:");
        manager.printGrades(grades);

        System.out.println("Sorted grades: ");
        manager.printGrades(manager.sortGrades(grades));

        System.out.println("Index of grade 90: " + manager.searchGrade(grades, 90));
        System.out.println("Grade at index 10: " + manager.getGrade(grades, 10));

    }
}
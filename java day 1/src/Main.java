//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int marks = 95;

        if (marks > 90) {
            System.out.println("A1 Grade");
            String grade = "A1";
        } else if (marks > 80 && marks <= 90) {
            System.out.println("A Grade");
            String grade = "A";
        } else if (marks > 70 && marks <= 80) {
            System.out.println("B Grade");
            String grade = "B";
        } else if (marks <= 70) {
            System.out.println("not cleared");
            String grade = "0";
        }

        String grade = "";
        switch (grade) {
            case "A1":
                System.out.println("Excellent");
        }


    }

}

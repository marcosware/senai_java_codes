package ExFixacao_TresProgramas;

public class Student {
    String name;
    float firstGrade;
    float secondGrade;
    float thirdGrade;

    public Student(String name, float firstGrade, float secondGrade, float thirdGrade) {
        this.name = name;
        this.firstGrade = firstGrade;
        this.secondGrade = secondGrade;
        this.thirdGrade = thirdGrade;
    }

    public float FinalGrade() {
        return(this.firstGrade+this.secondGrade+this.thirdGrade);
    }

    public String Situation() {
        String result;
        if(this.FinalGrade() > 60) {
            result = "PASS";
        }
        else{
            result = "FAILED\nMISSING " + this.MissingPoints() + " POINTS";
        }
        return result;
    }

    private String MissingPoints() {
        return(String.format("%.2f", 60 - this.FinalGrade()));
    }
}

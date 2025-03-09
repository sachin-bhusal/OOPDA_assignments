package Lab14;

public class Grade {
    private int number;

    public Grade() {
        this.number = 0;
    }

    public Grade(int number) {
        this.number = number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getLetter() {
        if (number >= 88 && number <= 100) return "A";
        else if (number < 88 && number >= 80) return "B";
        else if (number < 80 && number >= 67) return "C";
        else if (number < 67 && number >= 60) return "D";
        else return "F";
    }
}
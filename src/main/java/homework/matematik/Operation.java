package homework.matematik;

public enum Operation {
    SUM('+'),SUB('-'), MULT('*'), DIV('/');

    private char operation;

    Operation(char operation) {
        this.operation = operation;
    }

    @Override
    public String toString() {
        return " "+operation;
    }
}

import java.util.ArrayList;

interface Command {
    double execute(double currentValue);
    double undo(double currentValue);
    String describe();
}

class AddCommand implements Command {
    private double operand;

    public AddCommand(double operand) {
        this.operand = operand;
    }

    @Override
    public double execute(double currentValue) {
        // TODO: return currentValue + operand
        return 0;
    }

    @Override
    public double undo(double currentValue) {
        // TODO: return currentValue - operand
        return 0;
    }

    @Override
    public String describe() {
        // TODO: return "+ [operand]" with 1 decimal place
        return "";
    }
}

class MultiplyCommand implements Command {
    private double operand;

    public MultiplyCommand(double operand) {
        this.operand = operand;
    }

    @Override
    public double execute(double currentValue) {
        // TODO: return currentValue * operand
        return 0;
    }

    @Override
    public double undo(double currentValue) {
        // TODO: return currentValue / operand
        return 0;
    }

    @Override
    public String describe() {
        // TODO: return "* [operand]" with 1 decimal place
        return "";
    }
}

class Calculator {
    private double value;
    private ArrayList<Command> history;

    public Calculator() {
        this.value = 0;
        this.history = new ArrayList<>();
    }

    /**
     * Applies a command, updates the value, and records it in history.
     */
    public void apply(Command cmd) {
        // TODO: Execute the command and record it
    }

    /**
     * Undoes the most recent command. Does nothing if history is empty.
     */
    public void undo() {
        // TODO: Undo the last command and remove from history
    }

    /**
     * Returns the current value.
     */
    public double getValue() {
        return value;
    }

    /**
     * Returns a list of command descriptions in order applied.
     */
    public ArrayList<String> getHistory() {
        // TODO: Build list from command descriptions
        return new ArrayList<>();
    }
}

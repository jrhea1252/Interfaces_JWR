public class Process implements Priority, Comparable<Process> {
    private String id;
    private int priority;

    public Process(String id) {
        this.id = id;
        this.priority = MED_PRIORITY;  // This will be the default priority
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void setPriority(int priority) {
        if (priority >= MIN_PRIORITY && priority <= MAX_PRIORITY) {
            this.priority = priority;
        }
    }

    @Override
    public int getPriority() {
        return priority;
    }

    @Override
    public int compareTo(Process other) {
        return Integer.compare(this.priority, other.priority);
    }

    @Override
    public String toString() {
        return "Process{" +
                "id='" + id + '\'' +
                ", priority=" + priority +
                '}';
    }
}
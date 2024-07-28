public class Task implements Priority, Comparable<Task> {
    public enum Status {
        NOT_STARTED, IN_PROCESS, COMPLETE
    }

    private String name;
    private int priority;
    private Status status;

    public Task(String name) {
        this.name = name;
        this.priority = MED_PRIORITY;  // This is the default priority
        this.status = Status.NOT_STARTED;  // This is the default status
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
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
    public int compareTo(Task other) {
        return Integer.compare(this.priority, other.priority);
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", priority=" + priority +
                ", status=" + status +
                '}';
    }
}

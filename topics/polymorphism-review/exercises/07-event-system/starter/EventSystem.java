import java.util.ArrayList;

interface EventListener {
    void onEvent(String eventName, String data);
    String getListenerName();
}

class LogListener implements EventListener {
    private String name;
    private ArrayList<String> log;

    public LogListener(String name) {
        this.name = name;
        this.log = new ArrayList<>();
    }

    @Override
    public void onEvent(String eventName, String data) {
        // TODO: Record "[eventName]: [data]" in the log
    }

    @Override
    public String getListenerName() {
        return name;
    }

    public ArrayList<String> getLog() {
        // TODO: Return a copy of the log
        return new ArrayList<>();
    }
}

class CountListener implements EventListener {
    private String name;
    private int count;

    public CountListener(String name) {
        this.name = name;
        this.count = 0;
    }

    @Override
    public void onEvent(String eventName, String data) {
        // TODO: Increment count
    }

    @Override
    public String getListenerName() {
        return name;
    }

    public int getCount() {
        return count;
    }
}

class EventBus {
    private ArrayList<EventListener> listeners;

    public EventBus() {
        listeners = new ArrayList<>();
    }

    public void register(EventListener listener) {
        // TODO: Add the listener
    }

    public void unregister(String listenerName) {
        // TODO: Remove the listener with the given name
    }

    public void fire(String eventName, String data) {
        // TODO: Notify all registered listeners
    }

    public int listenerCount() {
        // TODO: Return the number of listeners
        return 0;
    }
}

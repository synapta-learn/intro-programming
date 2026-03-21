# Event System

## Problem

Build a simple event system where listeners can register for events and receive notifications when events are fired.

### EventListener (interface)
- `void onEvent(String eventName, String data)` — called when an event is fired
- `String getListenerName()` — returns the listener's name

### LogListener (implements EventListener)
- Constructor: `LogListener(String name)`
- `onEvent(String eventName, String data)` — records the event. Stores `"[eventName]: [data]"` in an internal log list.
- `getListenerName()` — returns the name
- `getLog()` — returns a new `ArrayList<String>` copy of all recorded events

### CountListener (implements EventListener)
- Constructor: `CountListener(String name)`
- `onEvent(String eventName, String data)` — increments a counter (ignores data)
- `getListenerName()` — returns the name
- `getCount()` — returns the number of events received

### EventBus
- Constructor: `EventBus()`
- `register(EventListener listener)` — adds a listener
- `unregister(String listenerName)` — removes the listener with the given name
- `fire(String eventName, String data)` — notifies all registered listeners
- `listenerCount()` — returns how many listeners are registered

## Examples

```java
EventBus bus = new EventBus();
LogListener log = new LogListener("Logger");
CountListener counter = new CountListener("Counter");

bus.register(log);
bus.register(counter);
bus.listenerCount();  // 2

bus.fire("login", "user123");
bus.fire("click", "button_ok");

log.getLog();      // ["login: user123", "click: button_ok"]
counter.getCount();  // 2

bus.unregister("Counter");
bus.fire("logout", "user123");
counter.getCount();  // still 2 (unregistered)
log.getLog();        // ["login: user123", "click: button_ok", "logout: user123"]
```

## Hints

- EventBus stores listeners in an `ArrayList<EventListener>`
- `fire` loops through all listeners and calls `onEvent` on each
- `unregister` finds and removes the listener by matching `getListenerName()`

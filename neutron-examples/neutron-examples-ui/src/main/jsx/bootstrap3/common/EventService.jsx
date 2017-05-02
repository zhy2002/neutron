class EventService {
}

const map = {};

EventService.subscribe = (eventName, listener) => {
    if (!map[eventName]) {
        map[eventName] = [];
    }
    map[eventName].push(listener);
};

EventService.fire = (eventName, parameters) => {
    if (map[eventName]) {
        map[eventName].forEach((listener) => {
            listener(parameters);
        });
    }
};

export default EventService;
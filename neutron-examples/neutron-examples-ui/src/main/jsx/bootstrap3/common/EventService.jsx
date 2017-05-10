class EventService {
}

const map = {};

EventService.subscribe = (eventName, listener) => {
    if (!map[eventName]) {
        map[eventName] = [];
    }
    map[eventName].push(listener);
};

EventService.unsubscribe = (eventName, listener) => {
    const list = map[eventName];
    if (list) {
        for (let i = 0; i < list.length; i++) {
            if (list[i] === listener) {
                list.splice(i, 1);
                break;
            }
        }
    }
};

EventService.fire = (eventName, parameters) => {
    if (map[eventName]) {
        map[eventName].forEach((listener) => {
            listener(parameters);
        });
    }
};

export default EventService;

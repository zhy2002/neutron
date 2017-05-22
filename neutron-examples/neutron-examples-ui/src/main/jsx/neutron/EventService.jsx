const map = {};

/**
 * A simple global event service implementation.
 */
export default class EventService {

    constructor() {
        throw new Error('EventService class is static.');
    }

    static subscribe(eventName, listener) {
        if (!map[eventName]) {
            map[eventName] = [];
        }
        map[eventName].push(listener);
    }

    static unsubscribe(eventName, listener) {
        const list = map[eventName];
        if (list) {
            for (let i = 0; i < list.length; i++) {
                if (list[i] === listener) {
                    list.splice(i, 1);
                    break;
                }
            }
        }
    }

    static fire(fireOptions, ...parameters) {
        let eventName;
        let delay;

        if (typeof fireOptions === 'object') {
            eventName = fireOptions.name;
            delay = fireOptions.delay;

            if (delay === undefined) {
                delay = null;
            }
        } else {
            eventName = fireOptions;
            delay = null;
        }
        if (!eventName) {
            throw new Error('Event name is not provided.');
        }
        if (!(delay === null || typeof delay === 'number' && !isNaN(delay))) {
            throw new Error(`Event delay must be a number but got ${delay}`);
        }

        if (!map[eventName]) {
            console.debug(`No listener found for event ${eventName}`);
            return;
        }

        const callListeners = () => {
            map[eventName].forEach((listener) => {
                listener(...parameters);
            });
        };
        if (delay === null) {
            callListeners();
        } else {
            setTimeout(callListeners, delay);
        }
    }
}

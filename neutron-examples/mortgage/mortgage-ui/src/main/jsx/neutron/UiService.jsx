import EventService from './EventService';
import StaticService from './StaticService';
import CommonUtil from './CommonUtil';

let loadingCount = 0;
const demoUser = {
    username: 'Demo User'
};

function* propertyIterator(obj, cache) {
    for (const name in obj) {
        if (Object.prototype.hasOwnProperty.call(obj, name)) {
            if (!(name in cache)) {
                const node = obj[name];
                if (node) {
                    cache[name] = new JsNodeIdentity(name, node);
                } else {
                    cache[name] = null;
                }
            }
            yield cache[name];
        }
    }
}

class JsNodeIdentity {

    constructor(name, node) {
        this.name = name;
        this.node = node;
    }

    getLocalId() {
        return this.node.$id;
    }

    getName() {
        return this.name;
    }

    getValue() {
        return this.node.value;
    }

    getNodeIdentityMap() {
        if (!this.childIdentityMap) {
            this.childIdentityMap = new JsNodeIdentityMap(this.node.children);
        }
        return this.childIdentityMap;
    }
}

class JsNodeIdentityMap {

    constructor(children) {
        this.children = children || {};
        this.map = {};
        this.iterator = null;
    }

    get(nodeName) {
        const name = CommonUtil.toFieldName(nodeName);
        if (!(name in this.map)) {
            const node = this.children[name];
            if (node) {
                this.map[name] = new JsNodeIdentity(nodeName, node);
            } else {
                this.map[name] = null;
            }
        }
        return this.map[name];
    }

    next() {
        if (!this.iterator) {
            this.iterator = propertyIterator(this.children, this.map);
        }
        const item = this.iterator.next();
        if (item.done) {
            this.iterator = null;
            return null;
        }
        return item.value;
    }
}

export default class UiService extends StaticService {

    static createNodeDataStore(node) {
        return new window.GWT.NodeDataStore(node.children.id.value, new JsNodeIdentity('', node));
    }

    static setPath(model, path) {
        const context = model.getContext();
        if (typeof path === 'string') {
            context.beginSession();
            const success = model.selectDescendant(path); //this handles ...[?selected=tabName]
            context.commitSession();
            if (!success) {
                EventService.fire({
                    name: 'state_partially_synced',
                    delay: 50
                });
            }
        }
        return CommonUtil.defer(model);
    }

    static setIsLoading(isLoading) {
        const items = document.getElementsByClassName('loading-spinner-component');
        if (items.length === 0)
            return;
        loadingCount += isLoading ? 1 : -1;
        const spinner = items.item(0);
        if (loadingCount === 1) {
            spinner.classList.remove('hide');
        } else if (loadingCount === 0) {
            spinner.classList.add('hide');
        }
        console.debug(`IsLoading: ${isLoading}`);
    }

    static getCurrentUser() {
        return demoUser;
    }
}

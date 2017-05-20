import moment from 'moment';
import StorageService from './StorageService';
import CommonUtil from './CommonUtil';


function cleanUp(nodeName) {
    let fieldName = nodeName;
    if (fieldName.endsWith('Node')) {
        fieldName = fieldName.substr(0, fieldName.length - 4);
    }
    return fieldName;
}

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
        const name = cleanUp(nodeName);
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

class UiService {
}

function createLodgementNode() {
    return window.GWT.LodgementNodeFactory.create();
}

function createNodeDataStore(node) {
    return new GWT.NodeDataStore(node.children.id.value, new JsNodeIdentity('', node));
}

let lodgementNode = null;

UiService.getLodgementNode = () => {
    if (lodgementNode === null) {
        lodgementNode = createLodgementNode();
    }

    return lodgementNode;
};

UiService.refreshApplicationList = () => {
    StorageService.getApplicationSummaries().then(
        (data) => {
            const appListNode = lodgementNode.getAppManagerNode().getApplicationListNode();
            appListNode.data = data;
            appListNode.totalCount = data.hits.total;
            appListNode.setUpdated(true);
        }
    );
};

//todo pass the lender to create application for.
UiService.createApplicationNode = () => {
    const model = window.GWT.ApplicationNodeFactory.create();

    model.getIdNode().setValue(model.getContext().getContextId());

    const user = UiService.getCurrentUser();
    model.getOwningUserNode().setValue(user.username);

    model.getStatusNode().setValue('In Progress');

    model.getLenderNode().setValue('NAB');

    const now = moment().format();
    model.getDateCreatedNode().setValue(now);

    return CommonUtil.defer(model);
};

function loadData(model, node, path) {
    const context = model.getContext();
    context.beginSession();
    model.setLoading(true);
    CommonUtil.setValue(model, node);
    model.setLoading(false);
    context.commitSession();
    if (typeof path === 'string') {
        model.getContext().beginSession();
        model.selectDescendant(path); //this handles ...[?selected=tabName]
        model.getContext().commitSession();
    }
    return CommonUtil.defer(model);
}

UiService.cloneApplicationNode = (node, path) => {
    node.children.id.value = null;
    const nodeDataStore = createNodeDataStore(node);
    const model = window.GWT.ApplicationNodeFactory.restore(nodeDataStore);
    node.children.id.value = model.getContext().getContextId();
    return CommonUtil.defer(model).then(m => loadData(m, node, path));
};


UiService.restoreApplicationNode = (node, path) => {
    //todo open for different lenders
    const nodeDataStore = createNodeDataStore(node);
    const model = window.GWT.ApplicationNodeFactory.restore(nodeDataStore);
    return CommonUtil.defer(model).then(m => loadData(m, node, path));
};

const demoUser = {
    username: 'Demo User'
};

UiService.getCurrentUser = () => demoUser;

export default UiService;

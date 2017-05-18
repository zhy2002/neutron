import moment from 'moment';
import StorageService from './StorageService';
import CommonUtil from './CommonUtil';


class UiService {
}

function createLodgementNode() {
    return window.GWT.LodgementNodeFactory.create();
}

function createNodeDataStore(node) {
    //todo
    return new GWT.NodeDataStore(node.id, null);
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

UiService.cloneApplicationNode = (node, path) => UiService.createApplicationNode()
    .then(model => loadData(model, node, path));

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

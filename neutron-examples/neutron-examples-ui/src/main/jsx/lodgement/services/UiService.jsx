import moment from 'moment';
import StorageService from './StorageService';

class UiService {
}

function createLodgementNode() {
    return window.GWT.LodgementNodeFactory.create();
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

let cba = false;

UiService.createApplicationNode = () => {
    const node = cba ? window.GWT.ApplicationNodeFactory.createCba() : window.GWT.ApplicationNodeFactory.create();
    node.getIdNode().setValue(node.getUniqueId());
    const user = UiService.getCurrentUser();
    node.getOwningUserNode().setValue(user.username);
    node.getStatusNode().setValue('In Progress');
    if (cba) {
        node.getLenderNode().setValue('CBA');
        node.setNodeLabel('CBA');
    } else {
        node.getLenderNode().setValue('NAB');
        node.setNodeLabel('NAB');
    }
    const now = moment().format();
    node.getDateCreatedNode().setValue(now);

    cba = !cba;
    return node;
};

const demoUser = {
    username: 'Demo User'
};

UiService.getCurrentUser = () => demoUser;

export default UiService;

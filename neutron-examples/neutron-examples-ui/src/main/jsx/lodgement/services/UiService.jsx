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
            appListNode.setUpdated(true);
        }
    );
};

UiService.createApplicationNode = () => {
    const node = window.GWT.ApplicationNodeFactory.create();
    node.getIdNode().setValue(node.getUniqueId());
    const user = UiService.getCurrentUser();
    node.getOwningUserNode().setValue(user.username);
    node.getStatusNode().setValue('In Progress');
    node.getLenderNode().setValue('NAB');
    node.setNodeLabel('NAB');
    const now = moment().format();
    node.getDateCreatedNode().setValue(now);

    return node;
};

const demoUser = {
    username: 'Demo User'
};

UiService.getCurrentUser = () => demoUser;

export default UiService;

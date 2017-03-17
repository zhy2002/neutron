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
    node.setNodeLabel('NAB');
    return node;
};

export default UiService;

import moment from 'moment';
import UiService from '../../neutron/UiService';
import EventService from '../../neutron/EventService';
import StaticService from '../../neutron/StaticService';
import CommonUtil from '../../neutron/CommonUtil';
import StorageService from './StorageService';

let globalUiStateNode = null;
const appTabOffset = 1; //the first is app manager tab

function createGlobalUiStateNode() {
    return window.GWT.GlobalUiStateNodeFactory.create();
}

function isAppOpen(id) {
    //check if app is already opened
    const openApps = globalUiStateNode.getOpenAppsNode().getChildren().map(c => c.getValue());
    for (let i = 0; i < openApps.length; i++) {
        const app = openApps[i];
        if (app.getIdNode().getValue() === id) {
            return i;
        }
    }
    return -1;
}

function createAppTab(newApp) {
    globalUiStateNode.dispatchAddOpenAppAction(newApp);

    newApp.getContext().setDirtyCheckEnabled(true);
    console.log('Enabled dirty checking for app');

    return CommonUtil.defer(newApp);
}

function createApplicationNode(profileName) {
    const model = window.GWT.createApplicationNode(profileName, null);

    model.getIdNode().setValue(model.getContext().getContextId());
    model.getLenderNode().setValue(profileName);

    const user = UiService.getCurrentUser();
    model.getOwningUserNode().setValue(user.username);

    model.getStatusNode().setValue('In Progress');

    const now = moment().format();
    model.getDateCreatedNode().setValue(now);

    return CommonUtil.defer(model);
}

function cloneApplicationNode(node, path, profileName) {
    node.children.id.value = null;
    const nodeDataStore = UiService.createNodeDataStore(node);
    const model = window.GWT.createApplicationNode(profileName, nodeDataStore);
    return CommonUtil.defer(model).then(m => UiService.setPath(m, path));
}

function restoreApplicationNode(node, path) {
    const nodeDataStore = UiService.createNodeDataStore(node);
    const profileName = node.children.lender.value;
    const model = window.GWT.createApplicationNode(profileName, nodeDataStore);
    return CommonUtil.defer(model).then(m => UiService.setPath(m, path));
}

function showLenderList() {
    return new Promise((resolve, reject) => {
        EventService.fire('show_lender_list', {resolve, reject});
    });
}

/**
 * A wrapper of global application states.
 */
export default class LodgementService extends StaticService {

    static newApp() {
        return showLenderList().then(profileName => createApplicationNode(profileName).then(createAppTab));
    }

    static loadApplicationNode(id, path) {
        return StorageService.getApplication(id).then(node => restoreApplicationNode(node, path));
    }

    static openApp(appId, path) {
        let id = null;
        if (typeof appId === 'string') {
            id = appId;
        }
        if (!id) {
            id = globalUiStateNode.getAppManagerNode().getCurrentAppId();
            if (!id) {
                alert('No application is selected.');
                return CommonUtil.defer(null);
            }
        }

        //check if app is already opened
        const appIndex = isAppOpen(id);
        if (appIndex >= 0) {
            console.debug('app is already loaded');
            LodgementService.selectTab(appIndex + appTabOffset);
            return CommonUtil.defer(null);
        }

        //load existing app
        UiService.setIsLoading(true);
        return LodgementService.loadApplicationNode(id, path)
            .then(createAppTab)
            .then(
                (model) => {
                    UiService.setIsLoading(false);
                    return CommonUtil.defer(model);
                }
            )
            .catch(
                (error) => {
                    UiService.setIsLoading(false);
                    return Promise.reject(error);
                }
            );
    }

    static cloneApp(appId, path, profile = 'BankB') {
        let id = null;
        if (typeof appId === 'string') {
            id = appId;
        }
        if (!id) {
            id = globalUiStateNode.getAppManagerNode().getCurrentAppId();
            if (!id) {
                alert('No application is selected.');
                return CommonUtil.defer(null);
            }
        }

        UiService.setIsLoading(true);
        return StorageService.getApplication(id)
            .then(node => cloneApplicationNode(node, path, profile))
            .then(createAppTab)
            .then(
                (model) => {
                    UiService.setIsLoading(false);
                    return CommonUtil.defer(model);
                }
            );
    }

    static selectTab(index) {
        globalUiStateNode.setSelectedTabIndex(index);
    }

    static closeTab(tabIndex) {
        const appIndex = tabIndex - appTabOffset;
        if (appIndex < 0)
            return;

        const openApps = globalUiStateNode.getOpenAppsNode().getChildren();
        const item = openApps[appIndex];
        if (!item.getValue().isDirty() || window.confirm('You will lose your changes if you close this app.')) {
            globalUiStateNode.getOpenAppsNode().removeItem(item);
        }
    }

    static deleteApp() {
        const id = globalUiStateNode.getAppManagerNode().getCurrentAppId();
        if (!id) {
            alert('No application is selected.');
            return CommonUtil.defer(null);
        }
        if (isAppOpen(id) >= 0) {
            alert('Please close the selected application first.');
            return CommonUtil.defer(null);
        }
        return StorageService.deleteApplication(id).then(() => {
            //give elastic search time to update.
            return CommonUtil.delay(500).then(() => LodgementService.refreshApplicationList());
        });
    }

    static refreshApplicationList() {
        return StorageService.getApplicationSummaries().then(
            (data) => {
                const appListNode = globalUiStateNode.getAppManagerNode().getApplicationListNode();
                appListNode.setValue(data);
            }
        );
    }

    static updateHeaderHeight(height) {
        globalUiStateNode.setHeaderHeight(height);
    }

    static updateFooterHeight(height) {
        globalUiStateNode.setFooterHeight(height);
    }

    static getGlobalUiStateNode() {
        if (globalUiStateNode === null) {
            globalUiStateNode = createGlobalUiStateNode();
            console.debug('loaded lodgement node');
        }
        return globalUiStateNode;
    }

    static setCurrentAppId(id) {
        globalUiStateNode.getAppManagerNode().setCurrentAppId(id);
    }

}

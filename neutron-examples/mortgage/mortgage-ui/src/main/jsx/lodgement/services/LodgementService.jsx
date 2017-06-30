import moment from 'moment';
import UiService from '../../neutron/UiService';
import EventService from '../../neutron/EventService';
import StaticService from '../../neutron/StaticService';
import CommonUtil from '../../neutron/CommonUtil';
import StorageService from './StorageService';

let globalUiStateNode = null;
const appTabOffset = 1; //the first is manager manager tab

function createGlobalUiStateNode() {
    return window.GWT.GlobalUiStateNodeFactory.create();
}

function isAppOpen(id) {
    //check if manager is already opened
    const openApps = globalUiStateNode.getOpenAppsNode().getChildren().map(c => c.getValue());
    for (let i = 0; i < openApps.length; i++) {
        const app = openApps[i];
        if (app.getIdNode().getValue() === id) {
            return {index: i, model: app};
        }
    }
    return null;
}

function createAppTab(newApp) {
    globalUiStateNode.dispatchAddOpenAppAction(newApp);

    newApp.getContext().setDirtyCheckEnabled(true);
    console.log('Enabled dirty checking for application');

    return CommonUtil.defer(newApp);
}

function newEnhancedApplicationNode(profileName, dataStore) {
    const model = window.GWT.ApplicationNodeFactory.create(profileName, dataStore);
    const context = model.getContext();
    CommonUtil.enhanceContext(context);
    return model;
}

function createApplicationNode(profileName) {
    const model = newEnhancedApplicationNode(profileName, null);

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
    const model = newEnhancedApplicationNode(profileName, nodeDataStore);
    return CommonUtil.defer(model).then(m => UiService.setPath(m, path));
}

function restoreApplicationNode(node, path) {
    const nodeDataStore = UiService.createNodeDataStore(node);
    const profileName = node.children.lender.value;
    const model = newEnhancedApplicationNode(profileName, nodeDataStore);
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

    static newApplicationNode(profileName, dataStore) {
        return newEnhancedApplicationNode(profileName, dataStore);
    }

    static loadApplicationNode(id, path) {
        return StorageService.getApplication(id).then(node => restoreApplicationNode(node, path));
    }

    static newApp() {
        return showLenderList().then(profileName => createApplicationNode(profileName).then(createAppTab));
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

        //check if manager is already opened
        const result = isAppOpen(id);
        if (result && result.index >= 0) {
            console.debug('application is already loaded.');
            LodgementService.selectTab(result.index + appTabOffset);
            UiService.setPath(result.model, path);
            return CommonUtil.defer(null);
        }

        //load existing manager
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

    static deleteApp() {
        const id = globalUiStateNode.getAppManagerNode().getCurrentAppId();
        if (!id) {
            alert('No application is selected.');
            return CommonUtil.defer(null);
        }
        if (isAppOpen(id)) {
            alert('Please close the selected application first.');
            return CommonUtil.defer(null);
        }
        return StorageService.deleteApplication(id).then(() => {
            //give elastic search time to update.
            return CommonUtil.delay(500).then(() => LodgementService.refreshApplicationList());
        });
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
        if (!item.getValue().isDirty() || window.confirm('You will lose your changes if you close this application.')) {
            globalUiStateNode.getOpenAppsNode().removeItem(item);
        }
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
            console.debug('loaded application node');
        }
        return globalUiStateNode;
    }

    static setCurrentAppId(id) {
        globalUiStateNode.getAppManagerNode().setCurrentAppId(id);
    }

}

import moment from 'moment';
import UiService from '../../neutron/UiService';
import EventService from '../../neutron/EventService';
import StaticService from '../../neutron/StaticService';
import CommonUtil from '../../neutron/CommonUtil';
import StorageService from './StorageService';

let lodgementNode = null;
let openApps = [];
let selectedIndex = 0;
let headerHeight = NaN;
let footerHeight = NaN;
let currentAppId = null;
const appTabOffset = 1; //the first is app manager tab

function notifyStateChange() {
    EventService.fire('lodgement_state_change');
}

function createLodgementNode() {
    return window.GWT.LodgementNodeFactory.create();
}

function getLodgementNode() {
    if (lodgementNode === null) {
        lodgementNode = createLodgementNode();
    }

    return lodgementNode;
}

function createAppTab(newApp) {
    const newApps = [...openApps, newApp];
    openApps = newApps;
    selectedIndex = newApps.length;

    newApp.getContext().setDirtyCheckEnabled(true);
    console.log('Enabled dirty checking for app');

    notifyStateChange();
    return CommonUtil.defer(newApp);
}

//todo pass the lender to create application for.
function createApplicationNode(profileName = 'Nab') {
    const model = window.GWT.createApplicationNode(profileName, null);

    model.getIdNode().setValue(model.getContext().getContextId());

    const user = UiService.getCurrentUser();
    model.getOwningUserNode().setValue(user.username);

    model.getStatusNode().setValue('In Progress');

    const now = moment().format();
    model.getDateCreatedNode().setValue(now);

    return CommonUtil.defer(model);
}

function cloneApplicationNode(node, path, profileName = 'Nab') {
    node.children.id.value = null;
    const nodeDataStore = UiService.createNodeDataStore(node);
    const model = window.GWT.createApplicationNode(profileName, nodeDataStore);
    node.children.id.value = model.getContext().getContextId();
    return CommonUtil.defer(model).then(m => UiService.setPath(m, path));
}

function restoreApplicationNode(node, path, profileName = 'Nab') {
    //todo open for different lenders
    const nodeDataStore = UiService.createNodeDataStore(node);
    const model = window.GWT.createApplicationNode(profileName, nodeDataStore);
    return CommonUtil.defer(model).then(m => UiService.setPath(m, path));
}

/**
 * A wrapper of global application states.
 */
export default class LodgementService extends StaticService {

    static newApp() {
        return createApplicationNode().then(createAppTab);
    }

    static openApp(appId, path) {
        let id = null;
        if (typeof appId === 'string') {
            id = appId;
        }
        if (!id) {
            id = currentAppId;
            if (!id) {
                alert('No application is selected.');
                return CommonUtil.defer(null);
            }
        }

        //check if app is already opened
        for (let i = 0; i < openApps.length; i++) {
            const app = openApps[i];
            if (app.getIdNode().getValue() === id) {
                selectedIndex = i + appTabOffset;
                LodgementService.selectTab(selectedIndex);
                console.debug('app is already loaded');
                return CommonUtil.defer(app);
            }
        }

        //load existing app
        UiService.setIsLoading(true);
        return StorageService.getApplication(id)
            .then(node => restoreApplicationNode(node, path))
            .then(createAppTab)
            .then(
                (model) => {
                    UiService.setIsLoading(false);
                    return CommonUtil.defer(model);
                }
            );
    }

    static cloneApp(appId, path) {
        let id = null;
        if (typeof appId === 'string') {
            id = appId;
        }
        if (!id) {
            id = currentAppId;
            if (!id) {
                alert('No application is selected.');
                return CommonUtil.defer(null);
            }
        }

        CommonUtil.setIsLoading(true);
        return StorageService.getApplication(id)
            .then(node => cloneApplicationNode(node, path))
            .then(createAppTab)
            .then(
                (model) => {
                    CommonUtil.setIsLoading(false);
                    return CommonUtil.defer(model);
                }
            );
    }

    static selectTab(index) {
        selectedIndex = index;
        notifyStateChange();
    }

    static closeTab(tabIndex) {
        const appIndex = tabIndex - appTabOffset;
        if (appIndex < 0)
            return;

        if (!openApps[appIndex].isDirty() || window.confirm('You will lose your changes if you close this app.')) {
            const newApps = openApps.filter((item, i) => i !== appIndex);
            selectedIndex = Math.min(tabIndex, newApps.length);
            openApps = newApps;

            notifyStateChange();
        }
    }

    static refreshApplicationList() {
        return StorageService.getApplicationSummaries().then(
            (data) => {
                const appListNode = lodgementNode.getAppManagerNode().getApplicationListNode();
                appListNode.data = data;
                appListNode.totalCount = data.hits.total;
                appListNode.setUpdated(true);
            }
        );
    }

    static updateHeaderHeight(height) {
        headerHeight = height;
        notifyStateChange();
    }

    static updateFooterHeight(height) {
        footerHeight = height;
        notifyStateChange();
    }

    static getState() {
        if (lodgementNode === null) {
            lodgementNode = getLodgementNode();
            console.debug('loaded lodgement node');
        }
        return {
            lodgementNode,
            openApps,
            selectedIndex,
            headerHeight,
            footerHeight
        };
    }

    static setCurrentAppId(id) {
        currentAppId = id;
    }

}

import UiService from './UiService';
import CommonUtil from './CommonUtil';
import StorageService from './StorageService';


let lodgementNode = null;
let openApps = [];
let selectedIndex = 0;
let headerHeight = NaN;
let footerHeight = NaN;
let currentAppId = null;

const hashChangeHandlers = []; //notify state is changed
const appTabOffset = 1; //the first is app manager tab

function notifyStateChange() {
    hashChangeHandlers.forEach(h => h());
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

/**
 * A wrapper of global application states.
 */
export default class LodgementService {

    constructor() {
        throw new Error('Cannot instantiate LodgementService');
    }

    static newApp() {
        return UiService.createApplicationNode().then(createAppTab);
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
        CommonUtil.setIsLoading(true);
        return StorageService.getApplication(id)
            .then(node => UiService.restoreApplicationNode(node, path))
            .then(createAppTab)
            .then(
                (model) => {
                    CommonUtil.setIsLoading(false);
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
            .then(node => UiService.cloneApplicationNode(node, path))
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
            lodgementNode = UiService.getLodgementNode();
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

    static addHashChangeHandler(func) {
        hashChangeHandlers.push(func);
    }

    static removeHashChangeHandler(func) {
        const index = hashChangeHandlers.indexOf(func);
        if (index >= 0) {
            hashChangeHandlers.splice(index, 1);
        }
    }

}

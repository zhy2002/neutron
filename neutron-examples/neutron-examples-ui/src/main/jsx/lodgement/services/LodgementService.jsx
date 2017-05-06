import UiService from './UiService';
import CommonUtil from './CommonUtil';
import StorageService from './StorageService';


let lodgementNode = null;
let openApps = [];
let selectedIndex = 0;

const hashChangeHandlers = []; //notify state is changed
const appTabOffset = 1; //the first is app manager tab

function notifyStateChange() {
    hashChangeHandlers.forEach(h => h());
}

function createAppModel(node, path) {
    const model = UiService.createApplicationNode();
    const context = model.getContext();
    context.beginSession();
    CommonUtil.setValue(model, node);
    context.commitSession();
    console.debug(`loaded app ${node.id}`);

    if (path) {
        model.getContext().beginSession();
        model.selectDescendant(path); //this handles ...[?selected=tabName]
        model.getContext().commitSession();
        console.debug(`selected path ${path}`);
    }

    return CommonUtil.defer(model);
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
        const newApp = UiService.createApplicationNode();
        console.debug('created new app');
        return createAppTab(newApp);
    }

    static loadApp(id, path) {
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

        //load new app
        CommonUtil.setIsLoading(true);
        return StorageService.getApplication(id).then(
            node => createAppModel(node, path)
        ).then(
            createAppTab
        ).then(
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
            selectedIndex = tabIndex;
            if (selectedIndex > newApps.length) {
                selectedIndex = newApps.length;
            }
            openApps = newApps;

            notifyStateChange();
        }
    }

    static getState() {
        if (lodgementNode === null) {
            lodgementNode = UiService.getLodgementNode();
            console.debug('loaded lodgement node');
        }
        return {
            lodgementNode,
            openApps,
            selectedIndex
        };
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

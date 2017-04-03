import UiService from './UiService';
import CommonUtil from './CommonUtil';
import StorageService from './StorageService';


class LocationService {
}

//service states
const hashChangeHandlers = [];
let lodgementNode = null;
let openApps = [];
let selectedIndex = 0;
let currentHash = '';
let restored = false;

/**
 * Update the hash when the model being displayed is changed.
 * @param model the model being displayed.
 */
function updateHash(model) {
    if (!restored)
        return false;

    let hash;
    if (model.getConcreteClassName() === 'ApplicationListNode') {
        hash = '/apps';
    } else {
        const root = model.getContext().getRootNode();
        hash = `/app/${root.getIdNode().getValue()}${model.getPath()}`;
    }

    if (window.location.hash !== `#${hash}`) {
        console.warn(`Updating hash from ${window.location.hash} to #${hash}`);
        currentHash = hash;
        window.location.hash = hash;
    }
    return true;
}

function addHashChangeHandler(func) {
    hashChangeHandlers.push(func);
}

function removeHashChangeHandler(func) {
    const index = hashChangeHandlers.indexOf(func);
    if (index >= 0) {
        hashChangeHandlers.splice(index, 1);
    }
}

function notifyHashChange() {
    console.log(`number of handlers ${hashChangeHandlers.length}`);
    for (let i = 0; i < hashChangeHandlers.length; i++) {
        console.log(`notifying hash change ${i}`);
        hashChangeHandlers[i]();
    }
}

function closeTab(tabIndex) {
    const appIndex = tabIndex - 1;
    if (!openApps[appIndex].isDirty() || window.confirm('Are you sure you want to close the application?')) {
        const newApps = [];
        openApps.forEach((item, i) => {
            if (i === appIndex)
                return;
            newApps.push(item);
        });
        selectedIndex = tabIndex;
        if (selectedIndex > newApps.length) {
            selectedIndex = newApps.length;
        }
        openApps = newApps;

        notifyHashChange();
    }
}

function createNewApp(newApp) {
    const newApps = [...openApps, newApp];
    openApps = newApps;
    selectedIndex = newApps.length;
    notifyHashChange();
    CommonUtil.delay(10).then(
        () => {
            console.log('Enabling dirty check..');
            newApp.getContext().setDirtyCheckEnabled(true);
        }
    );
}

function onNewApp() {
    const newApp = UiService.createApplicationNode();
    createNewApp(newApp);
    return newApp;
}

function loadApp(id, path, failedCallback) {
    if (openApps) {
        for (let i = 0; i < openApps.length; i++) {
            const app = openApps[i];
            if (app.getIdNode().getValue() === id) {
                selectedIndex = i + 1;
                if (path) {
                    app.getContext().beginSession();
                    app.selectDescendant(path);
                    app.getContext().commitSession();
                }
                notifyHashChange();
                return;
            }
        }
    }
    CommonUtil.setIsLoading(true);
    StorageService.getApplication(id).then(
        (node) => {
            const model = UiService.createApplicationNode();
            const context = model.getContext();
            context.beginSession();
            CommonUtil.setValue(model, node);
            context.commitSession();
            return model;
        }
    ).then(
        model => CommonUtil.delay().then(() => {
            if (path) {
                model.getContext().beginSession();
                model.selectDescendant(path);
                model.getContext().commitSession();
            }
            createNewApp(model);
            CommonUtil.setIsLoading(false);
        })
    ).catch(
        () => {
            if (failedCallback) {
                failedCallback();
            }
        }
    );
}

/**
 * When hash changes, change application state.
 */
function restoreLocation() {
    let newHash = window.location.hash;
    if (newHash.startsWith('#')) {
        newHash = newHash.substr(1);
    }
    if (currentHash === newHash) {
        restored = true;
        return;
    }

    if (newHash.startsWith('/app/') && newHash.length > 5) {
        newHash = newHash.substr(5);
        const index = newHash.indexOf('/');
        const appId = newHash.substr(0, index >= 0 ? index : newHash.length);
        const path = index >= 0 ? newHash.substr(index + 1) : '';
        for (let i = 0; i < openApps.length; i++) {
            if (openApps[i].getUniqueId() === appId) {
                selectedIndex = i + 1;
                openApps[i].getContext().beginSession();
                openApps[i].selectDescendant(path);
                openApps[i].getContext().commitSession();
                notifyHashChange();
                restored = true;
                return;
            }
        }
        //open a new app
        loadApp(appId, path, () => {
            selectedIndex = 0;
            notifyHashChange();
        });
    } else {
        selectedIndex = 0;
        notifyHashChange();
    }
    restored = true;
}

function getState() {
    if (lodgementNode === null) {
        lodgementNode = UiService.getLodgementNode();
    }
    return {
        lodgementNode,
        openApps,
        selectedIndex
    };
}

function selectTab(index) {
    selectedIndex = index;
    notifyHashChange();
}

LocationService.addHashChangeHandler = addHashChangeHandler;
LocationService.removeHashChangeHandler = removeHashChangeHandler;
LocationService.updateHash = updateHash;
LocationService.restoreLocation = restoreLocation;
LocationService.closeTab = closeTab;
LocationService.selectTab = selectTab;
LocationService.newApp = onNewApp;
LocationService.loadApp = loadApp;

LocationService.getState = getState;

export default LocationService;

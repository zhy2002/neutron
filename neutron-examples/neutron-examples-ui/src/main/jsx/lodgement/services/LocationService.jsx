import UiService from './UiService';
import CommonUtil from './CommonUtil';
import StorageService from './StorageService';


class LocationService {
}

//service states

let lodgementNode = null;
let openApps = [];
let selectedIndex = 0;
let currentHash = '';
let restored = false; //if the view specified in hash is opened
const hashChangeHandlers = []; //notify state is changed

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

/**
 * Update the hash when the model being displayed is changed.
 * @param model the model being displayed.
 */
function updateHash(model) {
    if (!restored) {
        console.info('Skip updateHash util location is restored.');
        return false;
    }

    let hash;
    if (model.getConcreteClassName() === 'ApplicationListNode') {
        hash = '/apps';
    } else {
        const root = model.getContext().getRootNode();
        hash = `/app/${root.getIdNode().getValue()}${model.getPath()}`;
    }

    if (window.location.hash !== `#${hash}`) {
        console.info(`Updating hash from ${window.location.hash} to #${hash}`);
        currentHash = hash;
        window.location.hash = hash;
    }
    return true;
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

function selectTab(index) {
    selectedIndex = index;
    notifyHashChange();
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

function loadApp(id) {
    if (openApps) {
        for (let i = 0; i < openApps.length; i++) {
            const app = openApps[i];
            if (app.getIdNode().getValue() === id) {
                selectedIndex = i + 1;
                return CommonUtil.defer(app);
            }
        }
    }
    CommonUtil.setIsLoading(true);
    return StorageService.getApplication(id).then(
        (node) => {
            const model = UiService.createApplicationNode();
            const context = model.getContext();
            context.beginSession();
            CommonUtil.setValue(model, node);
            context.commitSession();
            return CommonUtil.defer(model);
        }
    ).then((model) => {
        createNewApp(model);
        return CommonUtil.defer(model);
    }).then((model) => {
        CommonUtil.setIsLoading(false);
        return CommonUtil.defer(model);
    });
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
        //open a new app
        CommonUtil.setIsLoading(true);
        CommonUtil
            .delay(10)
            .then(() => loadApp(appId))
            .then((model) => {
                if (path) {
                    model.getContext().beginSession();
                    model.selectDescendant(path);
                    model.getContext().commitSession();
                }
            })
            .catch(() => {
                selectedIndex = 0;
            })
            .then(() => {
                restored = true;
                notifyHashChange();
            });
    } else {
        selectedIndex = 0;
        restored = true;
        notifyHashChange();
    }
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

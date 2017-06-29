import CommonUtil from '../../neutron/CommonUtil';
import EventService from '../../neutron/EventService';
import StaticService from '../../neutron/StaticService';
import LodgementService from './LodgementService';
import UiService from '../../neutron/UiService';


let currentHash = ''; //the hash that represents the application state (without leading '#')
let restored = false; //if the view specified in hash is loaded
let statePartiallySynced = false;


EventService.subscribe('state_partially_synced', () => {
    statePartiallySynced = true;
});

function restoreLodgementState(newHash/*format: appId/path_to_content_node[?selected=tabName]*/) {
    const index = newHash.indexOf('/');
    const appId = newHash.substr(0, index >= 0 ? index : newHash.length);
    const path = index >= 0 ? newHash.substr(index + 1) : '';

    return LodgementService.openApp(appId, path).catch(
        () => {
            window.location.hash = '/apps';
            return null;
        }
    );
}

/**
 * Code that manages the syncing of application state and window location hash.
 */
export default class LocationService extends StaticService {

    /**
     * Update the application state to reflect the hash in address bar.
     */
    static syncStateToHash() {
        //removing leading '#'
        let newHash = window.location.hash;
        if (newHash.startsWith('#')) {
            newHash = newHash.substr(1);
        }

        //if application state is already synced
        if (currentHash === newHash) {
            restored = true;
            return restored;
        }

        restored = false;
        if (newHash.startsWith('/manager/') && newHash.length > 5) {
            UiService.setIsLoading(true);
            statePartiallySynced = false;
            CommonUtil.delay(50).then(() => restoreLodgementState(newHash.substr(5))
                .then(
                    () => {
                        restored = true;
                        currentHash = newHash;
                        console.info(`LocationService: updating state to match hash: #${newHash}`);
                        if (statePartiallySynced) { //could not fully sync sate to hash - maybe rename this event
                            EventService.fire('application_content_change');
                        }
                        UiService.setIsLoading(false);
                    }
                )
            );
        } else {
            LodgementService.selectTab(0);
            restored = true;
            currentHash = newHash;
            console.info(`LocationService: updating state to match hash: #${newHash}`);
        }
        return restored;
    }

    /**
     * Update the hash in address to reflect the application state.
     * @param model the content model being displayed.
     * @param tab true if the selected child name of model is to be added to hash.
     */
    static syncHashToState(model, tab) {
        if (!restored) {
            console.debug('skipping updateHash until model is restored');
            return false;
        }

        let hash;
        if (model.getConcreteClassName() === 'ApplicationListNode') {
            hash = '/apps';
        } else {
            const root = model.getContext().getRootNode();
            hash = `/app/${root.getIdNode().getValue()}${model.getPath()}`;
            if (tab) {
                hash += `?select=${model.getSelectedName()}`;
            } else if (currentHash && currentHash.startsWith(`${hash}?`)) {
                return false; //hash already updated at descendant level.
            }
        }

        if (window.location.hash !== `#${hash}`) {
            console.info(`LocationService: updating hash to match state from ${window.location.hash} to #${hash}`);
            currentHash = hash;
            window.location.hash = hash;
        }
        return true;
    }
}

window.addEventListener('hashchange', () => LocationService.syncStateToHash(), false);

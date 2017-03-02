import NeutronComponent from './NeutronComponent';

export default class ListNeutronComponent extends NeutronComponent {
    extractNewState() {
        const newState = super.extractNewState();

        const uniqueIds = [];
        this.model.getChildren().forEach(
            node => uniqueIds.push(node.getUniqueId())
        );
        newState.uniqueIds = JSON.stringify(uniqueIds);

        return newState;
    }
}

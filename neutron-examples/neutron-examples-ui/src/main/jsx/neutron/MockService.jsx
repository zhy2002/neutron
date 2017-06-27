/**
 * This should be kept in sync with the Neutron framework.
 */

class UiNode {
    constructor() {
        this.uniqueId = `${Math.random()}${Math.random()}${Math.random()}`;
        this.nodeLabel = 'Mock Label';
        this.nodeStatus = window.GWT.NodeStatusEnum.Loaded;
    }

    getUniqueId() {
        return this.uniqueId;
    }

    getNodeLabel() {
        return this.nodeLabel;
    }

    getNodeStatus() {
        return this.nodeStatus;
    }

    addChangeListener() {
    }
}

class LeafUiNode extends UiNode {

}

class ParentUiNode extends UiNode {
    constructor() {
        super();

        this.children = [];
    }

    getChildren() {
        return this.children;
    }

    setChildren(children) {
        this.children = children;
    }
}

class ListUiNode extends ParentUiNode {
    constructor() {
        super();
    }

    getItemCount() {
        return this.getChildren().length;
    }
}

class ObjectUiNode extends ParentUiNode {
}


export default class MockService {
    static createMockListUiNode() {
        return new ListUiNode();
    }
}
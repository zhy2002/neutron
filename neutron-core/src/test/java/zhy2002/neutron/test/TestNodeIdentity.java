package zhy2002.neutron.test;

import zhy2002.neutron.data.NodeIdentity;
import zhy2002.neutron.data.NodeIdentityMap;


public class TestNodeIdentity implements NodeIdentity {

    private String localId;
    private String name;
    private NodeIdentityMap nodeIdentityMap;

    public TestNodeIdentity(String localId, String name, NodeIdentityMap nodeIdentityMap) {
        this.localId = localId;
        this.name = name;
        this.nodeIdentityMap = nodeIdentityMap;
        if (this.nodeIdentityMap == null) {
            this.nodeIdentityMap = new TestNodeIdentityMap();
        }
    }

    @Override
    public String getLocalId() {
        return localId;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public <T> T getValue() {
        return null;
    }

    @Override
    public NodeIdentityMap getNodeIdentityMap() {
        return nodeIdentityMap;
    }

    public void setLocalId(String localId) {
        this.localId = localId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNodeIdentityMap(NodeIdentityMap nodeIdentityMap) {
        this.nodeIdentityMap = nodeIdentityMap;
    }


}

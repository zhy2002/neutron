package zhy2002.neutron.core.test;

import zhy2002.neutron.core.data.NodeIdentity;
import zhy2002.neutron.core.data.NodeIdentityMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class TestNodeIdentityMap implements NodeIdentityMap {

    private Map<String, NodeIdentity> identityMap = new HashMap<>();
    private Iterator<NodeIdentity> identityIterator;

    public void add(NodeIdentity identity) {
        identityMap.put(identity.getName(), identity);
    }

    @Override
    public NodeIdentity get(String childName) {
        return identityMap.get(childName);
    }

    @Override
    public NodeIdentity next() {
        if (identityIterator == null) {
            identityIterator = identityMap.values().iterator();
        }
        if (identityIterator.hasNext()) {
            return identityIterator.next();
        } else {
            identityIterator = null;
            return null;
        }
    }
}

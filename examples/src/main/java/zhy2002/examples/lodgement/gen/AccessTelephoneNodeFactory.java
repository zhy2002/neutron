package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class AccessTelephoneNodeFactory implements ChildNodeFactory<AccessTelephoneNode, AccessNode> {

    @Override
    public AccessTelephoneNode create(AccessNode parent, String name) {
        return new AccessTelephoneNode(parent, name);
    }
}

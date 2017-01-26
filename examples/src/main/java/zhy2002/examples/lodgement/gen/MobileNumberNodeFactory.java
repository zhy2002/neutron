package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class MobileNumberNodeFactory implements ChildNodeFactory<MobileNumberNode, ContactNode> {

    @Override
    public MobileNumberNode create(ContactNode parent, String name) {
        return new MobileNumberNode(parent, name);
    }
}

package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class MobileNumberNodeFactory implements ChildNodeFactory<MobileNumberNode, PersonContactNode> {

    @Override
    public MobileNumberNode create(PersonContactNode parent, String name) {
        return new MobileNumberNode(parent, name);
    }
}

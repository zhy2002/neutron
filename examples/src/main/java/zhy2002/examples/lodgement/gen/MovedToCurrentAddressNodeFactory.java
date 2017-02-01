package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class MovedToCurrentAddressNodeFactory implements ChildNodeFactory<MovedToCurrentAddressNode, PersonContactNode> {

    @Override
    public MovedToCurrentAddressNode create(PersonContactNode parent, String name) {
        return new MovedToCurrentAddressNode(parent, name);
    }
}

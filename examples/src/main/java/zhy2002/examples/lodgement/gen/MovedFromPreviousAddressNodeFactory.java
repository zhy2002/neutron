package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class MovedFromPreviousAddressNodeFactory implements ChildNodeFactory<MovedFromPreviousAddressNode, PersonContactNode> {

    @Override
    public MovedFromPreviousAddressNode create(PersonContactNode parent, String name) {
        return new MovedFromPreviousAddressNode(parent, name);
    }
}

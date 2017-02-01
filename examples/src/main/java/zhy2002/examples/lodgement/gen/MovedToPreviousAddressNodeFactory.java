package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class MovedToPreviousAddressNodeFactory implements ChildNodeFactory<MovedToPreviousAddressNode, PersonContactNode> {

    @Override
    public MovedToPreviousAddressNode create(PersonContactNode parent, String name) {
        return new MovedToPreviousAddressNode(parent, name);
    }
}

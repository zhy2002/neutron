package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class PostcodeNodeFactory implements ChildNodeFactory<PostcodeNode, AddressNode<?>> {

    @Override
    public PostcodeNode create(AddressNode<?> parent, String name) {
        return new PostcodeNode(parent, name);
    }
}

package zhy2002.examples.register;

import zhy2002.neutron.ChildNodeFactory;

public class AreaNodeFactory implements ChildNodeFactory<AreaCodeNode, PhoneInfoNode> {

    @Override
    public AreaCodeNode create(PhoneInfoNode parent, String name) {
        return new AreaCodeNode(parent, name);
    }
}

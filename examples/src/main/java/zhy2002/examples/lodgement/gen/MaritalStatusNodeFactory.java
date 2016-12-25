package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.ChildNodeFactory;

public class MaritalStatusNodeFactory implements ChildNodeFactory<MaritalStatusNode, PersonNode> {

    @Override
    public MaritalStatusNode create(PersonNode parent, String name) {
        return new MaritalStatusNode(parent, name);
    }
}

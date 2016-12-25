package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.ChildNodeFactory;

public class PermanentResidentFlagNodeFactory implements ChildNodeFactory<PermanentResidentFlagNode, PersonNode> {

    @Override
    public PermanentResidentFlagNode create(PersonNode parent, String name) {
        return new PermanentResidentFlagNode(parent, name);
    }
}

package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class PermanentResidentFlagNodeFactory implements ChildNodeFactory<PermanentResidentFlagNode, PersonGeneralNode> {

    @Override
    public PermanentResidentFlagNode create(PersonGeneralNode parent, String name) {
        return new PermanentResidentFlagNode(parent, name);
    }
}

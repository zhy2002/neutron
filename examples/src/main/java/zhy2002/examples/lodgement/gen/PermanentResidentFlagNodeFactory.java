package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class PermanentResidentFlagNodeFactory implements ChildNodeFactory<PermanentResidentFlagNode, GeneralNode> {

    @Override
    public PermanentResidentFlagNode create(GeneralNode parent, String name) {
        return new PermanentResidentFlagNode(parent, name);
    }
}

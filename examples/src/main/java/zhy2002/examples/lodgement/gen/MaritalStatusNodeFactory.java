package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class MaritalStatusNodeFactory implements ChildNodeFactory<MaritalStatusNode, GeneralNode> {

    @Override
    public MaritalStatusNode create(GeneralNode parent, String name) {
        return new MaritalStatusNode(parent, name);
    }
}

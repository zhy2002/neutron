package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class MaritalStatusNodeFactory implements ChildNodeFactory<MaritalStatusNode, PersonGeneralNode> {

    @Override
    public MaritalStatusNode create(PersonGeneralNode parent, String name) {
        return new MaritalStatusNode(parent, name);
    }
}

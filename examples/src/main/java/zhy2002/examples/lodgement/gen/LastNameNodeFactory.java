package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class LastNameNodeFactory implements ChildNodeFactory<LastNameNode, PersonGeneralNode> {

    @Override
    public LastNameNode create(PersonGeneralNode parent, String name) {
        return new LastNameNode(parent, name);
    }
}

package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.ChildNodeFactory;

public class LastNameNodeFactory implements ChildNodeFactory<LastNameNode, GeneralNode> {

    @Override
    public LastNameNode create(GeneralNode parent, String name) {
        return new LastNameNode(parent, name);
    }
}

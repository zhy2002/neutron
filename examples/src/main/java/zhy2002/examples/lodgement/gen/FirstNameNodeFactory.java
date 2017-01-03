package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class FirstNameNodeFactory implements ChildNodeFactory<FirstNameNode, GeneralNode> {

    @Override
    public FirstNameNode create(GeneralNode parent, String name) {
        return new FirstNameNode(parent, name);
    }
}

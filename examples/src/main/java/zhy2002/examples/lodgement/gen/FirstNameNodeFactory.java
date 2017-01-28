package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class FirstNameNodeFactory implements ChildNodeFactory<FirstNameNode, PersonGeneralNode> {

    @Override
    public FirstNameNode create(PersonGeneralNode parent, String name) {
        return new FirstNameNode(parent, name);
    }
}

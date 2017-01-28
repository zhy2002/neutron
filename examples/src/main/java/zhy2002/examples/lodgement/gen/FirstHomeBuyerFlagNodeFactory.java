package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class FirstHomeBuyerFlagNodeFactory implements ChildNodeFactory<FirstHomeBuyerFlagNode, PersonGeneralNode> {

    @Override
    public FirstHomeBuyerFlagNode create(PersonGeneralNode parent, String name) {
        return new FirstHomeBuyerFlagNode(parent, name);
    }
}

package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.ChildNodeFactory;

public class FirstHomeBuyerFlagNodeFactory implements ChildNodeFactory<FirstHomeBuyerFlagNode, PersonNode> {

    @Override
    public FirstHomeBuyerFlagNode create(PersonNode parent, String name) {
        return new FirstHomeBuyerFlagNode(parent, name);
    }
}

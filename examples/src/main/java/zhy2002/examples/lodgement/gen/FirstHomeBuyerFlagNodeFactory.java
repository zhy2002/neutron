package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.ChildNodeFactory;

public class FirstHomeBuyerFlagNodeFactory implements ChildNodeFactory<FirstHomeBuyerFlagNode, GeneralNode> {

    @Override
    public FirstHomeBuyerFlagNode create(GeneralNode parent, String name) {
        return new FirstHomeBuyerFlagNode(parent, name);
    }
}

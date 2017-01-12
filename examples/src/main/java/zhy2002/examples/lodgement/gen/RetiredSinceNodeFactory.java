package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class RetiredSinceNodeFactory implements ChildNodeFactory<RetiredSinceNode, RetiredEmploymentNode> {

    @Override
    public RetiredSinceNode create(RetiredEmploymentNode parent, String name) {
        return new RetiredSinceNode(parent, name);
    }
}

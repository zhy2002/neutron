package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.ChildNodeFactory;

public class CompanyNodeFactory implements ChildNodeFactory<CompanyNode, CompanyListNode> {

    @Override
    public CompanyNode create(CompanyListNode parent, String name) {
        return new CompanyNode(parent, name);
    }
}

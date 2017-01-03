package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class CompanyListNodeFactory implements ChildNodeFactory<CompanyListNode, ApplicationNode> {

    @Override
    public CompanyListNode create(ApplicationNode parent, String name) {
        return new CompanyListNode(parent, name);
    }
}

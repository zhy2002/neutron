package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class OtherIncomeNodeFactory implements ChildNodeFactory<OtherIncomeNode, PersonOtherIncomeListNode> {

    @Override
    public OtherIncomeNode create(PersonOtherIncomeListNode parent, String name) {
        return new OtherIncomeNode(parent, name);
    }
}

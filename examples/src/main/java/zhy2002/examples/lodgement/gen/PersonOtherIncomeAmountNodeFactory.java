package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class PersonOtherIncomeAmountNodeFactory implements ChildNodeFactory<PersonOtherIncomeAmountNode, PersonOtherIncomeNode> {

    @Override
    public PersonOtherIncomeAmountNode create(PersonOtherIncomeNode parent, String name) {
        return new PersonOtherIncomeAmountNode(parent, name);
    }
}

package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.ChildNodeFactory;

public class DateOfBirthNodeFactory implements ChildNodeFactory<DateOfBirthNode, PersonNode> {

    @Override
    public DateOfBirthNode create(PersonNode parent, String name) {
        return new DateOfBirthNode(parent, name);
    }
}

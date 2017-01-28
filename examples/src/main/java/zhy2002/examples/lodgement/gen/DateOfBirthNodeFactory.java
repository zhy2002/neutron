package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class DateOfBirthNodeFactory implements ChildNodeFactory<DateOfBirthNode, PersonGeneralNode> {

    @Override
    public DateOfBirthNode create(PersonGeneralNode parent, String name) {
        return new DateOfBirthNode(parent, name);
    }
}

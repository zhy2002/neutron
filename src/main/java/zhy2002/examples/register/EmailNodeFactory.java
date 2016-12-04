package zhy2002.examples.register;

import zhy2002.neutron.ChildNodeFactory;

public class EmailNodeFactory extends ChildNodeFactory<EmailNode, RegisterNode> {
    @Override
    public EmailNode create(RegisterNode parent, String name) {
        return new EmailNode(parent, name);
    }
}
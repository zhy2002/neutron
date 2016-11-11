package zhy2002.neutron.examples.register;

import zhy2002.neutron.UiNodeFactory;

/**
 * The factory that creates a password node.
 */
public class PasswordNodeFactory extends UiNodeFactory<PasswordNode, RootNode> {

    @Override
    public PasswordNode create(RootNode parent, String name) {
        assert parent != null;

        PasswordNode node = new PasswordNode(parent, name);
        node.addRule(new PasswordMinLengthRule(node, 4, new ErrorNodeFactory()));
        return node;
    }
}

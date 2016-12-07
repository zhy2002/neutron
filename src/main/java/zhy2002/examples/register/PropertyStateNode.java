package zhy2002.examples.register;

import zhy2002.examples.register.rule.PropertyStateRequiredRule;
import zhy2002.neutron.StringUiNode;
import zhy2002.neutron.UiNodeRule;

import java.util.Arrays;
import java.util.List;

public class PropertyStateNode extends StringUiNode<PropertyDetailsNode> {

    protected PropertyStateNode(PropertyDetailsNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected List<UiNodeRule<?, ?>> createOwnRules() {
        return Arrays.asList(
                getContext().createUiNodeRule(PropertyStateRequiredRule.class, this)
        );
    }
}

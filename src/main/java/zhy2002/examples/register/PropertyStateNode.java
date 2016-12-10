package zhy2002.examples.register;

import zhy2002.examples.register.rule.PropertyStateRequiredRule;
import zhy2002.neutron.StringUiNode;
import zhy2002.neutron.UiNodeRule;

import java.util.Arrays;
import java.util.List;

public class PropertyStateNode extends StringUiNode<PropertyDetailsNode> {

    private static List<AustralianState> STATES = Arrays.asList(
            new AustralianState("", ""),
            new AustralianState("NSW", "NSW"),
            new AustralianState("VIC", "VIC"),
            new AustralianState("QLD", "QLD"),
            new AustralianState("WA", "WA"),
            new AustralianState("TAS", "TAS"),
            new AustralianState("NT", "NT")
    );

    protected PropertyStateNode(PropertyDetailsNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setValue("");
        setStateValueInternal("states", STATES.toArray());
    }

    @Override
    protected List<UiNodeRule<?, ?>> createOwnRules() {
        return Arrays.asList(
                getContext().createUiNodeRule(PropertyStateRequiredRule.class, this)
        );
    }
}

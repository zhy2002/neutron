package zhy2002.examples.register;

import zhy2002.examples.register.data.AustralianState;
import zhy2002.neutron.node.StringUiNode;

import java.util.Arrays;
import java.util.List;

public class PropertyStateNode extends StringUiNode<PropertyDetailsNode> {

    public static final String REQUIRED_MESSAGE = "Property state is required.";

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

        setRequiredMessage(REQUIRED_MESSAGE);
        setRequired(true);
        setStateValueInternal("states", STATES.toArray());
    }

}

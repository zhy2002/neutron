package zhy2002.examples.register;

public class AreaCodeNode extends PhoneInfoFieldNode {
    AreaCodeNode(PhoneInfoNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setRequiredMessage("Area code is required.");
    }
}

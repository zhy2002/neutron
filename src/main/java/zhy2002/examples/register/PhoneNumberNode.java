package zhy2002.examples.register;

public class PhoneNumberNode extends PhoneInfoFieldNode {

    protected PhoneNumberNode(PhoneInfoNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setRequiredMessage("Phone number is required.");
    }
}

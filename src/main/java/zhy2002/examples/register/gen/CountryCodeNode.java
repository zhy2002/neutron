package zhy2002.examples.register.gen;

public class CountryCodeNode extends PhoneInfoFieldNode {

    CountryCodeNode(PhoneInfoNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setRequiredMessage("Country code is required.");
    }
}

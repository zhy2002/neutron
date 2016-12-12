package zhy2002.examples.register;

import jsinterop.annotations.JsMethod;
import zhy2002.examples.register.rule.PhoneInfoAllOrNothingRule;
import zhy2002.neutron.ObjectUiNode;
import zhy2002.neutron.UiNode;
import zhy2002.neutron.UiNodeContext;
import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.util.EnhancedLinkedList;

import javax.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.List;


public class PhoneInfoNode extends ObjectUiNode<RegisterNode> {

    private CountryCodeNode countryCodeNode;
    private AreaCodeNode areaCodeNode;
    private PhoneNumberNode phoneNumberNode;

    protected PhoneInfoNode(@NotNull RegisterNode parent, @NotNull String name) {
        super(parent, name);
    }

    @JsMethod
    public CountryCodeNode getCountryCodeNode() {
        return countryCodeNode;
    }

    @JsMethod
    public AreaCodeNode getAreaCodeNode() {
        return areaCodeNode;
    }

    public PhoneNumberNode getPhoneNumberNode() {
        return phoneNumberNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        UiNodeContext<?> context = getContext();
        countryCodeNode = context.createChildNode(CountryCodeNode.class, this, "countryCodeNode");
        areaCodeNode = context.createChildNode(AreaCodeNode.class, this, "areaCodeNode");
        phoneNumberNode = context.createChildNode(PhoneNumberNode.class, this, "phoneNumberNode");

        return Arrays.asList(
                countryCodeNode,
                areaCodeNode,
                phoneNumberNode
        );
    }

    @Override
    protected EnhancedLinkedList<UiNodeRule<?, ?>> createOwnRules() {
        return super.createOwnRules().and(getContext().createUiNodeRule(PhoneInfoAllOrNothingRule.class, this));
    }
}

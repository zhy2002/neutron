package zhy2002.examples.register.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.register.data.*;
import zhy2002.examples.register.gen.rule.*;


public  class PhoneInfoNode extends ObjectUiNode<RegisterNode>
{
    private CountryCodeNode countryCodeNode;
    private AreaCodeNode areaCodeNode;
    private PhoneNumberNode phoneNumberNode;

    protected PhoneInfoNode(RegisterNode parent, String name) {
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

    @JsMethod
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
    protected EnhancedLinkedList<UiNodeRule<?>> createOwnRules() {
        return super.createOwnRules()
            .and(getContext().createUiNodeRule(PhoneInfoAllOrNothingRule.class, this))
        ;
    }
}

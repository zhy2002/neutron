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

    public PhoneInfoNode(RegisterNode parent, String name) {
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
        List<UiNode<?>> children = super.createChildren();
        UiNodeContext<?> context = getContext();
        countryCodeNode = context.createChildNode(CountryCodeNode.class, this, "countryCodeNode");
        children.add(countryCodeNode);
        areaCodeNode = context.createChildNode(AreaCodeNode.class, this, "areaCodeNode");
        children.add(areaCodeNode);
        phoneNumberNode = context.createChildNode(PhoneNumberNode.class, this, "phoneNumberNode");
        children.add(phoneNumberNode);
        return children;
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        UiNodeContext<?> context = getContext();
        createdRules.add(context.createUiNodeRule(PhoneInfoAllOrNothingRule.class, this));
    }



}

package zhy2002.examples.register.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.register.data.*;
import zhy2002.examples.register.gen.rule.*;
import zhy2002.examples.register.gen.di.*;

public class PhoneInfoNode extends ObjectUiNode<RegisterNode>
{
    private CountryCodeNode countryCodeNode;
    private AreaCodeNode areaCodeNode;
    private PhoneNumberNode phoneNumberNode;

    private PhoneInfoNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(PhoneInfoNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return PhoneInfoNode.class;
    }

    private PhoneInfoNodeComponent component;

    @Inject
    void createComponent(PhoneInfoNodeComponent.Builder builder) {
        this.component = builder.setPhoneInfoNodeModule(new PhoneInfoNodeModule(this)).build();
    }

    @Override
    protected PhoneInfoNodeRuleProvider getRuleProvider() {
        return component.getPhoneInfoNodeRuleProvider();
    }

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
        countryCodeNode = childFactory.createCountryCodeNode();
        children.add(countryCodeNode);
        areaCodeNode = childFactory.createAreaCodeNode();
        children.add(areaCodeNode);
        phoneNumberNode = childFactory.createPhoneNumberNode();
        children.add(phoneNumberNode);
        return children;
    }

}

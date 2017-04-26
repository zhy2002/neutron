package zhy2002.examples.register.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import zhy2002.examples.register.gen.rule.*;
import zhy2002.examples.register.gen.di.*;
import java.util.List;

public class PhoneInfoNode extends ObjectUiNode<RegisterNode> {

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

    private RuleProvider<PhoneInfoNode> getRuleProvider() {
        return component.getPhoneInfoNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
        getInstanceRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
        getInstanceRuleProvider().createRules(createdRules);
    }

    private RuleProvider<PhoneInfoNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }


    public PhoneInfoNode(@NotNull RegisterNode parent, String name) {
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

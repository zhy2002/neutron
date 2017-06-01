package zhy2002.examples.register.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.register.gen.di.PhoneInfoNodeComponent;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.examples.register.gen.rule.*;
import zhy2002.examples.register.gen.di.*;
import java.util.List;


public class PhoneInfoNode extends ObjectUiNode<RegisterNode> {

    @Inject
    public PhoneInfoNode(@Owner RegisterNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return PhoneInfoNode.class;
    }

    protected final PhoneInfoNodeComponent getComponent() {
        return component;
    }


    private PhoneInfoNodeComponent component;

    @Inject
    void createComponent(PhoneInfoNodeComponent.Builder builder) {
        this.component = builder.setPhoneInfoNodeModule(new PhoneInfoNodeModule(this)).build();
    }

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

    //region children getters

    @JsMethod
    public CountryCodeNode getCountryCodeNode() {
        return (CountryCodeNode)getChildByName("countryCodeNode");
    }

    @JsMethod
    public AreaCodeNode getAreaCodeNode() {
        return (AreaCodeNode)getChildByName("areaCodeNode");
    }

    @JsMethod
    public PhoneNumberNode getPhoneNumberNode() {
        return (PhoneNumberNode)getChildByName("phoneNumberNode");
    }

    //endregion
    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("countryCodeNode");
        children.add(getComponent().createCountryCodeNode());
        setChildNodeIdentity("areaCodeNode");
        children.add(getComponent().createAreaCodeNode());
        setChildNodeIdentity("phoneNumberNode");
        children.add(getComponent().createPhoneNumberNode());
        setChildNodeIdentity(null);
        return children;
    }

}

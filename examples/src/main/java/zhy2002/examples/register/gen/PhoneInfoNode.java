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

    @Inject
    void receiveClassRegistry(ClassRegistryImpl classRegistry) {
        UiNodeConfig<PhoneInfoNode> config = classRegistry.getUiNodeConfig(PhoneInfoNode.class, getName());
        if (config != null) {
            this.setStatusListener(new ConfigBindingNodeStatusListener<>(this, config));
        }
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

    @Inject
    PhoneInfoNodeRuleProvider ruleProvider;

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        createdRules.addAll(ruleProvider.createRules(this));
    }

}

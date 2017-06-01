package zhy2002.examples.register.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.register.gen.di.CountryCodeNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.register.data.*;
import zhy2002.examples.register.gen.rule.*;
import zhy2002.examples.register.gen.di.*;
import java.util.List;


public class CountryCodeNode extends PhoneInfoFieldNode {

    @Inject
    public CountryCodeNode(@Owner PhoneInfoNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return CountryCodeNode.class;
    }

    protected final CountryCodeNodeComponent getComponent() {
        return component;
    }


    private CountryCodeNodeComponent component;

    @Inject
    void createComponent(CountryCodeNodeComponent.Builder builder) {
        this.component = builder.setCountryCodeNodeModule(new CountryCodeNodeModule(this)).build();
    }

    private RuleProvider<CountryCodeNode> getRuleProvider() {
        return component.getCountryCodeNodeRuleProvider();
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

    private RuleProvider<CountryCodeNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}

package zhy2002.examples.register.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.register.data.*;
import zhy2002.examples.register.gen.rule.*;
import zhy2002.examples.register.gen.di.*;
import java.util.List;


public class CountryCodeNode extends PhoneInfoFieldNode {

    @Override
    public final Class<?> getConcreteClass() {
        return CountryCodeNode.class;
    }

    private CountryCodeNodeComponent component;

    @Inject
    void createComponent(CountryCodeNodeComponent.Builder builder) {
        this.component = builder.setCountryCodeNodeModule(new CountryCodeNodeModule(this)).build();
    }

    private CountryCodeNodeRuleProvider getRuleProvider() {
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

    public CountryCodeNode(@NotNull PhoneInfoNode parent, String name) {
        super(parent, name);
    }

}

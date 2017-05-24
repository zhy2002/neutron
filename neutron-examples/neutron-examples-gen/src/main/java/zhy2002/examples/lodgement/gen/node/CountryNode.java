package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class CountryNode extends BaseCountryNode<AddressNode<?>> {

    @Override
    public final Class<?> getConcreteClass() {
        return CountryNode.class;
    }

    private CountryNodeComponent component;

    @Inject
    void createComponent(CountryNodeComponent.Builder builder) {
        this.component = builder.setCountryNodeModule(new CountryNodeModule(this)).build();
    }

    private RuleProvider<CountryNode> getRuleProvider() {
        return component.getCountryNodeRuleProvider();
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

    private RuleProvider<CountryNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }


    public CountryNode(@NotNull AddressNode<?> parent, String name) {
        super(parent, name);
    }

    @Override
    public Boolean getRequired() {
        boolean parentHasValue = getParent().hasValue();
        if(parentHasValue)
            return super.getRequired();

        return Boolean.FALSE;
    }

}

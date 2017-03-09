package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class CompanyAddressNode extends AddressNode<CompanyContactNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return CompanyAddressNode.class;
    }

    private CompanyAddressNodeComponent component;

    @Inject
    void createComponent(CompanyAddressNodeComponent.Builder builder) {
        this.component = builder.setCompanyAddressNodeModule(new CompanyAddressNodeModule(this)).build();
    }

    private CompanyAddressNodeRuleProvider getRuleProvider() {
        return component.getCompanyAddressNodeRuleProvider();
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

    private RuleProvider<CompanyAddressNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    public CompanyAddressNode(@NotNull CompanyContactNode parent, String name) {
        super(parent, name);
    }

}

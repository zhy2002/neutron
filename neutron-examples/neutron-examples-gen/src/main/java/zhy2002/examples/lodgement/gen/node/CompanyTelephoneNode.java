package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.CompanyTelephoneNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class CompanyTelephoneNode extends TelephoneNode<CompanyContactNode> {

    @Inject
    public CompanyTelephoneNode(@Owner CompanyContactNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return CompanyTelephoneNode.class;
    }

    protected final CompanyTelephoneNodeComponent getComponent() {
        return component;
    }


    private CompanyTelephoneNodeComponent component;

    @Inject
    void createComponent(CompanyTelephoneNodeComponent.Builder builder) {
        this.component = builder.setCompanyTelephoneNodeModule(new CompanyTelephoneNodeModule(this)).build();
    }

    private RuleProvider<CompanyTelephoneNode> getRuleProvider() {
        return component.getCompanyTelephoneNodeRuleProvider();
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

    private RuleProvider<CompanyTelephoneNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}

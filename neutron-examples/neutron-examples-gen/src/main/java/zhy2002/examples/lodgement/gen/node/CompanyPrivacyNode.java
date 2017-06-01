package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.CompanyPrivacyNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class CompanyPrivacyNode extends BasePrivacyNode<CompanyNode> {

    @Inject
    public CompanyPrivacyNode(@Owner CompanyNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return CompanyPrivacyNode.class;
    }

    protected final CompanyPrivacyNodeComponent getComponent() {
        return component;
    }


    private CompanyPrivacyNodeComponent component;

    @Inject
    void createComponent(CompanyPrivacyNodeComponent.Builder builder) {
        this.component = builder.setCompanyPrivacyNodeModule(new CompanyPrivacyNodeModule(this)).build();
    }

    private RuleProvider<CompanyPrivacyNode> getRuleProvider() {
        return component.getCompanyPrivacyNodeRuleProvider();
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

    private RuleProvider<CompanyPrivacyNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}

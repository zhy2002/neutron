package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.CompanyContactLastNameNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class CompanyContactLastNameNode extends StringUiNode<CompanyContactNode> {

    @Inject
    public CompanyContactLastNameNode(@Owner CompanyContactNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return CompanyContactLastNameNode.class;
    }

    protected final CompanyContactLastNameNodeComponent getComponent() {
        return component;
    }


    private CompanyContactLastNameNodeComponent component;

    @Inject
    void createComponent(CompanyContactLastNameNodeComponent.Builder builder) {
        this.component = builder.setCompanyContactLastNameNodeModule(new CompanyContactLastNameNodeModule(this)).build();
    }

    private RuleProvider<CompanyContactLastNameNode> getRuleProvider() {
        return component.getCompanyContactLastNameNodeRuleProvider();
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

    private RuleProvider<CompanyContactLastNameNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}

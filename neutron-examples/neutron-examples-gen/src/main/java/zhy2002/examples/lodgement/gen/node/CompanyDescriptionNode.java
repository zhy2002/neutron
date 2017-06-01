package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.CompanyDescriptionNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class CompanyDescriptionNode extends StringUiNode<CompanyGeneralNode> {

    @Inject
    public CompanyDescriptionNode(@Owner CompanyGeneralNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return CompanyDescriptionNode.class;
    }

    protected final CompanyDescriptionNodeComponent getComponent() {
        return component;
    }


    private CompanyDescriptionNodeComponent component;

    @Inject
    void createComponent(CompanyDescriptionNodeComponent.Builder builder) {
        this.component = builder.setCompanyDescriptionNodeModule(new CompanyDescriptionNodeModule(this)).build();
    }

    private RuleProvider<CompanyDescriptionNode> getRuleProvider() {
        return component.getCompanyDescriptionNodeRuleProvider();
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

    private RuleProvider<CompanyDescriptionNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}

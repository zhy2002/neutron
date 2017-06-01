package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.CompanyResponsibleLendNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class CompanyResponsibleLendNode extends BaseResponsibleLendNode<CompanyNode> {

    @Inject
    public CompanyResponsibleLendNode(@Owner CompanyNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return CompanyResponsibleLendNode.class;
    }

    protected final CompanyResponsibleLendNodeComponent getComponent() {
        return component;
    }


    private CompanyResponsibleLendNodeComponent component;

    @Inject
    void createComponent(CompanyResponsibleLendNodeComponent.Builder builder) {
        this.component = builder.setCompanyResponsibleLendNodeModule(new CompanyResponsibleLendNodeModule(this)).build();
    }

    private RuleProvider<CompanyResponsibleLendNode> getRuleProvider() {
        return component.getCompanyResponsibleLendNodeRuleProvider();
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

    private RuleProvider<CompanyResponsibleLendNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}

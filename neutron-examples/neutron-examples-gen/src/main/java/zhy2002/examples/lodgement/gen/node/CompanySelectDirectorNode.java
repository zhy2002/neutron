package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.CompanySelectDirectorNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class CompanySelectDirectorNode extends SelectRelatedPersonListNode<CompanyGeneralNode> {

    @Inject
    public CompanySelectDirectorNode(@Owner CompanyGeneralNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return CompanySelectDirectorNode.class;
    }

    protected final CompanySelectDirectorNodeComponent getComponent() {
        return component;
    }


    private CompanySelectDirectorNodeComponent component;

    @Inject
    void createComponent(CompanySelectDirectorNodeComponent.Builder builder) {
        this.component = builder.setCompanySelectDirectorNodeModule(new CompanySelectDirectorNodeModule(this)).build();
    }

    private RuleProvider<CompanySelectDirectorNode> getRuleProvider() {
        return component.getCompanySelectDirectorNodeRuleProvider();
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

    private RuleProvider<CompanySelectDirectorNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}

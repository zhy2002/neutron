package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.CompanyApplicationTypeNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class CompanyApplicationTypeNode extends StringUiNode<CompanyGeneralNode> {

    @Inject
    public CompanyApplicationTypeNode(@Owner CompanyGeneralNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return CompanyApplicationTypeNode.class;
    }

    protected final CompanyApplicationTypeNodeComponent getComponent() {
        return component;
    }


    private CompanyApplicationTypeNodeComponent component;

    @Inject
    void createComponent(CompanyApplicationTypeNodeComponent.Builder builder) {
        this.component = builder.setCompanyApplicationTypeNodeModule(new CompanyApplicationTypeNodeModule(this)).build();
    }

    private RuleProvider<CompanyApplicationTypeNode> getRuleProvider() {
        return component.getCompanyApplicationTypeNodeRuleProvider();
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

    private RuleProvider<CompanyApplicationTypeNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}

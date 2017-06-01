package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.CompanyRegisteredNameNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class CompanyRegisteredNameNode extends StringUiNode<CompanyGeneralNode> {

    @Inject
    public CompanyRegisteredNameNode(@Owner CompanyGeneralNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return CompanyRegisteredNameNode.class;
    }

    protected final CompanyRegisteredNameNodeComponent getComponent() {
        return component;
    }


    private CompanyRegisteredNameNodeComponent component;

    @Inject
    void createComponent(CompanyRegisteredNameNodeComponent.Builder builder) {
        this.component = builder.setCompanyRegisteredNameNodeModule(new CompanyRegisteredNameNodeModule(this)).build();
    }

    private RuleProvider<CompanyRegisteredNameNode> getRuleProvider() {
        return component.getCompanyRegisteredNameNodeRuleProvider();
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

    private RuleProvider<CompanyRegisteredNameNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}

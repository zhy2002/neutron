package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class CompanyRegisteredNameNode extends StringUiNode<CompanyGeneralNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return CompanyRegisteredNameNode.class;
    }

    private CompanyRegisteredNameNodeComponent component;

    @Inject
    void createComponent(CompanyRegisteredNameNodeComponent.Builder builder) {
        this.component = builder.setCompanyRegisteredNameNodeModule(new CompanyRegisteredNameNodeModule(this)).build();
    }

    private CompanyRegisteredNameNodeRuleProvider getRuleProvider() {
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

    public CompanyRegisteredNameNode(@NotNull CompanyGeneralNode parent, String name) {
        super(parent, name);
    }

}

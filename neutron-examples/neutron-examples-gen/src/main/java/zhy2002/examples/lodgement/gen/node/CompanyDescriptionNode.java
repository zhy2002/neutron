package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class CompanyDescriptionNode extends StringUiNode<CompanyGeneralNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return CompanyDescriptionNode.class;
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


    public CompanyDescriptionNode(@NotNull CompanyGeneralNode parent, String name) {
        super(parent, name);
    }

}

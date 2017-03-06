package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class CompanyAcnNode extends StringUiNode<CompanyGeneralNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return CompanyAcnNode.class;
    }

    private CompanyAcnNodeComponent component;

    @Inject
    void createComponent(CompanyAcnNodeComponent.Builder builder) {
        this.component = builder.setCompanyAcnNodeModule(new CompanyAcnNodeModule(this)).build();
    }

    private CompanyAcnNodeRuleProvider getRuleProvider() {
        return component.getCompanyAcnNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public CompanyAcnNode(@NotNull CompanyGeneralNode parent, String name) {
        super(parent, name);
    }

}

package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class CompanyTypeNode extends StringUiNode<CompanyGeneralNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return CompanyTypeNode.class;
    }

    private CompanyTypeNodeComponent component;

    @Inject
    void createComponent(CompanyTypeNodeComponent.Builder builder) {
        this.component = builder.setCompanyTypeNodeModule(new CompanyTypeNodeModule(this)).build();
    }

    private CompanyTypeNodeRuleProvider getRuleProvider() {
        return component.getCompanyTypeNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public CompanyTypeNode(@NotNull CompanyGeneralNode parent, String name) {
        super(parent, name);
    }

}

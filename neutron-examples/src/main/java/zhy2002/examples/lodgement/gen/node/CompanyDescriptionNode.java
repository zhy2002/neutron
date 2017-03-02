package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


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

    @Override
    protected CompanyDescriptionNodeRuleProvider getRuleProvider() {
        return component.getCompanyDescriptionNodeRuleProvider();
    }

    public CompanyDescriptionNode(@NotNull CompanyGeneralNode parent, String name) {
        super(parent, name);
    }

}

package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class CompanySelectDirectorNode extends SelectRelatedPersonListNode<CompanyGeneralNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return CompanySelectDirectorNode.class;
    }

    private CompanySelectDirectorNodeComponent component;

    @Inject
    void createComponent(CompanySelectDirectorNodeComponent.Builder builder) {
        this.component = builder.setCompanySelectDirectorNodeModule(new CompanySelectDirectorNodeModule(this)).build();
    }

    @Override
    protected CompanySelectDirectorNodeRuleProvider getRuleProvider() {
        return component.getCompanySelectDirectorNodeRuleProvider();
    }

    public CompanySelectDirectorNode(@NotNull CompanyGeneralNode parent, String name) {
        super(parent, name);
    }

}

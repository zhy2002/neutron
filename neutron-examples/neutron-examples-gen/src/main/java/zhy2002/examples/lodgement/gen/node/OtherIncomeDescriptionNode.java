package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class OtherIncomeDescriptionNode extends StringUiNode<OtherIncomeNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return OtherIncomeDescriptionNode.class;
    }

    private OtherIncomeDescriptionNodeComponent component;

    @Inject
    void createComponent(OtherIncomeDescriptionNodeComponent.Builder builder) {
        this.component = builder.setOtherIncomeDescriptionNodeModule(new OtherIncomeDescriptionNodeModule(this)).build();
    }

    @Override
    protected OtherIncomeDescriptionNodeRuleProvider getRuleProvider() {
        return component.getOtherIncomeDescriptionNodeRuleProvider();
    }

    public OtherIncomeDescriptionNode(@NotNull OtherIncomeNode parent, String name) {
        super(parent, name);
    }

}

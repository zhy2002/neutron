package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class OtherIncomePreviousYearNode extends BooleanUiNode<OtherIncomeNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return OtherIncomePreviousYearNode.class;
    }

    private OtherIncomePreviousYearNodeComponent component;

    @Inject
    void createComponent(OtherIncomePreviousYearNodeComponent.Builder builder) {
        this.component = builder.setOtherIncomePreviousYearNodeModule(new OtherIncomePreviousYearNodeModule(this)).build();
    }

    @Override
    protected OtherIncomePreviousYearNodeRuleProvider getRuleProvider() {
        return component.getOtherIncomePreviousYearNodeRuleProvider();
    }

    public OtherIncomePreviousYearNode(@NotNull OtherIncomeNode parent, String name) {
        super(parent, name);
    }

}

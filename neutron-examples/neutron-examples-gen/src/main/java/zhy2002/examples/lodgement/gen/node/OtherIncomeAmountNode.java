package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class OtherIncomeAmountNode extends BaseCurrencyNode<OtherIncomeNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return OtherIncomeAmountNode.class;
    }

    private OtherIncomeAmountNodeComponent component;

    @Inject
    void createComponent(OtherIncomeAmountNodeComponent.Builder builder) {
        this.component = builder.setOtherIncomeAmountNodeModule(new OtherIncomeAmountNodeModule(this)).build();
    }

    @Override
    protected OtherIncomeAmountNodeRuleProvider getRuleProvider() {
        return component.getOtherIncomeAmountNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public OtherIncomeAmountNode(@NotNull OtherIncomeNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setRequired(true);
    }

}

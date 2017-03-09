package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


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

    private OtherIncomeAmountNodeRuleProvider getRuleProvider() {
        return component.getOtherIncomeAmountNodeRuleProvider();
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

    private RuleProvider<OtherIncomeAmountNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    public OtherIncomeAmountNode(@NotNull OtherIncomeNode parent, String name) {
        super(parent, name);
    }

}

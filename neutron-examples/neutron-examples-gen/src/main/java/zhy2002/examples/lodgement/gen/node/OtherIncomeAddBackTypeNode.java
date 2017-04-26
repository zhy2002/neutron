package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class OtherIncomeAddBackTypeNode extends StringUiNode<OtherIncomeNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return OtherIncomeAddBackTypeNode.class;
    }

    private OtherIncomeAddBackTypeNodeComponent component;

    @Inject
    void createComponent(OtherIncomeAddBackTypeNodeComponent.Builder builder) {
        this.component = builder.setOtherIncomeAddBackTypeNodeModule(new OtherIncomeAddBackTypeNodeModule(this)).build();
    }

    private RuleProvider<OtherIncomeAddBackTypeNode> getRuleProvider() {
        return component.getOtherIncomeAddBackTypeNodeRuleProvider();
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

    private RuleProvider<OtherIncomeAddBackTypeNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }


    public OtherIncomeAddBackTypeNode(@NotNull OtherIncomeNode parent, String name) {
        super(parent, name);
    }

}

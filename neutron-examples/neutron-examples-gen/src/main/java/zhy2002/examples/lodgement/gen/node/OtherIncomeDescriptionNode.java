package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


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

    private OtherIncomeDescriptionNodeRuleProvider getRuleProvider() {
        return component.getOtherIncomeDescriptionNodeRuleProvider();
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

    private RuleProvider<OtherIncomeDescriptionNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    public OtherIncomeDescriptionNode(@NotNull OtherIncomeNode parent, String name) {
        super(parent, name);
    }

}

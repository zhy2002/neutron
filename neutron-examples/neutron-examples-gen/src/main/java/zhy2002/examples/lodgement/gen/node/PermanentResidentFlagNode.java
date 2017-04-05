package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class PermanentResidentFlagNode extends BooleanUiNode<PersonGeneralNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return PermanentResidentFlagNode.class;
    }

    private PermanentResidentFlagNodeComponent component;

    @Inject
    void createComponent(PermanentResidentFlagNodeComponent.Builder builder) {
        this.component = builder.setPermanentResidentFlagNodeModule(new PermanentResidentFlagNodeModule(this)).build();
    }

    private RuleProvider<PermanentResidentFlagNode> getRuleProvider() {
        return component.getPermanentResidentFlagNodeRuleProvider();
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

    private RuleProvider<PermanentResidentFlagNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    public PermanentResidentFlagNode(@NotNull PersonGeneralNode parent, String name) {
        super(parent, name);
    }

}

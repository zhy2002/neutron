package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.PermanentResidentFlagNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class PermanentResidentFlagNode extends BooleanUiNode<PersonGeneralNode> {

    @Inject
    public PermanentResidentFlagNode(@Owner PersonGeneralNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return PermanentResidentFlagNode.class;
    }

    protected final PermanentResidentFlagNodeComponent getComponent() {
        return component;
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

}

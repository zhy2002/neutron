package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class DefenseServiceFlagNode extends BooleanUiNode<PropertyNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return DefenseServiceFlagNode.class;
    }

    private DefenseServiceFlagNodeComponent component;

    @Inject
    void createComponent(DefenseServiceFlagNodeComponent.Builder builder) {
        this.component = builder.setDefenseServiceFlagNodeModule(new DefenseServiceFlagNodeModule(this)).build();
    }

    private DefenseServiceFlagNodeRuleProvider getRuleProvider() {
        return component.getDefenseServiceFlagNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public DefenseServiceFlagNode(@NotNull PropertyNode parent, String name) {
        super(parent, name);
    }

}

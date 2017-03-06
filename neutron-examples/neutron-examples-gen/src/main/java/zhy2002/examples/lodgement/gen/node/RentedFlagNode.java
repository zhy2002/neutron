package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class RentedFlagNode extends BooleanUiNode<PropertyNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return RentedFlagNode.class;
    }

    private RentedFlagNodeComponent component;

    @Inject
    void createComponent(RentedFlagNodeComponent.Builder builder) {
        this.component = builder.setRentedFlagNodeModule(new RentedFlagNodeModule(this)).build();
    }

    private RentedFlagNodeRuleProvider getRuleProvider() {
        return component.getRentedFlagNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public RentedFlagNode(@NotNull PropertyNode parent, String name) {
        super(parent, name);
    }

}

package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class MovedToCurrentAddressNode extends MonthYearNode<BaseContactNode<?>> {

    @Override
    public final Class<?> getConcreteClass() {
        return MovedToCurrentAddressNode.class;
    }

    private MovedToCurrentAddressNodeComponent component;

    @Inject
    void createComponent(MovedToCurrentAddressNodeComponent.Builder builder) {
        this.component = builder.setMovedToCurrentAddressNodeModule(new MovedToCurrentAddressNodeModule(this)).build();
    }

    @Override
    protected MovedToCurrentAddressNodeRuleProvider getRuleProvider() {
        return component.getMovedToCurrentAddressNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public MovedToCurrentAddressNode(@NotNull BaseContactNode<?> parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setRequired(true);
    }

}

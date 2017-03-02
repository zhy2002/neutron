package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class MovedToPreviousAddressNode extends MonthYearNode<BaseContactNode<?>> {

    @Override
    public final Class<?> getConcreteClass() {
        return MovedToPreviousAddressNode.class;
    }

    private MovedToPreviousAddressNodeComponent component;

    @Inject
    void createComponent(MovedToPreviousAddressNodeComponent.Builder builder) {
        this.component = builder.setMovedToPreviousAddressNodeModule(new MovedToPreviousAddressNodeModule(this)).build();
    }

    @Override
    protected MovedToPreviousAddressNodeRuleProvider getRuleProvider() {
        return component.getMovedToPreviousAddressNodeRuleProvider();
    }

    public MovedToPreviousAddressNode(@NotNull BaseContactNode<?> parent, String name) {
        super(parent, name);
    }

}
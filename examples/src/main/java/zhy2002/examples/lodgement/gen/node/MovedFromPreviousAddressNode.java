package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class MovedFromPreviousAddressNode extends MonthYearNode<PersonContactNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return MovedFromPreviousAddressNode.class;
    }

    private MovedFromPreviousAddressNodeComponent component;

    @Inject
    void createComponent(MovedFromPreviousAddressNodeComponent.Builder builder) {
        this.component = builder.setMovedFromPreviousAddressNodeModule(new MovedFromPreviousAddressNodeModule(this)).build();
    }

    @Override
    protected MovedFromPreviousAddressNodeRuleProvider getRuleProvider() {
        return component.getMovedFromPreviousAddressNodeRuleProvider();
    }

    public MovedFromPreviousAddressNode(@NotNull PersonContactNode parent, String name) {
        super(parent, name);
    }

}

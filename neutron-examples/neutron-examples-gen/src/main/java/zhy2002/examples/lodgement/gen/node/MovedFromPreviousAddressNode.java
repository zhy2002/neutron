package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


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

    private MovedFromPreviousAddressNodeRuleProvider getRuleProvider() {
        return component.getMovedFromPreviousAddressNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public MovedFromPreviousAddressNode(@NotNull PersonContactNode parent, String name) {
        super(parent, name);
    }

}

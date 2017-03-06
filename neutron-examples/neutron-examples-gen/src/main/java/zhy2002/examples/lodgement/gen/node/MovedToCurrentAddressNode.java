package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class MovedToCurrentAddressNode extends MonthYearNode<PersonContactNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return MovedToCurrentAddressNode.class;
    }

    private MovedToCurrentAddressNodeComponent component;

    @Inject
    void createComponent(MovedToCurrentAddressNodeComponent.Builder builder) {
        this.component = builder.setMovedToCurrentAddressNodeModule(new MovedToCurrentAddressNodeModule(this)).build();
    }

    private MovedToCurrentAddressNodeRuleProvider getRuleProvider() {
        return component.getMovedToCurrentAddressNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public MovedToCurrentAddressNode(@NotNull PersonContactNode parent, String name) {
        super(parent, name);
    }

}

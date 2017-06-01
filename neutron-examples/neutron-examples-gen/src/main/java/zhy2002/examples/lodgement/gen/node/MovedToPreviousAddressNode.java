package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.MovedToPreviousAddressNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class MovedToPreviousAddressNode extends MonthYearNode<PersonContactNode> {

    @Inject
    public MovedToPreviousAddressNode(@Owner PersonContactNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return MovedToPreviousAddressNode.class;
    }

    protected final MovedToPreviousAddressNodeComponent getComponent() {
        return component;
    }


    private MovedToPreviousAddressNodeComponent component;

    @Inject
    void createComponent(MovedToPreviousAddressNodeComponent.Builder builder) {
        this.component = builder.setMovedToPreviousAddressNodeModule(new MovedToPreviousAddressNodeModule(this)).build();
    }

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

}

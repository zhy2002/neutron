package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.MovedFromPreviousAddressNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class MovedFromPreviousAddressNode extends MonthYearNode<PersonContactNode> {

    @Inject
    public MovedFromPreviousAddressNode(@Owner PersonContactNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return MovedFromPreviousAddressNode.class;
    }

    protected final MovedFromPreviousAddressNodeComponent getComponent() {
        return component;
    }


    private MovedFromPreviousAddressNodeComponent component;

    @Inject
    void createComponent(MovedFromPreviousAddressNodeComponent.Builder builder) {
        this.component = builder.setMovedFromPreviousAddressNodeModule(new MovedFromPreviousAddressNodeModule(this)).build();
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

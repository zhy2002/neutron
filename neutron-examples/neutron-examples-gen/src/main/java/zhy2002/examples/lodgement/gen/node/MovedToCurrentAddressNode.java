package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.MovedToCurrentAddressNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class MovedToCurrentAddressNode extends MonthYearNode<PersonContactNode> {

    @Inject
    public MovedToCurrentAddressNode(@Owner PersonContactNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return MovedToCurrentAddressNode.class;
    }

    protected final MovedToCurrentAddressNodeComponent getComponent() {
        return component;
    }


    private MovedToCurrentAddressNodeComponent component;

    @Inject
    void createComponent(MovedToCurrentAddressNodeComponent.Builder builder) {
        this.component = builder.setMovedToCurrentAddressNodeModule(new MovedToCurrentAddressNodeModule(this)).build();
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

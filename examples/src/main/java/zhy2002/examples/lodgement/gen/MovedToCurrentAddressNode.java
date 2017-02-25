package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;

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

    @Override
    protected MovedToCurrentAddressNodeRuleProvider getRuleProvider() {
        return component.getMovedToCurrentAddressNodeRuleProvider();
    }

    public MovedToCurrentAddressNode(@NotNull PersonContactNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setRequired(true);
    }

}

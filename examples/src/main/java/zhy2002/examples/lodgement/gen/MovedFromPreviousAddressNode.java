package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
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

    public MovedFromPreviousAddressNode(PersonContactNode parent, String name) {
        super(parent, name);
    }

}

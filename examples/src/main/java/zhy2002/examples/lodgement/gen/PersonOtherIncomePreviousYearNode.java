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

public class PersonOtherIncomePreviousYearNode extends BooleanUiNode<PersonOtherIncomeNode>
{
    @Inject
    void receiveClassRegistry(ClassRegistryImpl classRegistry) {
        UiNodeConfig<PersonOtherIncomePreviousYearNode> config = classRegistry.getUiNodeConfig(PersonOtherIncomePreviousYearNode.class, getName());
        if (config != null) {
            this.setStatusListener(new ConfigBindingNodeStatusListener<>(this, config));
        }
    }

    public PersonOtherIncomePreviousYearNode(PersonOtherIncomeNode parent, String name) {
        super(parent, name);
    }

}

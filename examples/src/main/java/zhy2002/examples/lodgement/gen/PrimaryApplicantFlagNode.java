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

public class PrimaryApplicantFlagNode extends BooleanUiNode<PersonGeneralNode>
{
    @Inject
    void receiveClassRegistry(ClassRegistryImpl classRegistry) {
        UiNodeConfig<PrimaryApplicantFlagNode> config = classRegistry.getUiNodeConfig(PrimaryApplicantFlagNode.class, getName());
        if (config != null) {
            this.setStatusListener(new ConfigBindingNodeStatusListener<>(this, config));
        }
    }

    public PrimaryApplicantFlagNode(PersonGeneralNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        UiNodeContext<?> context = getContext();
        createdRules.add(context.createUiNodeRule(AtLeastOnePrimaryApplicantRule.class, this));
        createdRules.add(context.createUiNodeRule(AtMostOnePrimaryApplicantRule.class, this));
    }



}

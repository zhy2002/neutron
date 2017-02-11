package zhy2002.examples.register.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.register.data.*;
import zhy2002.examples.register.gen.rule.*;

public class UsernameNode extends StringUiNode<RegisterNode>
{
    @Inject
    void receiveClassRegistry(ClassRegistryImpl classRegistry) {
        UiNodeConfig<UsernameNode> config = classRegistry.getUiNodeConfig(UsernameNode.class, getName());
        if (config != null) {
            this.setStatusListener(new ConfigBindingNodeStatusListener<>(this, config));
        }
    }

    public UsernameNode(RegisterNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setMinLength(4);
        setInvalidChars("#");
        setLengthMessage("Username must have at least four characters.");
        setInvalidCharsMessage("Username cannot contain '#'.");
    }

    @Inject
    UsernameNodeRuleProvider ruleProvider;

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        createdRules.addAll(ruleProvider.createRules(this));
    }

}

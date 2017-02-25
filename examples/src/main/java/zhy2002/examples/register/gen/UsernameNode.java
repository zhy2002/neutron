package zhy2002.examples.register.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.math.*;
import zhy2002.examples.register.data.*;
import zhy2002.examples.register.gen.rule.*;
import zhy2002.examples.register.gen.di.*;

public class UsernameNode extends StringUiNode<RegisterNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return UsernameNode.class;
    }

    private UsernameNodeComponent component;

    @Inject
    void createComponent(UsernameNodeComponent.Builder builder) {
        this.component = builder.setUsernameNodeModule(new UsernameNodeModule(this)).build();
    }

    @Override
    protected UsernameNodeRuleProvider getRuleProvider() {
        return component.getUsernameNodeRuleProvider();
    }

    public UsernameNode(@NotNull RegisterNode parent, String name) {
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

}

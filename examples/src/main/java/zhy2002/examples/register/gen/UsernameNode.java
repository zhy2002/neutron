package zhy2002.examples.register.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.register.data.*;
import zhy2002.examples.register.gen.rule.*;


public  class UsernameNode extends StringUiNode<RegisterNode>
{
    protected UsernameNode(RegisterNode parent, String name) {
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

    @Override
    protected EnhancedLinkedList<UiNodeRule<?>> createOwnRules() {
        return super.createOwnRules()
            .and(getContext().createUiNodeRule(DefaultEmailByUsernameRule.class, this))
        ;
    }
}

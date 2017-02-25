package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;

public class LastNameNode extends StringUiNode<PersonGeneralNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return LastNameNode.class;
    }

    private LastNameNodeComponent component;

    @Inject
    void createComponent(LastNameNodeComponent.Builder builder) {
        this.component = builder.setLastNameNodeModule(new LastNameNodeModule(this)).build();
    }

    @Override
    protected LastNameNodeRuleProvider getRuleProvider() {
        return component.getLastNameNodeRuleProvider();
    }

    public LastNameNode(@NotNull PersonGeneralNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setRequired(true);
        setPattern(ApplicationNodeConstants.NAME_PATTERN);
        setMaxLength(20);
    }

}

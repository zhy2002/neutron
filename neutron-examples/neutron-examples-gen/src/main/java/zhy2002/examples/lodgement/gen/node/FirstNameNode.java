package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class FirstNameNode extends StringUiNode<PersonGeneralNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return FirstNameNode.class;
    }

    private FirstNameNodeComponent component;

    @Inject
    void createComponent(FirstNameNodeComponent.Builder builder) {
        this.component = builder.setFirstNameNodeModule(new FirstNameNodeModule(this)).build();
    }

    @Override
    protected FirstNameNodeRuleProvider getRuleProvider() {
        return component.getFirstNameNodeRuleProvider();
    }

    public FirstNameNode(@NotNull PersonGeneralNode parent, String name) {
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

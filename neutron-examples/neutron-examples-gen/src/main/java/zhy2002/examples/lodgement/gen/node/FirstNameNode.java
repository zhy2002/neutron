package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


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

    private FirstNameNodeRuleProvider getRuleProvider() {
        return component.getFirstNameNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public FirstNameNode(@NotNull PersonGeneralNode parent, String name) {
        super(parent, name);
    }

}

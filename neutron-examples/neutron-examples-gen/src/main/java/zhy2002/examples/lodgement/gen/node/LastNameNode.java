package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


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

    private LastNameNodeRuleProvider getRuleProvider() {
        return component.getLastNameNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public LastNameNode(@NotNull PersonGeneralNode parent, String name) {
        super(parent, name);
    }

}

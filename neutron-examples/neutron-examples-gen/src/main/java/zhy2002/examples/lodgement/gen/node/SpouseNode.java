package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class SpouseNode extends StringUiNode<PersonGeneralNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return SpouseNode.class;
    }

    private SpouseNodeComponent component;

    @Inject
    void createComponent(SpouseNodeComponent.Builder builder) {
        this.component = builder.setSpouseNodeModule(new SpouseNodeModule(this)).build();
    }

    @Override
    protected SpouseNodeRuleProvider getRuleProvider() {
        return component.getSpouseNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public SpouseNode(@NotNull PersonGeneralNode parent, String name) {
        super(parent, name);
    }

}

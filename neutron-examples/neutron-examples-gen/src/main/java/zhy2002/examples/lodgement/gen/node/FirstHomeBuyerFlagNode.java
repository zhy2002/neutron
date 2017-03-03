package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class FirstHomeBuyerFlagNode extends BooleanUiNode<PersonGeneralNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return FirstHomeBuyerFlagNode.class;
    }

    private FirstHomeBuyerFlagNodeComponent component;

    @Inject
    void createComponent(FirstHomeBuyerFlagNodeComponent.Builder builder) {
        this.component = builder.setFirstHomeBuyerFlagNodeModule(new FirstHomeBuyerFlagNodeModule(this)).build();
    }

    @Override
    protected FirstHomeBuyerFlagNodeRuleProvider getRuleProvider() {
        return component.getFirstHomeBuyerFlagNodeRuleProvider();
    }

    public FirstHomeBuyerFlagNode(@NotNull PersonGeneralNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setRequired(true);
    }

}

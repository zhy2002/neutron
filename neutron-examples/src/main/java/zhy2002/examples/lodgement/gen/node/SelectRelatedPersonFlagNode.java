package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class SelectRelatedPersonFlagNode extends BooleanUiNode<SelectRelatedPersonNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return SelectRelatedPersonFlagNode.class;
    }

    private SelectRelatedPersonFlagNodeComponent component;

    @Inject
    void createComponent(SelectRelatedPersonFlagNodeComponent.Builder builder) {
        this.component = builder.setSelectRelatedPersonFlagNodeModule(new SelectRelatedPersonFlagNodeModule(this)).build();
    }

    @Override
    protected SelectRelatedPersonFlagNodeRuleProvider getRuleProvider() {
        return component.getSelectRelatedPersonFlagNodeRuleProvider();
    }

    public SelectRelatedPersonFlagNode(@NotNull SelectRelatedPersonNode parent, String name) {
        super(parent, name);
    }

}

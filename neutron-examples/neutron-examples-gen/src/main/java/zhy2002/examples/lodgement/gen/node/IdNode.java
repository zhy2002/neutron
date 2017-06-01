package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.IdNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class IdNode extends StringUiNode<ApplicationNode> {

    @Inject
    public IdNode(@Owner ApplicationNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return IdNode.class;
    }

    protected final IdNodeComponent getComponent() {
        return component;
    }


    private IdNodeComponent component;

    @Inject
    void createComponent(IdNodeComponent.Builder builder) {
        this.component = builder.setIdNodeModule(new IdNodeModule(this)).build();
    }

    private RuleProvider<IdNode> getRuleProvider() {
        return component.getIdNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
        getInstanceRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
        getInstanceRuleProvider().createRules(createdRules);
    }

    private RuleProvider<IdNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}

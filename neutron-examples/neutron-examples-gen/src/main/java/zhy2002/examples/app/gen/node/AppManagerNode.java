package zhy2002.examples.app.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.app.gen.rule.*;
import zhy2002.examples.app.gen.di.*;
import java.util.List;


public class AppManagerNode extends ObjectUiNode<LodgementNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return AppManagerNode.class;
    }

    private AppManagerNodeComponent component;

    @Inject
    void createComponent(AppManagerNodeComponent.Builder builder) {
        this.component = builder.setAppManagerNodeModule(new AppManagerNodeModule(this)).build();
    }

    private AppManagerNodeRuleProvider getRuleProvider() {
        return component.getAppManagerNodeRuleProvider();
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

    private RuleProvider<AppManagerNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    public AppManagerNode(@NotNull LodgementNode parent, String name) {
        super(parent, name);
    }

}

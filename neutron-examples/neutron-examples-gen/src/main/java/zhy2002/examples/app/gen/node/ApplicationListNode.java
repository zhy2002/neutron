package zhy2002.examples.app.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.app.data.*;
import zhy2002.examples.app.gen.rule.*;
import zhy2002.examples.app.gen.di.*;
import java.util.List;


public class ApplicationListNode extends ObjectUiNode<AppManagerNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ApplicationListNode.class;
    }

    private ApplicationListNodeComponent component;

    @Inject
    void createComponent(ApplicationListNodeComponent.Builder builder) {
        this.component = builder.setApplicationListNodeModule(new ApplicationListNodeModule(this)).build();
    }

    private RuleProvider<ApplicationListNode> getRuleProvider() {
        return component.getApplicationListNodeRuleProvider();
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

    private RuleProvider<ApplicationListNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    public ApplicationListNode(@NotNull AppManagerNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public Boolean getUpdated() {
        return getStateValue(LodgementNodeConstants.UPDATED);
    }

    @JsMethod
    public void setUpdated(Boolean value) {
        setStateValue(LodgementNodeConstants.UPDATED, Boolean.class, value);
    }

}

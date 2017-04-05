package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class MaritalStatusNode extends StringUiNode<PersonGeneralNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return MaritalStatusNode.class;
    }

    private MaritalStatusNodeComponent component;

    @Inject
    void createComponent(MaritalStatusNodeComponent.Builder builder) {
        this.component = builder.setMaritalStatusNodeModule(new MaritalStatusNodeModule(this)).build();
    }

    private RuleProvider<MaritalStatusNode> getRuleProvider() {
        return component.getMaritalStatusNodeRuleProvider();
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

    private RuleProvider<MaritalStatusNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    public MaritalStatusNode(@NotNull PersonGeneralNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public Object[] getOptions() {
        return getStateValue(ApplicationNodeConstants.OPTIONS);
    }

    @JsMethod
    public void setOptions(Object[] value) {
        setStateValue(ApplicationNodeConstants.OPTIONS, Object.class, value);
    }

}

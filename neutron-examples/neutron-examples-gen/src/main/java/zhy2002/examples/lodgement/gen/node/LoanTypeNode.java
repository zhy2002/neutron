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


public class LoanTypeNode extends StringUiNode<LoanNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return LoanTypeNode.class;
    }

    private LoanTypeNodeComponent component;

    @Inject
    void createComponent(LoanTypeNodeComponent.Builder builder) {
        this.component = builder.setLoanTypeNodeModule(new LoanTypeNodeModule(this)).build();
    }

    private RuleProvider<LoanTypeNode> getRuleProvider() {
        return component.getLoanTypeNodeRuleProvider();
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

    private RuleProvider<LoanTypeNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    public LoanTypeNode(@NotNull LoanNode parent, String name) {
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

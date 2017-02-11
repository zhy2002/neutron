package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;

public abstract class MonthYearNode<P extends ParentUiNode<?>> extends ObjectUiNode<P>
{
    private MonthNode monthNode;
    private YearNode yearNode;

    private MonthYearNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(MonthYearNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    public MonthYearNode(P parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public MonthNode getMonthNode() {
        return monthNode;
    }

    @JsMethod
    public YearNode getYearNode() {
        return yearNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        monthNode = childFactory.createMonthNode();
        children.add(monthNode);
        yearNode = childFactory.createYearNode();
        children.add(yearNode);
        return children;
    }

    @Inject
    MonthYearNodeRuleProvider ruleProvider;

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        createdRules.addAll(ruleProvider.createRules(this));
    }

}

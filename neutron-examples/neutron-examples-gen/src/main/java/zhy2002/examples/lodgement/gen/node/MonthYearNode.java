package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;


public abstract class MonthYearNode<P extends ParentUiNode<?>> extends ObjectUiNode<P> {

    private MonthNode monthNode;
    private YearNode yearNode;

    private MonthYearNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(MonthYearNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }


    public MonthYearNode(@NotNull P parent, String name) {
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

}

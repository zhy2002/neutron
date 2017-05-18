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
        return (MonthNode)getChildByName("monthNode");
    }

    @JsMethod
    public YearNode getYearNode() {
        return (YearNode)getChildByName("yearNode");
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("monthNode");
        children.add(childFactory.createMonthNode());
        setChildNodeIdentity("yearNode");
        children.add(childFactory.createYearNode());
        setChildNodeIdentity(null);
        return children;
    }

}

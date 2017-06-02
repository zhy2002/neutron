package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.MonthYearNodeComponent;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;


public abstract class MonthYearNode<P extends ParentUiNode<?>> extends ObjectUiNode<P> {

    protected MonthYearNode(P parent) {
        super(parent);
    }

    protected abstract MonthYearNodeComponent getComponent();


    //region children getters

    @JsMethod
    public MonthNode getMonthNode() {
        return (MonthNode)getChildByName("monthNode");
    }

    @JsMethod
    public YearNode getYearNode() {
        return (YearNode)getChildByName("yearNode");
    }

    //endregion
    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("monthNode");
        children.add(getComponent().createMonthNode());
        setChildNodeIdentity("yearNode");
        children.add(getComponent().createYearNode());
        setChildNodeIdentity(null);
        return children;
    }

}

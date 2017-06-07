package zhy2002.examples.app.gen.rule;
/* template name: rule.ftl */
import zhy2002.neutron.*;
import zhy2002.examples.app.gen.node.*;


public abstract class UpdateSelectedTabIndexRule extends UiNodeRule<GlobalUiStateNode> {

    public UpdateSelectedTabIndexRule(GlobalUiStateNode owner) {
        super(owner);
    }

    protected GlobalUiStateNode getGlobalUiStateNode() {
        return getOwner();
    }
}

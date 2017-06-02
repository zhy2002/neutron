package zhy2002.neutron.model;

import zhy2002.neutron.service.CodeGenUtil;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

public class ChildInfo extends CodeGenInfo {

    private String name;
    @Valid
    private List<InitInfo> init;
    @Valid
    private List<RuleInfo> rules;
    private boolean loadWithParent = true;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<InitInfo> getInit() {
        return init;
    }

    public void setInit(List<InitInfo> init) {
        this.init = init;
    }

    public List<RuleInfo> getRules() {
        return rules;
    }

    public void setRules(List<RuleInfo> rules) {
        this.rules = rules;
    }

    public boolean isLoadWithParent() {
        return loadWithParent;
    }

    public void setLoadWithParent(boolean loadWithParent) {
        this.loadWithParent = loadWithParent;
    }

    ////////////////////////////////////////////////////

    @Override
    void initialize() {
        if (getName() == null) {
            setName(CodeGenUtil.firstCharLower(getTypeName()));
        }
    }

    /**
     * This should be null for the root type.
     */
    private NodeInfo childType;
    private NodeInfo parentType;

    public NodeInfo getChildType() {
        return childType;
    }

    void setChildType(NodeInfo childType) {
        this.childType = childType;
    }

    public NodeInfo getParentType() {
        return parentType;
    }

    public void setParentType(NodeInfo parentType) {
        this.parentType = parentType;
    }

    public boolean getHasRuleProvider() {
        return getInit() != null && getInit().size() > 0 || getRules() != null && getRules().size() > 0;
    }
}

package zhy2002.neutron.model;


import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

public class ChildInfo {

    private String name;
    @NotNull
    private String typeName;
    @Valid
    private List<InitInfo> init;
    @Valid
    private List<RuleInfo> rules;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
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

    ////////////////////////////////////////////////////

    /**
     * This should be null for the root type.
     */
    private NodeInfo childType;

    public NodeInfo getChildType() {
        return childType;
    }

    void setChildType(NodeInfo childType) {
        this.childType = childType;
    }
}

package zhy2002.neutron.model;


import java.util.ArrayList;
import java.util.List;

public class ModuleInfo extends CodeGenInfo {

    private NodeInfo parent;
    private List<ChildInfo> exports = new ArrayList<>();

    public NodeInfo getParent() {
        return parent;
    }

    public void setParent(NodeInfo parent) {
        this.parent = parent;
    }

    public List<ChildInfo> getExports() {
        return exports;
    }
}

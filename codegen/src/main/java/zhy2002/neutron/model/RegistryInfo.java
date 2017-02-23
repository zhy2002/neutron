package zhy2002.neutron.model;

import java.util.ArrayList;
import java.util.List;

public class RegistryInfo extends CodeGenInfo {

    private List<NodeInfo> childNodes = new ArrayList<>();
    private List<NodeInfo> concreteNodes = new ArrayList<>();
    private List<NodeInfo> addEventNodes = new ArrayList<>();
    private List<NodeInfo> loadEventNodes = new ArrayList<>();
    private List<NodeInfo> changeEventNodes = new ArrayList<>();

    public List<NodeInfo> getChildNodes() {
        return childNodes;
    }

    public List<NodeInfo> getAddEventNodes() {
        return addEventNodes;
    }

    public List<NodeInfo> getLoadEventNodes() {
        return loadEventNodes;
    }

    public List<NodeInfo> getChangeEventNodes() {
        return changeEventNodes;
    }

    public List<NodeInfo> getConcreteNodes() {
        return concreteNodes;
    }
}

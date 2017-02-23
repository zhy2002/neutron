package zhy2002.neutron.model;

import java.util.ArrayList;
import java.util.List;

public class RegistryInfo extends CodeGenInfo {

    private final List<NodeInfo> allNodes = new ArrayList<>();
    private final List<NodeInfo> concreteNodes = new ArrayList<>();
    private final List<NodeInfo> addEventNodes = new ArrayList<>();
    private final List<NodeInfo> loadEventNodes = new ArrayList<>();
    private final List<NodeInfo> changeEventNodes = new ArrayList<>();

    @Override
    void initialize() {
    }

    public List<NodeInfo> getAllNodes() {
        return allNodes;
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

package zhy2002.neutron.model;


import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import javax.validation.constraints.NotNull;
import java.util.*;

/**
 * The root model for code gen.
 */
public class DomainInfo extends CodeGenInfo {

    private static final ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

    //region mapped data

    @NotNull
    private String targetPackage;
    @NotNull
    private NodeInfo rootType;
    private List<NodeInfo> commonTypes = new ArrayList<>();

    public DomainInfo() {
        setTypeName("");
        setDomainInfo(this);
    }

    public String getTargetPackage() {
        return targetPackage;
    }

    public void setTargetPackage(String targetPackage) {
        this.targetPackage = targetPackage;
    }

    public NodeInfo getRootType() {
        return rootType;
    }

    public void setRootType(NodeInfo rootType) {
        this.rootType = rootType;
    }

    public List<NodeInfo> getCommonTypes() {
        return commonTypes;
    }

    public void setCommonTypes(List<NodeInfo> commonTypes) {
        this.commonTypes = commonTypes;
    }

    //endregion

    ////////////////////////////////////////////////////////

    private final RegistryInfo registryInfo = new RegistryInfo();

    public void initialize() {

        validateMappedData();

        registryInfo.setTypeName(getContextName());
        registryInfo.setDomainInfo(this);
        getRootType().setParentTypeName("VoidUiNode");
        getRootType().setUnloadable(true);
        getRootType().setDomainInfo(this);

        getRootType().initialize();

        NodeInfo genericParentType = new NodeInfo();
        genericParentType.setTypeName("P");

        for (NodeInfo nodeInfo : commonTypes) {
            String parentBaseTypeName = nodeInfo.getParentBaseTypeName();
            if (nodeInfo.isAbstractNode()) {
                nodeInfo.setParentTypeName("P");
                nodeInfo.setParent(genericParentType);
            } else {
                nodeInfo.setParentTypeName(parentBaseTypeName);
                NodeInfo p = new NodeInfo();
                p.setTypeName(parentBaseTypeName);
                nodeInfo.setParent(p);
            }
            nodeInfo.setAbstractNode(true);
            nodeInfo.setDomainInfo(this);
            nodeInfo.initialize();
        }

        resolveBaseTypes();
    }

    private void resolveBaseTypes() {
        List<NodeInfo> allNodes = getNodes();
        Map<String, NodeInfo> map = new HashMap<>();
        allNodes.forEach(node -> map.put(node.getTypeName(), node));
        allNodes.forEach(node -> {
            NodeInfo baseType = map.get(node.getBaseTypeName());
            node.setBaseType(baseType);
        });
        allNodes.forEach(NodeInfo::initializeBaseTypes);
    }

    private void validateMappedData() {
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<DomainInfo>> violations = validator.validate(this);
        if (violations.size() > 0) {
            StringBuilder messageBuilder = new StringBuilder();
            for (ConstraintViolation<DomainInfo> violation : violations) {
                messageBuilder.append(violation.getPropertyPath());
                messageBuilder.append(":");
                messageBuilder.append(violation.getMessage());
                messageBuilder.append(System.lineSeparator());
            }
            throw new RuntimeException(messageBuilder.toString());
        }
    }

    public RegistryInfo getRegistryInfo() {
        return registryInfo;
    }

    public List<NodeInfo> getNodes() {
        return getRegistryInfo().getAllNodes();
    }

    public String getContextName() {
        return getRootType().getTypeName();
    }

}

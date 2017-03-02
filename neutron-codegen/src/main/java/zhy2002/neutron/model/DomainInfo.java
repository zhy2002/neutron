package zhy2002.neutron.model;

import javax.validation.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.util.logging.Logger;

/**
 * The root model for code gen.
 */
public class DomainInfo extends CodeGenInfo {

    private static final Logger logger = Logger.getLogger("DomainInfo");
    private static final ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
    private static final NodeInfo GENERIC_NODE_INFO;
    private static final NodeInfo VOID_NODE_INFO;

    static {
        GENERIC_NODE_INFO = new NodeInfo();
        GENERIC_NODE_INFO.setTypeName("P");
        GENERIC_NODE_INFO.setGenericTypeName("P");

        VOID_NODE_INFO = new NodeInfo();
        VOID_NODE_INFO.setTypeName("VoidUiNode");
        VOID_NODE_INFO.setGenericTypeName("VoidUiNode");
    }

    //region mapped data

    @NotNull
    private String targetPackage;
    @NotNull
    @Valid
    private NodeInfo rootType;
    @Valid
    private List<NodeInfo> commonTypes = new ArrayList<>();

    public DomainInfo() {
        setTypeName("");
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

    /**
     * All generated nodes.
     */
    private final List<NodeInfo> allNodes = new ArrayList<>();
    private final List<NodeInfo> concreteNodes = new ArrayList<>();
    private final List<NodeInfo> addEventNodes = new ArrayList<>();
    private final List<NodeInfo> loadEventNodes = new ArrayList<>();
    private final List<NodeInfo> changeEventNodes = new ArrayList<>();
    private final StringBuilder errorMessageBuilder = new StringBuilder();

    @Override
    public void initialize() {
        validateMappedData();

        setDomainInfo(this);
        initializeCommonTypes();
        initializeRootType();
        resolveBaseTypes();

        raiseErrorIfNecessary();
    }

    private void initializeCommonTypes() {
        for (NodeInfo nodeInfo : getCommonTypes()) {
            nodeInfo.setDomainInfo(this);
            nodeInfo.setParentType(GENERIC_NODE_INFO);
            nodeInfo.setAbstractNode(true);
            nodeInfo.initialize();
        }
    }

    private void initializeRootType() {
        getRootType().setDomainInfo(this);
        getRootType().setParentType(VOID_NODE_INFO);
        getRootType().setUnloadable(true);
        if (getRootType().isAbstractNode()) {
            logger.warning("Root node must be concrete, setting isAbstract to false");
            getRootType().setAbstractNode(false);
        }

        getRootType().initialize();
    }

    private void raiseErrorIfNecessary() {
        String errorMessage = errorMessageBuilder.toString();
        if (errorMessage.length() > 0) {
            throw new RuntimeException(errorMessage);
        }
    }

    private void resolveBaseTypes() {
        Map<String, NodeInfo> map = new HashMap<>();
        getAllNodes().forEach(node -> map.put(node.getTypeName(), node));

        getAllNodes().forEach(node -> {
            NodeInfo baseType = map.get(node.getBaseTypeName());
            if(baseType == null) {
               node.populateFrameworkTypes();
            } else {
                node.setBaseType(baseType);
            }
        });

        getAllNodes().forEach(NodeInfo::resolveBaseTypes);
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

    void addErrorMessageLine(String line) {
        errorMessageBuilder.append(line);
        errorMessageBuilder.append(System.lineSeparator());
    }

    public String getContextName() {
        return getRootType().getTypeName();
    }

    public List<NodeInfo> getAllNodes() {
        return allNodes;
    }

    public List<NodeInfo> getConcreteNodes() {
        return concreteNodes;
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
}
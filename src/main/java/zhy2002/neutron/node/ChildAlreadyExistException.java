package zhy2002.neutron.node;

/**
 * Created by ZHY on 12/11/2016.
 */
public class ChildAlreadyExistException extends RuntimeException {
    public ChildAlreadyExistException(ParentUiNode<?> parent, UiNode<?> child) {
    }
}

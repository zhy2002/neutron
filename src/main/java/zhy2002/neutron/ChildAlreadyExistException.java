package zhy2002.neutron;

/**
 * Thrown when trying to add a child with the same name as another child.
 */
public class ChildAlreadyExistException extends RuntimeException {

    public ChildAlreadyExistException() {
    }

    public ChildAlreadyExistException(ParentUiNode<?> parent, UiNode<?> child) {
    }


}

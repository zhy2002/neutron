package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SelectAccountHolderListNodeItemProvider_MembersInjector
    implements MembersInjector<SelectAccountHolderListNodeItemProvider> {
  private final MembersInjector<SelectAccountHolderNode>
      selectAccountHolderNodeInjectorMembersInjector;

  public SelectAccountHolderListNodeItemProvider_MembersInjector(
      MembersInjector<SelectAccountHolderNode> selectAccountHolderNodeInjectorMembersInjector) {
    assert selectAccountHolderNodeInjectorMembersInjector != null;
    this.selectAccountHolderNodeInjectorMembersInjector =
        selectAccountHolderNodeInjectorMembersInjector;
  }

  public static MembersInjector<SelectAccountHolderListNodeItemProvider> create(
      MembersInjector<SelectAccountHolderNode> selectAccountHolderNodeInjectorMembersInjector) {
    return new SelectAccountHolderListNodeItemProvider_MembersInjector(
        selectAccountHolderNodeInjectorMembersInjector);
  }

  @Override
  public void injectMembers(SelectAccountHolderListNodeItemProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.selectAccountHolderNodeInjector = selectAccountHolderNodeInjectorMembersInjector;
  }

  public static void injectSelectAccountHolderNodeInjector(
      SelectAccountHolderListNodeItemProvider instance,
      MembersInjector<SelectAccountHolderNode> selectAccountHolderNodeInjector) {
    instance.selectAccountHolderNodeInjector = selectAccountHolderNodeInjector;
  }
}

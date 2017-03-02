package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SelectAccountHolderNodeChildProvider_MembersInjector
    implements MembersInjector<SelectAccountHolderNodeChildProvider> {
  private final MembersInjector<SelectAccountHolderFlagNode>
      selectAccountHolderFlagNodeInjectorMembersInjector;

  private final MembersInjector<AccountHolderReferenceNode>
      accountHolderReferenceNodeInjectorMembersInjector;

  public SelectAccountHolderNodeChildProvider_MembersInjector(
      MembersInjector<SelectAccountHolderFlagNode>
          selectAccountHolderFlagNodeInjectorMembersInjector,
      MembersInjector<AccountHolderReferenceNode>
          accountHolderReferenceNodeInjectorMembersInjector) {
    assert selectAccountHolderFlagNodeInjectorMembersInjector != null;
    this.selectAccountHolderFlagNodeInjectorMembersInjector =
        selectAccountHolderFlagNodeInjectorMembersInjector;
    assert accountHolderReferenceNodeInjectorMembersInjector != null;
    this.accountHolderReferenceNodeInjectorMembersInjector =
        accountHolderReferenceNodeInjectorMembersInjector;
  }

  public static MembersInjector<SelectAccountHolderNodeChildProvider> create(
      MembersInjector<SelectAccountHolderFlagNode>
          selectAccountHolderFlagNodeInjectorMembersInjector,
      MembersInjector<AccountHolderReferenceNode>
          accountHolderReferenceNodeInjectorMembersInjector) {
    return new SelectAccountHolderNodeChildProvider_MembersInjector(
        selectAccountHolderFlagNodeInjectorMembersInjector,
        accountHolderReferenceNodeInjectorMembersInjector);
  }

  @Override
  public void injectMembers(SelectAccountHolderNodeChildProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.selectAccountHolderFlagNodeInjector =
        selectAccountHolderFlagNodeInjectorMembersInjector;
    instance.accountHolderReferenceNodeInjector = accountHolderReferenceNodeInjectorMembersInjector;
  }

  public static void injectSelectAccountHolderFlagNodeInjector(
      SelectAccountHolderNodeChildProvider instance,
      MembersInjector<SelectAccountHolderFlagNode> selectAccountHolderFlagNodeInjector) {
    instance.selectAccountHolderFlagNodeInjector = selectAccountHolderFlagNodeInjector;
  }

  public static void injectAccountHolderReferenceNodeInjector(
      SelectAccountHolderNodeChildProvider instance,
      MembersInjector<AccountHolderReferenceNode> accountHolderReferenceNodeInjector) {
    instance.accountHolderReferenceNodeInjector = accountHolderReferenceNodeInjector;
  }
}

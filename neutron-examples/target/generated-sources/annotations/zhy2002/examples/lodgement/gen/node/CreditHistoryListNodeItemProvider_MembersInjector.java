package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreditHistoryListNodeItemProvider_MembersInjector
    implements MembersInjector<CreditHistoryListNodeItemProvider> {
  private final MembersInjector<CreditHistoryNode> creditHistoryNodeInjectorMembersInjector;

  public CreditHistoryListNodeItemProvider_MembersInjector(
      MembersInjector<CreditHistoryNode> creditHistoryNodeInjectorMembersInjector) {
    assert creditHistoryNodeInjectorMembersInjector != null;
    this.creditHistoryNodeInjectorMembersInjector = creditHistoryNodeInjectorMembersInjector;
  }

  public static MembersInjector<CreditHistoryListNodeItemProvider> create(
      MembersInjector<CreditHistoryNode> creditHistoryNodeInjectorMembersInjector) {
    return new CreditHistoryListNodeItemProvider_MembersInjector(
        creditHistoryNodeInjectorMembersInjector);
  }

  @Override
  public void injectMembers(CreditHistoryListNodeItemProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.creditHistoryNodeInjector = creditHistoryNodeInjectorMembersInjector;
  }

  public static void injectCreditHistoryNodeInjector(
      CreditHistoryListNodeItemProvider instance,
      MembersInjector<CreditHistoryNode> creditHistoryNodeInjector) {
    instance.creditHistoryNodeInjector = creditHistoryNodeInjector;
  }
}

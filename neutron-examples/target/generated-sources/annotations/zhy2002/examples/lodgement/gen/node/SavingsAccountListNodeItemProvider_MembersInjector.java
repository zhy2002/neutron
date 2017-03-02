package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SavingsAccountListNodeItemProvider_MembersInjector
    implements MembersInjector<SavingsAccountListNodeItemProvider> {
  private final MembersInjector<SavingsAccountNode> savingsAccountNodeInjectorMembersInjector;

  public SavingsAccountListNodeItemProvider_MembersInjector(
      MembersInjector<SavingsAccountNode> savingsAccountNodeInjectorMembersInjector) {
    assert savingsAccountNodeInjectorMembersInjector != null;
    this.savingsAccountNodeInjectorMembersInjector = savingsAccountNodeInjectorMembersInjector;
  }

  public static MembersInjector<SavingsAccountListNodeItemProvider> create(
      MembersInjector<SavingsAccountNode> savingsAccountNodeInjectorMembersInjector) {
    return new SavingsAccountListNodeItemProvider_MembersInjector(
        savingsAccountNodeInjectorMembersInjector);
  }

  @Override
  public void injectMembers(SavingsAccountListNodeItemProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.savingsAccountNodeInjector = savingsAccountNodeInjectorMembersInjector;
  }

  public static void injectSavingsAccountNodeInjector(
      SavingsAccountListNodeItemProvider instance,
      MembersInjector<SavingsAccountNode> savingsAccountNodeInjector) {
    instance.savingsAccountNodeInjector = savingsAccountNodeInjector;
  }
}

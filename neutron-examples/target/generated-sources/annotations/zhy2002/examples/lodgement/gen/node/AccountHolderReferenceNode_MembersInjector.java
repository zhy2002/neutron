package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.AccountHolderReferenceNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AccountHolderReferenceNode_MembersInjector
    implements MembersInjector<AccountHolderReferenceNode> {
  private final Provider<AccountHolderReferenceNodeComponent.Builder> builderProvider;

  public AccountHolderReferenceNode_MembersInjector(
      Provider<AccountHolderReferenceNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<AccountHolderReferenceNode> create(
      Provider<AccountHolderReferenceNodeComponent.Builder> builderProvider) {
    return new AccountHolderReferenceNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(AccountHolderReferenceNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      AccountHolderReferenceNode instance,
      Provider<AccountHolderReferenceNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}

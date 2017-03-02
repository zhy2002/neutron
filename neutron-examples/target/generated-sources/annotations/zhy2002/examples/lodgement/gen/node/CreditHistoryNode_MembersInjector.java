package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.CreditHistoryNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreditHistoryNode_MembersInjector implements MembersInjector<CreditHistoryNode> {
  private final Provider<CreditHistoryNodeComponent.Builder> builderProvider;

  public CreditHistoryNode_MembersInjector(
      Provider<CreditHistoryNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<CreditHistoryNode> create(
      Provider<CreditHistoryNodeComponent.Builder> builderProvider) {
    return new CreditHistoryNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(CreditHistoryNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      CreditHistoryNode instance, Provider<CreditHistoryNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}

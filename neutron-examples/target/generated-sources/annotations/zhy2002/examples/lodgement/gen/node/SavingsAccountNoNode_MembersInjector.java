package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.SavingsAccountNoNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SavingsAccountNoNode_MembersInjector
    implements MembersInjector<SavingsAccountNoNode> {
  private final Provider<SavingsAccountNoNodeComponent.Builder> builderProvider;

  public SavingsAccountNoNode_MembersInjector(
      Provider<SavingsAccountNoNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<SavingsAccountNoNode> create(
      Provider<SavingsAccountNoNodeComponent.Builder> builderProvider) {
    return new SavingsAccountNoNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(SavingsAccountNoNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      SavingsAccountNoNode instance,
      Provider<SavingsAccountNoNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}

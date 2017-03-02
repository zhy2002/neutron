package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.SavingsBsbNoNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SavingsBsbNoNode_MembersInjector implements MembersInjector<SavingsBsbNoNode> {
  private final Provider<SavingsBsbNoNodeComponent.Builder> builderProvider;

  public SavingsBsbNoNode_MembersInjector(
      Provider<SavingsBsbNoNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<SavingsBsbNoNode> create(
      Provider<SavingsBsbNoNodeComponent.Builder> builderProvider) {
    return new SavingsBsbNoNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(SavingsBsbNoNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      SavingsBsbNoNode instance, Provider<SavingsBsbNoNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}

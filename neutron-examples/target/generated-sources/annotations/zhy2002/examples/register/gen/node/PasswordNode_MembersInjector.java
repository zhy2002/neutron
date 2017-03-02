package zhy2002.examples.register.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.register.gen.di.PasswordNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PasswordNode_MembersInjector implements MembersInjector<PasswordNode> {
  private final Provider<PasswordNodeComponent.Builder> builderProvider;

  public PasswordNode_MembersInjector(Provider<PasswordNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<PasswordNode> create(
      Provider<PasswordNodeComponent.Builder> builderProvider) {
    return new PasswordNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(PasswordNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      PasswordNode instance, Provider<PasswordNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}

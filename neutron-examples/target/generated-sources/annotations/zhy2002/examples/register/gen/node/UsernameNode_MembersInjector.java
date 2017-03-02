package zhy2002.examples.register.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.register.gen.di.UsernameNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UsernameNode_MembersInjector implements MembersInjector<UsernameNode> {
  private final Provider<UsernameNodeComponent.Builder> builderProvider;

  public UsernameNode_MembersInjector(Provider<UsernameNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<UsernameNode> create(
      Provider<UsernameNodeComponent.Builder> builderProvider) {
    return new UsernameNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(UsernameNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      UsernameNode instance, Provider<UsernameNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}

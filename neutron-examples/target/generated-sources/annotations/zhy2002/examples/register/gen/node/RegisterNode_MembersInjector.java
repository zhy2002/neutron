package zhy2002.examples.register.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.register.gen.di.RegisterNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RegisterNode_MembersInjector implements MembersInjector<RegisterNode> {
  private final Provider<RegisterNodeChildProvider> providerProvider;

  private final Provider<RegisterNodeComponent.Builder> builderProvider;

  public RegisterNode_MembersInjector(
      Provider<RegisterNodeChildProvider> providerProvider,
      Provider<RegisterNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<RegisterNode> create(
      Provider<RegisterNodeChildProvider> providerProvider,
      Provider<RegisterNodeComponent.Builder> builderProvider) {
    return new RegisterNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(RegisterNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectReceiveNodeProvider(
      RegisterNode instance, Provider<RegisterNodeChildProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static void injectCreateComponent(
      RegisterNode instance, Provider<RegisterNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}

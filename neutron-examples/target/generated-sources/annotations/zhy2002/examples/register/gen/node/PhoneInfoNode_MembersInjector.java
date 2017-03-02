package zhy2002.examples.register.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.register.gen.di.PhoneInfoNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PhoneInfoNode_MembersInjector implements MembersInjector<PhoneInfoNode> {
  private final Provider<PhoneInfoNodeChildProvider> providerProvider;

  private final Provider<PhoneInfoNodeComponent.Builder> builderProvider;

  public PhoneInfoNode_MembersInjector(
      Provider<PhoneInfoNodeChildProvider> providerProvider,
      Provider<PhoneInfoNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<PhoneInfoNode> create(
      Provider<PhoneInfoNodeChildProvider> providerProvider,
      Provider<PhoneInfoNodeComponent.Builder> builderProvider) {
    return new PhoneInfoNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(PhoneInfoNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectReceiveNodeProvider(
      PhoneInfoNode instance, Provider<PhoneInfoNodeChildProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static void injectCreateComponent(
      PhoneInfoNode instance, Provider<PhoneInfoNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
